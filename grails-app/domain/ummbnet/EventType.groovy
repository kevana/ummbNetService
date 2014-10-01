package ummbnet

class EventType {

    String name

    static hasMany = [events: Event]

    static constraints = {
    }
}
