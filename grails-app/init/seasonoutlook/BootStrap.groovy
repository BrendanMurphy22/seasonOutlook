package seasonoutlook

class BootStrap {

    def init = { servletContext ->
        setupData()
    }
    def destroy = {
    }
    def setupData() {
        Team patriots = new Team(
                name: 'Patriots',
                city: 'New England',
        ).save()


        Team chiefs = new Team(
                name: 'Chiefs',
                city: 'Kansas City',
        ).save()

        Stadium arrowHead = new Stadium(
                name: 'Arrowhead Stadium',
                location: 'Kansas City, Missouri',
                architect: 'Charles Deaton',
                surface : 'Latitude 36 Bermuda Grass',
                yearBuilt : Date.parse('yyyy', '1947'),
                capacity: 76416,
                interestingFact: 'something',
                homeTeam: chiefs
        ).save()

        Stadium gillete = new Stadium(
                name: 'Arrowhead Stadium',
                location: 'Kansas City, Missouri',
                architect: 'Charles Deaton',
                surface : 'Latitude 36 Bermuda Grass',
                yearBuilt : Date.parse('yyyy', '1947'),
                capacity: 76416,
                interestingFact: 'something',
                homeTeam: patriots
        ).save()

        Game g1 = new Game(
                date: Date.parse('yyyy', '1947'),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: chiefs,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()

        Season season = new Season(
                name: "2017 Patriots Season",
                startDate: Date.parse('yyyy', '1947'),
                endDate: Date.parse('yyyy', '1947'),
        ).save()
        season.addToGames(g1)

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
