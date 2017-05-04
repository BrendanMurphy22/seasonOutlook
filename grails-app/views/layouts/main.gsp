<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:javascript src="jquery-2.2.0.min.js"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
    <asset:stylesheet src="bootstrap.css"/>
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="bootstrap.js"/>
    <g:layoutHead/>
</head>
<body>

<nav class="navbar navbar-inverse" id="site-nav">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand hidden-md hidden-lg" href="#"><g:layoutTitle/></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/season/seasonOutlook">Schedule</a></li>
                <li><a href="/patriots/roster">Roster</a></li>
                <li><a href="/nfl/stadiums">NFL Stadiums</a></li>
            </ul>
            <sec:ifLoggedIn>
                <p class="navbar-text navbar-right">Signed in as <a href="#" class="navbar-link">
                    <sec:loggedInUserInfo field='username'/></a>
                <form class="navbar-text navbar-right" name="logout" method="POST" action="${createLink(controller:'logout') }">
                    <input id="logOutbutton" type="submit" value="logout"></form></p>
            </sec:ifLoggedIn>
            <sec:ifNotLoggedIn>
                <p class="navbar-text navbar-right"><g:link controller='login' action='auth'>Login</g:link></button></p>
            </sec:ifNotLoggedIn>
        </div>
    </div>
</nav>

<g:layoutBody/>


<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>
<asset:javascript src="tableSort.js"/>
<asset:javascript src="application.js"/>

</body>
</html>
