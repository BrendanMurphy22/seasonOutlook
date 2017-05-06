<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'player.label', default: 'Player')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
    <div class="container">
        <div class="row">
            <div class="col-sm-12 col-md-12">
        <div id="edit-player" class="content scaffold-edit" role="main">
            <h1><g:message code="default.edit.label" args="[entityName]" /></h1>
            <g:form resource="${this.player}" method="DELETE">
                <fieldset>
                    <button type="submit"
                            onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');"type="button" class="btn btn-danger">Delete This Player</button>
                </fieldset>
            </g:form>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${this.player}">
            <ul class="errors" role="alert">
                <g:eachError bean="${this.player}" var="error">
                <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                </g:eachError>
            </ul>
            </g:hasErrors>
            <g:form resource="${this.player}" method="PUT">
                <g:hiddenField name="version" value="${this.player?.version}" />
                <fieldset class="form">
                    <f:all bean="player"/>
                </fieldset>
                <fieldset>
                    <button class="btn btn-info" id="submitButton" type="submit">Update</button>
                </fieldset>
            </g:form>
        </div>
            </div>
        </div>
    </div>
    </body>
</html>
