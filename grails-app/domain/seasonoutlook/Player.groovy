package seasonoutlook

class Player {
    String firstName
    String lastName
    String position
    String universityAttended
    Integer age
    Integer jerseyNum
    Boolean underContract
    Integer contractVal
    Date contractEnd
    Integer totalGamesPlayed
    Integer totalGamesMissed
    Integer seasonsPlayed

   Team team

    def getAverageGamesPlayed(){
        ((totalGamesPlayed-totalGamesMissed)/seasonsPlayed)
    }

    static constraints = {
        firstName maxSize: 150, blank: false, nullable: false
        lastName blank: false, nullable: false
        position blank: false, nullable: false
        universityAttended blank: false, nullable: true
        age maxSize: 150, blank: false, nullable: false
        jerseyNum  blank: false, nullable: false
        underContract  blank: false, nullable: true
        contractVal  blank: false, nullable: true
        contractEnd  blank: false, nullable: true
        contractEnd  blank: false, nullable: true
        totalGamesPlayed  blank: false, nullable: true
        totalGamesMissed  blank: false, nullable: true
        seasonsPlayed blank: false, nullable: true
    }
}
