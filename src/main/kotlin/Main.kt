fun main() {
    val amount = 40_000
    val minCommission = 35 * 100
    val commission = if (amount * 0.0075 > minCommission) amount * 0.0075 else minCommission
    println("При переводе: $amount копеек, комиссия составит: $commission копеек")
}