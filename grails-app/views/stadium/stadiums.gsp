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
        <h1>Patriots 2017 Battlefields</h1>
    </header>
    <div class="row">
        <div class="col-sm-12 col-md-12">
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <th>Name</th>
                    <th>Location</th>
                    <th>Architect</th>
                    <th>Playing Surface</th>
                    <th>Year Built</th>
                    <th>Capacity</th>
                    <th>Home Team</th>
                    <th>Interesting Fact</th>
                    </thead>
                    <g:each in="${stadiums}" var="stadium">
                        <tr>
                            <td>${stadium.name}</td>
                            <td>${stadium.location}</td>
                            <td>${stadium.architect}</td>
                            <td>${stadium.surface}</td>
                            <td><g:formatDate format="yyyy" date="${stadium.yearBuilt}"/></td>
                            <td>${stadium.capacity}</td>
                            <td>${stadium.homeTeam.name}</td>
                            <td>${stadium.interestingFact}</td>
                        </tr>
                    </g:each>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
