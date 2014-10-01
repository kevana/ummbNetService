package ummbnet

class User {
    static hasMany = [instruments: Instrument, requests: Request, groups: Group]
    static constraints = {
    }
}
