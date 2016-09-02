package test.elastic

class Person {
    String firstName
    String lastName
    Date dateCreated
    Date lastUpdated

    static constraints = {
        firstName blank: false
        lastName blank: false
    }

    static searchable = {
        only = ['firstName', 'lastName']
    }
}
