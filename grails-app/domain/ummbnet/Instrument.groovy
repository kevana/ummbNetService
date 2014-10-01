package ummbnet

/**
 * Instrument
 *
 */
class Instrument {

    Long id
    Long version

    // Automatic timestamping from GORM
    Date dateCreated
    Date lastUpdated

    static hasMany = [requests: Request, users: User, groups: Group]

    static constraints = {
    }
}
