package seasonoutlook

class Player {
    String firstName
    String lastName
    String position
    String universityAttended
    Integer age
    Integer jerseyNum
    Integer injuryRate
    Boolean underContract
    Integer contractVal
    Integer contractLength
    Integer totalGamesPlayed
    Integer totalGamesMissed


    static belongsTo = Team

    static constraints = {
        firstName maxSize: 150, blank: false, nullable: false
        lastName blank: false, nullable: false
        position blank: false, nullable: false
        universityAttended blank: false, nullable: true
        age maxSize: 150, blank: false, nullable: false
        jerseyNum  blank: false, nullable: false
        injuryRate  blank: false, nullable: true
        underContract  blank: false, nullable: true
        contractVal  blank: false, nullable: true
        contractLength  blank: false, nullable: true
        totalGamesPlayed  blank: false, nullable: true
        totalGamesMissed  blank: false, nullable: true
    }
}
