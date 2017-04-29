package seasonoutlook

class Team {
    String name
    String city

    static hasMany = [players:Player]

    static constraints = {
        name maxSize: 150, blank: false, nullable: false
        city blank: false, nullable: false
    }
}
