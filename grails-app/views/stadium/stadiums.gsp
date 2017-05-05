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
        <h1 class="centered">Patriots 2017 Battlefields</h1>
    </header>
    <div class="row">
        <div class="col-sm-12 col-md-12">
            <div class="table-responsive">
                <table class="table table-striped" id="myTable">
                    <thead>
                    <th onclick="sortTable(0)">Name</th>
                    <th onclick="sortTable(1)">Location</th>
                    <th onclick="sortTable(2)">Architect</th>
                    <th onclick="sortTable(3)">Playing Surface</th>
                    <th onclick="sortTable(4)">Year Opened</th>
                    <th onclick="sortTable(5)">Capacity</th>
                    <th onclick="sortTable(6)">Home Team</th>
                    <th onclick="sortTable(7)">Interesting Fact</th>
                    </thead>
                    <g:each in="${stadiums}" var="stadium">
                        <tr>
                            <td>${stadium.name}</td>
                            <td>${stadium.location}</td>
                            <td>${stadium.architect}</td>
                            <td>${stadium.surface}</td>
                            <td><g:formatDate format="yyyy" date="${stadium.yearBuilt}"/></td>
                            <td><g:formatNumber number="${stadium.capacity}" format="##,###" /></td>
                            <td>${stadium.homeTeam.name}</td>
                            <!-- Button trigger modal -->
                            <td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#stadium${stadium.id}">
                                ${stadium.name}
                            </button>
                            <g:render template="modalPop" model="[stadium:stadium]" /></td>
                            </div>
                        </tr>
                    </g:each>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>
