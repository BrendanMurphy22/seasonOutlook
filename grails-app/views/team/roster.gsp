<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'season.label', default: 'Season')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>
<h1>Patriots 2017 Roster</h1>
<a href="/season/seasonOutlook">Season Outlook</a>
<table>
    <tr>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Position</td>
        <td>University</td>
        <td>Age</td>
        <td>Jersey Number</td>
        <td>Contract</td>
        <td>Value</td>
        <td>Free Agent</td>
        <td>Total Games Played</td>
        <td>Total Games Missed</td>
        <td>Average Games Played/Season</td>
    </tr>
    <g:each in="${team.players}" var="player">
        <tr>
            <td>${player.firstName}</td>
            <td>${player.lastName}</td>
            <td>${player.position}</td>
            <td>${player.universityAttended}</td>
            <td>${player.age}</td>
            <td>${player.jerseyNum}</td>
            <td>${player.underContract}</td>
            <td>${player.contractVal}</td>
            <td>${player.contractEnd}</td>
            <td>${player.totalGamesPlayed}</td>
            <td>${player.totalGamesMissed}</td>
            <td>//TODO</td>
        </tr>
    </g:each>
</table>
</body>
</html>
