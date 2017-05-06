package seasonoutlook

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PlayerController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Player.list(params), model:[playerCount: Player.count()]
    }
    @Secured(['ROLE_ANONYMOUS','ROLE_USER','ROLE_ADMIN'])
    def show(Player player) {
        respond player
    }

    @Secured(['ROLE_USER','ROLE_ADMIN'])
    def create() {
        respond new Player(params)
    }
    @Secured(['ROLE_USER','ROLE_ADMIN'])
    @Transactional
    def save(Player player) {
        if (player == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (player.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond player.errors, view:'create'
            return
        }

        player.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'player.label', default: 'Player'), player.id])
                redirect(uri:'/patriots/roster')
            }
            '*' { respond player, [status: CREATED] }
        }
    }
    @Secured(['ROLE_USER','ROLE_ADMIN'])
    def edit(Player player) {
        respond player
    }
    @Secured(['ROLE_USER','ROLE_ADMIN'])
    @Transactional
    def update(Player player) {
        if (player == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (player.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond player.errors, view:'edit'
            return
        }

        player.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'player.label', default: 'Player'), player.id])
                redirect(uri:'/patriots/roster')
            }
            '*'{ respond player, [status: OK] }
        }
    }
    @Secured(['ROLE_USER','ROLE_ADMIN'])
    @Transactional
    def delete(Player player) {

        if (player == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        player.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'player.label', default: 'Player'), player.id])
                redirect(uri:'/patriots/roster')
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'player.label', default: 'Player'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
