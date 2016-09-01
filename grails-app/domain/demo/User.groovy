package demo

@grails.rest.Resource(uri='/people', formats=['json', 'xml'])
class User {
    String username
    static constraints = {
        username unique: true
    }
}
