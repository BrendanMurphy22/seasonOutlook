<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'season.label', default: 'Season')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<div class="container">
    <header>
        <h1>Patriots 2017 Season Outlook</h1>
    </header>
    <div class="row">
        <div class="col-sm-12 col-md-12">
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                        <th>Date</th>
                        <th>Away Team</th>
                        <th>Home Team</th>
                        <th>Venue</th>
                        <th>Away Team Wins</th>
                        <th>Home Team Wins</th>
                        <th>Win Probability</th>
                    </thead>
                    <g:each in="${games}" var="game">
                        <tr><td><g:formatDate format="MM/dd/yy HH:mm" date="${game.date}"/>PM</td>
                        <td>${game.awayTeam.city + ' ' + game.awayTeam.name}</td>
                        <td>${game.homeTeam.city + ' ' + game.homeTeam.name}</td>
                        <td><a href="/stadium/show/${game.stadium.id}">${game.stadium.name}</ahref></td>
                        <td>${game.homeTeamWinRecord}</td>
                        <td>${game.awayTeamWinRecord}</td>
                        <td>//TODO</td></tr>
                    </g:each>
            </table>
            </div>
        </div>
</div>
</div>
</body>
</html>
