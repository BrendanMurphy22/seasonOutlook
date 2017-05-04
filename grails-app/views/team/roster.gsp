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
        <h1 class="centered">Patriots 2017 Roster</h1>
    </header>
    <div class="row">
        <div class="col-sm-12 col-md-12">
            <div class="table-responsive">
                <table class="table table-striped" id="myTable">
                    <thead>
                        <th onclick="sortTable(0)">First Name</th>
                        <th onclick="sortTable(1)">Last Name</th>
                        <th onclick="sortTable(2)">Position</th>
                        <th onclick="sortTable(3)">University</th>
                        <th onclick="sortTable(4)">Age</th>
                        <th onclick="sortTable(5)">Jersey Number</th>
                        <th onclick="sortTable(6)">Contract</th>
                        <th onclick="sortTable(7)">Value</th>
                        <th onclick="sortTable(8)">Free Agent on</th>
                        <th onclick="sortTable(9)">Total Games Played</th>
                        <th onclick="sortTable(10)">Total Games Missed</th>
                        <th onclick="sortTable(11)">Average Games Played/Season</th>
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
                            <td><g:formatNumber number="${player.contractVal}" type="currency" currencyCode="USD" /></td>
                            <td><g:formatDate format="MM/dd/yy" date="${player.contractEnd}"/></td>
                            <td>${player.totalGamesPlayed}</td>
                            <td>${player.totalGamesMissed}</td>
                            <td><g:formatNumber number="${player.getAverageGamesPlayed()}" type="number" maxFractionDigits="2" /></td>
                        </tr>
                    </g:each>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>

