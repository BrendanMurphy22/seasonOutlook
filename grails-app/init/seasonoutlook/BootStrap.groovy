package seasonoutlook

class BootStrap {

    def init = { servletContext ->
        setupData()
        setupUsersAndRoles()
    }
    def destroy = {
    }
    def setupUsersAndRoles() {
        def adminRole = new seasonOutlook.Role(authority: 'ROLE_ADMIN').save()
        def userRole = new seasonOutlook.Role(authority: 'ROLE_USER').save()

        def testUser = new seasonOutlook.User(username: 'tom', password: 'brady').save()

        seasonOutlook.UserRole.create testUser, adminRole

        seasonOutlook.UserRole.withSession {
            it.flush()
            it.clear()
        }
    }
    def setupData() {
        //teams
        Team patriots = new Team(
                name: 'Patriots',
                city: 'New England',
        ).save()
        Team saints = new Team(
                name: 'Saints',
                city: 'New Orleans',
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
        Team falcons = new Team(
                name: 'falcons',
                city: 'Atlanta'
        ).save()
        Team chargers = new Team(
                name: 'Chargers',
                city: 'Los Angeles'
        ).save()
        Team broncos = new Team(
                name: 'Broncos',
                city: 'Denver'
        ).save()
        Team raiders = new Team(
                name: 'Raiders',
                city: 'Oakland'
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
        Stadium mileHigh = new Stadium(
                name: 'Sports Authority Field at Mile High',
                location: 'Denver, Colorado',
                architect: 'HNTB',
                surface : 'Kentucky Bluegrass',
                yearBuilt : Date.parse('yyyy', '2001'),
                capacity: 76125,
                    interestingFact: 'A home game tradition (carried over from the original Mile High Stadium) is the "Incomplete Chant." At Bronco home games, when the opposing team throws an incomplete pass, the stadium announcer will state "Pass thrown by [the opposing quarterback] intended for [the opposing intended receiver] is..." at which time the fans complete the sentence by shouting "IN-COM-PLETE!!"\n' +
                            'The stadium has sold out every Denver Broncos\' home game since its inception in 2001, extending the "sold-out" streak that began during the team\'s tenure at Mile High Stadium, where every home game had been sold out since 1970 (though due to NFL policy, local TV broadcasts of sold-out games did not start until 1973). In a tradition carried over from Mile High Stadium, the stadium\'s public-address announcer will give the final official attendance for the game, including the number of unused tickets; in response, Broncos fans "boo" the no-shows.\n' +
                            'During the stadium\'s first years, in another tradition was carried over from Mile High, Broncos fans on one side of the stadium would chant "Go" and fans on the other side would respond "Broncos," back and forth chanting for several minutes. That tradition has since died out. Another long-term tradition is famed rowdiness of fans seated in the "South Stands," although this tradition has diminished significantly as well.\n' +
                            'Finally, especially in the upper two decks, the fans create their own \'Mile High Thunder\' (and warm themselves) by stamping their feet on the stadium\'s floors. The old Mile High Stadium was built with bare metal, and the \'Thunder\' reverberated readily. The new stadium was built with steel floors to preserve this unique acoustic feature.[15]\n' +
                            'On December 21, 2012, the Broncos announced a $30 million renovation project prior to the start of the 2013 season, including a new high-definition LED video board on the stadium\'s south end zone that triples the size of the old video board.[16]\n' +
                            'In 2013, it was revealed that a Kansas City Chiefs jersey (Neil Smith) was buried somewhere near the 50-yard line by a couple of out-of-state contractors during renovations',
                homeTeam: broncos
        ).save()
        Stadium mexico = new Stadium(
                name: 'Estadio Azteca',
                location: 'Mexico City, Mexico',
                architect: 'Pedro Ramírez Vázquez',
                surface : 'Grass',
                yearBuilt : Date.parse('yyyy', '1966'),
                capacity: 87500,
                interestingFact: 'The Estadio Azteca was designed by architects Pedro Ramírez Vázquez and Rafael Mijares Alcérreca and broke ground in 1961. The inaugural match was between Club América and Torino F.C. on 29 May 1966, with a capacity for 107,494 spectators. The first goal was scored by Brazilian Arlindo Dos Santos and the second one by Brazilian José Alves "Zague"; later, the Italians tied the game, which ended in 2–2 draw. Mexican president Gustavo Díaz Ordaz made the initial kick and FIFA president Sir Stanley Rous was the witness.' + 'Estadio Azteca has also been used for musical performances throughout its history. Michael Jackson (5 sold-out shows in 1993),[14] U2 (in 2006 and 2011), Luis Miguel (in 2002), Elton John, Maná, Juan Gabriel, Gloria Estefan, Jaguares, Lenny Kravitz, *Nsync, Hanson, Ana Gabriel, and The Three Tenors all have become part of the stadium\'s main spectacle. The stadium has also been used for political events, including Mexican president Felipe Calderón\'s campaign closure in 2006, as well as religious events, such as Jehovah\'s Witnesses conventions, and the appearance of Pope John Paul II in 1999.',
                homeTeam: raiders
        ).save()


        //games
        Game g1 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "09/07/17 08:30"),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: chiefs,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g2 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "09/17/17 01:00"),
                stadium: superdome,
                homeTeam: saints,
                awayTeam: patriots,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g3 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "09/24/17 01:00"),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: texans,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g4 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "10/01/17 01:00"),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: panthers,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g5 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "10/05/17 08:25"),
                stadium: raymondJames,
                homeTeam: buccaneers,
                awayTeam: patriots,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g6 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "10/15/17 01:00"),
                stadium: metLife,
                homeTeam: jets,
                awayTeam: patriots,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g7 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "10/22/17 08:30"),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: falcons,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g8 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "10/29/17 01:00"),
                stadium: gillete,
                homeTeam: patriots,
                awayTeam: chargers,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g9 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "10/29/17 08:30"),
                stadium: gillete,
                homeTeam: broncos,
                awayTeam: patriots,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()
        Game g10 = new Game(
                date: Date.parse("MM/dd/yy HH:mm", "10/29/17 08:30"),
                stadium: mexico,
                homeTeam: raiders,
                awayTeam: patriots,
                awayTeamWinRecord: 12,
                homeTeamWinRecord: 2
        ).save()

        //season
        Season season = new Season(
                name: "2017 Patriots Regular Season Schedule",
                startDate: Date.parse("MM/dd/yyyy", "09/07/2017"),
                endDate: Date.parse("MM/dd/yyyy", "12/31/2017"),
        ).save()
        season.addToGames(g1).addToGames(g2).addToGames(g3).addToGames(g4).addToGames(g5).addToGames(g6)
                .addToGames(g7).addToGames(g8).addToGames(g9).addToGames(g10)

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
        Player dannyAmendola = new Player(
                firstName:'Danny',
                lastName:'Amendola',
                position:'WR',
                universityAttended: 'Texas Tech',
                age: 31,
                jerseyNum: 80,
                underContract: true,
                contractVal: 4500000,
                contractEnd: Date.parse('MM/dd/yyyy', '9/21/2018'),
                totalGamesPlayed: 98,
                totalGamesMissed: 7).save()
        Player davidAndrews = new Player(
                firstName:'David',
                lastName:'Andrews',
                position:'C',
                universityAttended: 'Clemson',
                age: 24,
                jerseyNum: 60,
                underContract: true,
                contractVal: 20000,
                contractEnd: Date.parse('MM/dd/yyyy', '9/21/2018'),
                totalGamesPlayed: 31,
                totalGamesMissed: 2).save()
        Player chrisBarker = new Player(
                firstName:'Chris',
                lastName:'Barker',
                position:'OL',
                universityAttended: 'Nevada',
                age: 26,
                jerseyNum: 64,
                underContract: true,
                contractVal: 2000000,
                contractEnd: Date.parse('MM/dd/yyyy', '9/21/2018'),
                totalGamesPlayed: 21,
                totalGamesMissed: 1).save()
        Player trevorBates = new Player(
                firstName:'Trevor',
                lastName:'Bates',
                position:'LB',
                universityAttended: 'Maine',
                age: 23,
                jerseyNum: 44,
                underContract: true,
                contractVal: 120000,
                contractEnd: Date.parse('MM/dd/yyyy', '9/21/2018'),
                totalGamesPlayed: 5,
                totalGamesMissed: 0).save()
        Player brandonBolden = new Player(
                firstName:'Brandon',
                lastName:'Bolden',
                position:'RB',
                universityAttended: 'Mississippi',
                age: 27,
                jerseyNum: 38,
                underContract: true,
                contractVal: 150000,
                contractEnd: Date.parse('MM/dd/yyyy', '9/21/1947'),
                totalGamesPlayed: 101,
                totalGamesMissed: 12).save()
        Player tomBrady  = new Player(
                firstName:'Tom',
                lastName:'Brady',
                position:'QB',
                universityAttended: 'Michigan',
                age: 39,
                jerseyNum: 12,
                underContract: true,
                contractVal: 2000000,
                contractEnd: Date.parse('MM/dd/yyyy', '9/21/1947'),
                totalGamesPlayed: 400,
                totalGamesMissed: 12).save()

        patriots.addToPlayers(ryanAllen).addToPlayers(dannyAmendola).addToPlayers(davidAndrews).addToPlayers(chrisBarker)
                .addToPlayers(trevorBates).addToPlayers(brandonBolden).addToPlayers(tomBrady)
    }
}
