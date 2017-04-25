package seasonoutlook

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Season)
class SeasonSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test validation of nullable objects" () {
        when:
            Season s1 = new Season()
        then:
            !s1.validate()
    }
}
