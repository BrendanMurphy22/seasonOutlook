<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'season.label', default: 'Season')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h1>Patriots 2017 Season Outlook</h1>
<a href="/team/roster/1">Patriots Roster</a>
<table>
    <tr>
        <td>Date</td>
        <td>Away Team</td>
        <td>Home Team</td>
        <td>Venue</td>
        <td>Away Team Wins</td>
        <td>Home Team Wins</td>
        <td>Win Probability</td>
    </tr>
    <g:each in="${games}" var="game">
        <tr>
            <td><g:formatDate format="MM/dd/yy HH:mm" date="${game.date}"/>PM</td>
            <td>${game.awayTeam.city + ' ' + game.awayTeam.name}</td>
            <td>${game.homeTeam.city + ' ' + game.homeTeam.name}</td>
            <td><a href="/stadium/show/${game.stadium.id}">${game.stadium.name}</ahref></td>
            <td>${game.homeTeamWinRecord}</td>
            <td>${game.awayTeamWinRecord}</td>
            <td>//TODO</td>
        </tr>
    </g:each>
</table>
</body>
</html>
