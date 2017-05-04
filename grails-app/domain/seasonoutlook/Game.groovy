package seasonoutlook

class Game {
    Date date
    Stadium stadium
    Team homeTeam
    Team awayTeam
    Integer homeTeamWinRecord
    Integer awayTeamWinRecord

    //this function may not be performing as expected, looking to find another solution
    def getProbableWinner() {
        Double d = Math.random()
        if (d < homeTeamWinRecord.toFloat().round(2))
        {
            return homeTeam.name
        }
        else if (d < homeTeamWinRecord.toFloat().round(2))
        {
            return awayTeam.name
        }
    }
    static constraints = {
        date blank: false, nullable: false
        stadium blank: false, nullable: false
        homeTeam blank: false, nullable: false
        awayTeam blank: false, nullable: false
        homeTeamWinRecord blank: false, nullable: false
        awayTeamWinRecord blank: false, nullable: false
    }
}
