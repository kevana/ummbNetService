package ummbnet

class Group {

    String name

    static hasMany = [requests: Request, instruments: Instrument, events: Event, users: User]

    static constraints = {
    }
}
