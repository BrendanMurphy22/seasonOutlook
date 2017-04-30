package seasonoutlook

class BootStrap {

    def init = { servletContext ->
        setupData()
    }
    def destroy = {
    }
    def setupData() {
        //teams
        Team patriots = new Team(
                name: 'Patriots',
                city: 'New England',
        ).save()
        Team saints = new Team(
                name: 'Saints',
                city: 'New orleans',
        ).save()
        Team chiefs = new Team(
                name: 'Chiefs',
                city: 'Kansas City',
        ).save()
        Team texans = new Team(
                name: 'Texans',
                city: 'Houston',
        ).save()
        Team panthers = new Team(
                name: 'Panthers',
                city: 'Carolina',
        ).save()
        Team buccaneers = new Team(
                name: 'Buccaneers',
                city: 'Tampa Bay',
        ).save()
        Team jets = new Team(
                name: 'Jets',
                city: 'New York'
        ).save()


        //stadiums
        Stadium arrowHead = new Stadium(
                name: 'Arrowhead Stadium',
                location: 'Kansas City, Missouri',
                architect: 'Kivett and Myers',
                surface : 'Latitude 36 Bermuda Grass',
                yearBuilt : Date.parse('yyyy', '1972'),
                capacity: 76416,
                interestingFact: 'The loudest crowd roar at a sports stadium is 142.2 dbA and ' +
                        'was achieved by fans of the Kansas City Chiefs (USA), ' +
                        'at Arrowhead Stadium in Kansas City, Missouri, USA, on 29 September 2014.\n' +
                        '\n' +
                        'The roar was recorded with 8 seconds remaining in the first quarter. ' +
                        'The Chiefs defeated the New England Patriots 41-14.',
                homeTeam: chiefs
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
        Stadium superdome = new Stadium(
                name: 'Mercedes-Benz Superdome',
                location: 'New Orleans, Louisiana',
                architect: 'Curtis and Davis',
                surface : 'UBU Speed Series S5-M Synthetic Turf',
                yearBuilt : Date.parse('yyyy', '1975'),
                capacity: 76468,
                interestingFact: 'Since the Superdome\'s reopening in the wake of Hurricane Katrina ' +
                        'and the increased success of the New Orleans Saints, the Superdome ' +
                        'has developed a reputation for having a very strong home field advantage. ' +
                        'While all domed stadiums possess this quality to some degree, the Superdome is ' +
                        'known to get extremely loud during games, especially during offensive ' +
                        'drives by the visiting team.\n' +
                        'During a pregame interview before the Minnesota Vikings\' opening game of the ' +
                        '2010 NFL season against the Saints, Brett Favre, reflecting on the Vikings\' ' +
                        'loss to the Saints in the 2009–10 NFC Championship Game, said of the Superdome: ' +
                        '"That was, by far, the most hostile environment I\'ve ever been in. You couldn\'t ' +
                        'hear anything." It was during that loss that some of the Vikings players elected to wear ' +
                        'earplugs, including Favre. It was the first game of the season that they had chosen to do so',
                homeTeam: saints
        ).save()
        Stadium raymondJames = new Stadium(
                name: 'Raymond James Stadium',
                location: 'Tampa, Florida',
                architect: 'Populous',
                surface : 'Tifway 419 Bermuda',
                yearBuilt : Date.parse('yyyy', '1998'),
                capacity: 65890,
                interestingFact: 'One of the most recognizable features of the stadium ' +
                        'is a 103-foot (31 m), 43-ton steel-and-concrete replica pirate ship, ' +
                        'which fires replica cannons each time the Bucs score points or enter the other ' +
                        'team\'s red zone. The cannon fires once for each point scored. In addition, when the ' +
                        'Buccaneers enter their opponent\'s red zone, stadium hosts hoist team flags ' +
                        'around the perimeter of the upper deck. During various times throughout the game, ' +
                        'the song "Yo Ho (A Pirate\'s Life for Me)" is played on the stadium public ' +
                        'address system (taken from Pirates of the Caribbean), which signals patrons on ' +
                        'board the ship to throw beads, t–shirts, and other free prizes to the people below. ' +
                        'The segment is also known as a "Mini Gasparilla" to most fans. An animated parrot sits ' +
                        'on the stern of the pirate ship. Controlled by radio and remote control, the parrot picks ' +
                        'fans out of the crowd and talks to those passing by',
                homeTeam: buccaneers
        ).save()
        Stadium metLife = new Stadium(
                name: 'MetLife Stadium',
                location: 'East Rutherford, New Jersey',
                architect: '360 Architecture',
                surface : 'UBU Speed Series S5-M',
                yearBuilt : Date.parse('yyyy', '2010'),
                capacity: 82500,
                interestingFact: 'Front row 50 yard line seats are 46 feet (14 m) away from the sideline, ' +
                        'which is the shortest distance of all NFL stadiums. To change the field decorations, ' +
                        'two 4-person crews take appx. 18 hours using forklifts and other machinery to remove ' +
                        'the 40 sections of FieldTurf which make up the teams\' respective endzones. ' +
                        'Unlike most NFL stadiums, the NFL\'s logo is painted at midfield, instead of the logo of ' +
                        'one of the teams, also shortening the transition time. The replaceable team logos at ' +
                        'midfield were removed in August 2010, after Domenik Hixon tore his anterior cruciate ' +
                        'ligament at a practice at the stadium during training camp.',
                homeTeam: jets
        ).save()


        //games
        Game g1 = new Game(
                date: Date.parse("MM/dd/yyyy", "9/07/2017"),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: chiefs,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g2 = new Game(
                date: Date.parse("MM/dd/yyyy", "9/17/2017"),
                stadium: superdome,
                homeTeam: saints,
                awayTeam: patriots,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g3 = new Game(
                date: Date.parse("MM/dd/yyyy", "9/24/2017"),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: texans,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g4 = new Game(
                date: Date.parse("MM/dd/yyyy", "10/01/2017"),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: panthers,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g5 = new Game(
                date: Date.parse("MM/dd/yyyy", "10/05/2017"),
                stadium: raymondJames,
                homeTeam: buccaneers,
                awayTeam: patriots,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g6 = new Game(
                date: Date.parse("MM/dd/yyyy", "10/15/2017"),
                stadium: raymondJames,
                homeTeam: jets,
                awayTeam: patriots,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()

        //season
        Season season = new Season(
                name: "2017 Patriots Season",
                startDate: Date.parse('yyyy', '1947'),
                endDate: Date.parse('yyyy', '1947'),
        ).save()
        season.addToGames(g1).addToGames(g2).addToGames(g3).addToGames(g4).addToGames(g5).addToGames(g6)

        //players
        Player ryanAllen = new Player(
                firstName:'Ryan',
                lastName:'Allen',
                position:'P',
                universityAttended: 'Clemson',
                age: 27,
                jerseyNum: 6,
                underContract: true,
                contractVal: 2000000,
                contractEnd: Date.parse('MM/dd/yyyy', '9/21/1947'),
                totalGamesPlayed: 101,
                totalGamesMissed: 12).save()
        patriots.addToPlayers(ryanAllen)
    }
}
