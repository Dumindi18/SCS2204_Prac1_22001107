object temp{
    def calculateTemp(t: Double): Double = {
        t * 1.80 + 32
    }
    def main(args: Array[String]): Unit = {
        var tempInC = 35.0
        var tempInF = calculateTemp(tempInC)
        println(s"Temperature in Fahrenheit is ${tempInF}")
    }
}