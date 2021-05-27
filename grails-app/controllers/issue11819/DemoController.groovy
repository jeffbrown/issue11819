package issue11819

import grails.converters.JSON

class DemoController {

    def emptyListAsJSON() {
        def a = []
        render a as JSON
    }
    def listAsJSON() {
        def a = [42, 'Hello', [name: 'Jeff', town: 'STL']]
        render a as JSON
    }
}
