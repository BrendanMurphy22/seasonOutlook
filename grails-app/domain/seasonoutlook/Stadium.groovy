package seasonoutlook

class Stadium {
    String name
    String location
    String architect
    Date yearBuilt
    Integer capacity
    Team homeTeam
    String interestingFact

    static constraints = {
        name blank: false, nullable: false
        location blank: false, nullable: false
        architect blank: false, nullable: false
        yearBuilt blank: false, nullable: false
        capacity blank: false, nullable: false
        homeTeam blank: false, nullable: false
        interestingFact blank: false, nullable: false
    }

    static mapping = {
        interestingFact type: 'text'
    }
}
