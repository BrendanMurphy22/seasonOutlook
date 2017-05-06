package seasonoutlook

import grails.transaction.Transactional

@Transactional
class WinCalcService {

    //calculates the probable winner of the game with using a randomly generated number and a bias
    //toward the team that has a greater winning record vs the opponent
    def setProbableWinner(game) {
        Double d = Math.random()
        if (d < game.homeTeamWinRecord.toFloat().round(2))
        {
            game.probableWinner = game.awayTeam.name
        }
        else if (d <game.awayTeamWinRecord.toFloat().round(2))
        {
            game.probableWinner = game.homeTeam.name
        }
    }
}
