package seasonoutlook

import grails.test.mixin.integration.Integration
import grails.transaction.*

import spock.lang.*
import geb.spock.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
@Rollback
class IntegrationTestSpec extends GebSpec {

    def setup() {
    }

    def cleanup() {
    }

    void "test homepage loads"() {
        when:"The home page is visited"
            go '/'

        then:"The title is correct"
        	title == "2017 Season Outlook"
    }
    void "test login"() {
        when: "The home page is visited"
        go '/login/auth'
        then: "The title is correct"
        title == "Login"
        when: "Complete the login"
        $("#loginForm input[name=username]").value("tom")
        $("#loginForm input[name=password]").value("brady")
        $("#loginForm input[type=submit]").click()

        then: "The title is correct"
        title == "2017 Season Outlook"
    }
    void "test player update"() {
        when: "The home page is visited"
        go '/login/auth'
        then: "The title is correct"
        title == "Login"
        when: "Complete the login"
        $("#loginForm input[name=username]").value("tom")
        $("#loginForm input[name=password]").value("brady")
        $("#loginForm input[type=submit]").click()
        go '/player/edit/8'
        then: "The title is correct"
        title == "Edit Player"

        when: "Update the player"
        $("form input[name=jerseyNum]").value("4")
        $("#submitButton").click()

        then: "The title is correct"
        title == "Patriots Roster"
    }
}
