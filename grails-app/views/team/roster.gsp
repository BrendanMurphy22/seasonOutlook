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
        <h1>Patriots 2017 Roster</h1>
    </header>
    <div class="row">
        <div class="col-sm-12 col-md-12">
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Position</th>
                        <th>University</th>
                        <th>Age</th>
                        <th>Jersey Number</th>
                        <th>Contract</th>
                        <th>Value</th>
                        <th>Free Agent</th>
                        <th>Total Games Played</th>
                        <th>Total Games Missed</th>
                        <th>Average Games Played/Season</th>
                    </thead>
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
            </div>
        </div>
    </div>
</div>
</body>
</html>
