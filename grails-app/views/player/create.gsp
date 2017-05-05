<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'player.label', default: 'Player')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
    <div class="container">
        <div class="row">
            <div class="col-sm-12 col-md-12">
                <div id="create-player" class="content scaffold-create" role="main">
            <h1><g:message code="default.create.label" args="[entityName]" /></h1>
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
            <g:form action="save">
                <fieldset class="form">
                    <f:all bean="player"/>
                </fieldset>
                <fieldset>
                    <button class="btn btn-info" type="submit">Save</button>
                </fieldset>
            </g:form>
        </div>
            </div>
        </div>
    </body>
</html>
