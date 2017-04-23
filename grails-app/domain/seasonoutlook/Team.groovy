package seasonoutlook

class Team {
    String name
    static hasMany = [players:Player]

    static constraints = {
        name maxSize: 150, blank: false, nullable: false
    }
}
