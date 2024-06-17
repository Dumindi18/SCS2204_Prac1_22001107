object bookCost{
    def calculateDiscount(percentage: Double, price: Double): Double = {
        price * percentage / 100
    }

    def calculateCost(cost1: Double, cost2: Double, n: Int,price: Double): Double ={
        (cost1 * 50 + cost2 * (n-50)) + price * n
    }
    def main(args: Array[String]): Unit = {
        var coverPrice = 24.95
        var discount = 40
        var discountedPrice = coverPrice - calculateDiscount(discount, coverPrice)

        var costFor50 = 3
        var costForAdditions = 0.75
        var noOfCopies = 60

        var totCost = calculateCost(costFor50, costForAdditions, noOfCopies, discountedPrice)
        println(s"Total cost for ${noOfCopies} is Rs.${totCost}")
    }
}