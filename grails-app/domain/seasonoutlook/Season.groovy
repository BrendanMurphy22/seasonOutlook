package seasonoutlook

class Season {
    String name
    Date startDate
    Date endDate

    static hasMany = [games:Game]

    static constraints = {
        name maxSize: 150, blank: false, nullable: false
        startDate blank: false, nullable: false
        endDate blank: false, nullable: false
    }
}
