package test.elastic

import grails.converters.JSON


class PersonController {

    static allowedMethods = [list: 'GET', search: 'GET']

    def list() {
        render Person.list() as JSON
    }

    def search(String value) {
        render ([result: Person.search(value)?.searchResults?.first()] as JSON)
    }
}
