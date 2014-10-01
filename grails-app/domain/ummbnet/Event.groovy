package ummbnet

class Event {

    EventType eventType
    Group group
    Date date
    Date calltime
    String opponent
    String info

    static hasMany = [requests: Request]

    static constraints = {
    }
}
