package sheridan.ahmad.excercise31.Domain

interface coinTossResult {
    fun tossCoin(coinOutcome: String): coinTossOutcome
}