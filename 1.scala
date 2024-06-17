object areaOfDisk{
    def calculateArea(radius : Double): Double = {
        math.Pi * radius * radius
    }
    def main(args: Array[String]): Unit = {
        var r = 5.0
        var area = calculateArea(r)
        println(s"Area of a disk with radius 5.0 is ${area}")
    }
}