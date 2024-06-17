object volumeOfSphere{
    def calculateVolume(r : Double): Double = {
        (4/3) * math.Pi * r * r * r
    }
    def main(args: Array[String]): Unit = {
        var radius = 5.0
        var volume = calculateVolume(radius)
        println(s"Volume of a sphere with radius 5.0 is ${volume}")
    }
}