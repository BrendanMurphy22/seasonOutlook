package seasonoutlook

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class StadiumController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Stadium.list(params), model:[stadiumCount: Stadium.count()]
    }

    @Secured('ROLE_ADMIN')
    def show(Stadium stadium) {
        respond stadium
    }

    def create() {
        respond new Stadium(params)
    }

    @Transactional
    def save(Stadium stadium) {
        if (stadium == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (stadium.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond stadium.errors, view:'create'
            return
        }

        stadium.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'stadium.label', default: 'Stadium'), stadium.id])
                redirect stadium
            }
            '*' { respond stadium, [status: CREATED] }
        }
    }

    def edit(Stadium stadium) {
        respond stadium
    }

    @Transactional
    def update(Stadium stadium) {
        if (stadium == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (stadium.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond stadium.errors, view:'edit'
            return
        }

        stadium.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'stadium.label', default: 'Stadium'), stadium.id])
                redirect stadium
            }
            '*'{ respond stadium, [status: OK] }
        }
    }

    @Transactional
    def delete(Stadium stadium) {

        if (stadium == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        stadium.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'stadium.label', default: 'Stadium'), stadium.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'stadium.label', default: 'Stadium'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
