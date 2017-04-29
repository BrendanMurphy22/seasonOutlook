package seasonoutlook

class Game {
    Date date
    Stadium stadium
    Team homeTeam
    Team awayTeam
    Integer homeTeamWinRecord
    Integer awayTeamWinRecord

    static constraints = {
        date blank: false, nullable: false
        stadium blank: false, nullable: false
        homeTeam blank: false, nullable: false
        awayTeam blank: false, nullable: false
        homeTeamWinRecord blank: false, nullable: false
        awayTeamWinRecord blank: false, nullable: false
    }
}
