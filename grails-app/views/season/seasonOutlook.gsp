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
        <g:img dir="images" file="patsSchedule.jpg" class="img-fluid" alt="Responsive image"/>
        <h1>2017 Season Outlook</h1>
    </header>
    <div class="row">
        <div class="col-sm-12 col-md-12">
            <div class="table-responsive">
                <table class="table table-striped" id="myTable">
                    <thead>
                    <th onclick="sortTable(0)">Game Date</th>
                    <th onclick="sortTable(1)">Away Team</th>
                    <th onclick="sortTable(2)">Home Team</th>
                    <th onclick="sortTable(3)">Venue</th>
                    <th onclick="sortTable(4)">Away Team Wins</th>
                    <th onclick="sortTable(5)">Home Team Wins</th>
                    <th onclick="sortTable(6)">Win Probability</th>
                    </thead>
                    <g:each in="${games}" var="game">
                        <tr><td><g:formatDate format="MM/dd/yy HH:mm" date="${game.date}"/>PM</td>
                        <td>${game.awayTeam.city + ' ' + game.awayTeam.name}</td>
                        <td>${game.homeTeam.city + ' ' + game.homeTeam.name}</td>
                        <td>${game.stadium.name}</td>
                        <td>${game.homeTeamWinRecord}</td>
                        <td>${game.awayTeamWinRecord}</td>
                        <td>${game.getProbableWinner()}</td></tr>
                    </g:each>
            </table>
            </div>
        </div>
</div>
</div>
</body>
</html>
