package seasonoutlook

import grails.transaction.Transactional

@Transactional
class WinCalcService {

    //randomly selects the probable winner of the game with using a generated number and a bias
    //toward the team that has a greater winning record vs the opponent
    def setProbableWinner(game) {
        Double d = Math.random()
        if (d < game.homeTeamWinRecord.toFloat().round(2))
        {
            game.probableWinner = game.homeTeam.name
        }
        else if (d <game.awayTeamWinRecord.toFloat().round(2))
        {
            game.probableWinner = game.awayTeam.name
        }
    }
}
