package issue11819

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

    void "test empty list"() {
        when:
        controller.emptyListAsJSON()

        then:
        response.text == '[]'
    }

    void "test populated list"() {
        when:
        controller.listAsJSON()

        then:
        response.text == '[42,"Hello",{"name":"Jeff","town":"STL"}]'
    }
}
