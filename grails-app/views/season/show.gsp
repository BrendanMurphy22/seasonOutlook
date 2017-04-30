<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'season.label', default: 'Season')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h1>Patriots 2017 Season Outlook</h1>
<table>
    <tr>
        <td>Date</td>
        <td>Home Team</td>
        <td>Away Team</td>
        <td>Venue</td>
        <td>Away Team Wins</td>
        <td>Home Team Wins</td>
    </tr>
    <g:each in="${season.games}" var="game">
        <tr>
            <td><g:formatDate format="MM/dd/yy HH a z" date="${game.date}"/></td>
            <td>${game.homeTeam.name}</td>
            <td>${game.awayTeam.name}</td>
            <td>${game.stadium.name}</td>
            <td>${game.homeTeamWinRecord}</td>
            <td>${game.awayTeamWinRecord}</td>
        </tr>
    </g:each>
</table>
</body>
</html>
