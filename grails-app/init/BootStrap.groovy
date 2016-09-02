import test.elastic.Person

class BootStrap {

    def init = { servletContext ->
        new Person(firstName: "Roberto", lastName: "Perez").save(failOnError: true)
        new Person(firstName: "Soren", lastName: "Glasius").save(failOnError: true) //Sorry for avoiding the 'ø'
        new Person(firstName: "Georgina", lastName: "Del Torno").save(failOnError: true)
        new Person(firstName: "Roberto", lastName: "Perez Alcolea").save(failOnError: true)
    }
    def destroy = {
    }
}
