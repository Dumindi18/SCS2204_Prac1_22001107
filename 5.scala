object runTime{
    def calculateTime(pace: Int, distance: Int): Int = {
        pace * distance
    }
    def main(args: Array[String]): Unit = {
        var easyPace = 8
        var tempoPace = 7
        var easyDistance = 4
        var tempoDistance = 3
        var time = calculateTime(easyPace, easyDistance) + calculateTime(tempoPace, tempoDistance)
        println(s"Total running time is ${time} mins.")
    }
}