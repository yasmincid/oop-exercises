fun main(args: Array<String>) {
    var firstWarehouse = Warehouse()
    var drink = Drinks(1.5, 1.5, "Gatorade")
    var Gdrink = Drinks(1.5, 6.0, "Gatorade")
    var drinkt = Drinks(1.5, 1.3, "pure")
    var mineralW = MineralWater("river", 1.0, 0.7, "Pure")
    var mineralWP = MineralWater("lake", 1.0, 1.3, "Pure")
    var swDrink = SweetDrinks(15.3, true, 4.0, 6.0, "Pure")
    var swDrinkt = SweetDrinks(10.0, false, 4.0, 6.0, "Pure")
    var myDrinkt = Drinks(1.5, 2.6, "pue")
    var myMineralW = MineralWater("river", 1.0, 3.0, "Pure")
    var myMineralWP = MineralWater("lake", 1.0, 2.0, "Pue")
    var myswDrink = SweetDrinks(15.3, true, 4.0, 3.0, "Pure")
    var swDrikit = SweetDrinks(10.0, false, 4.0, 2.5, "Pure")

    firstWarehouse.addDrink(swDrink)
    firstWarehouse.addDrink(drink)
    firstWarehouse.addDrink(drinkt)
    firstWarehouse.addDrink(mineralW)
    firstWarehouse.addDrink(mineralWP)
    firstWarehouse.addDrink(swDrinkt)
    firstWarehouse.addDrink(myDrinkt)
    firstWarehouse.addDrink(myMineralW)
    firstWarehouse.addDrink(myMineralWP)
    firstWarehouse.addDrink(myswDrink)
    firstWarehouse.addDrink(swDrikit)
    firstWarehouse.addDrink(Gdrink)


    println(firstWarehouse.totalPrice("Pure"))
    firstWarehouse.showDrinkInformation()
    println(firstWarehouse.totalPriceShelf(1))
    println(firstWarehouse.totalPriceShelf(2))
    firstWarehouse.removeDrink(drinkt)
}