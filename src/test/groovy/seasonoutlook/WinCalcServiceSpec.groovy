package seasonoutlook

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(WinCalcService)
class WinCalcServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test the the winCalcService sets a winning team"() {
        when:
        Team panthers = new Team(
                name: 'Panthers',
                city: 'Carolina',
        ).save()
        Team patriots = new Team(
                name: 'Patriots',
                city: 'New England',
        ).save()
        Stadium gillete = new Stadium(
                name: 'Gillette Stadium',
                location: 'Foxborough, Massachusetts',
                architect: 'HOK Sport',
                surface : 'FieldTurf',
                yearBuilt : Date.parse('yyyy', '2002'),
                capacity: 66829,
                interestingFact: 'The Patriots have sold out every home game ' +
                        'since moving to the stadium—preseason, ' +
                        'regular season, and playoffs. This streak dates back to ' +
                        'the 1994 season, while the team was still at Foxboro Stadium.' +
                        'As of September 11, 2016 this streak was at 231 straight games.',
                homeTeam: patriots
        ).save()
        Game game = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "10/01/17 01:00"),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: panthers,
                awayTeamWinRecord: 4,
                homeTeamWinRecord: 6
        ).save()
            service.setProbableWinner(game)
        then:
            game.probableWinner == "panthers" || "patriots"

    }
}
