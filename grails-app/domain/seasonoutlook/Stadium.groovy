package seasonoutlook

class Stadium {
    String name
    String location
    String architect
    Date yearBuilt
    Integer capacity

    static constraints = {
        name blank: false, nullable: false
        location blank: false, nullable: false
        architect blank: false, nullable: false
        yearBuilt blank: false, nullable: false
        capacity blank: false, nullable: false
    }
}
