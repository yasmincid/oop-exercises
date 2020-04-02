class Warehouse {
    var drinksList = arrayListOf<Drinks>()
    var count = 0

    /*Funtion add driks to Warehouse*/
    fun addDrink(d: Drinks) {
        d.id = count++
        d.shelf = d.id / 10 + 1
        drinksList.add(d)

    }

    //Calculate the total price of drinks of the same brand

    fun totalPrice(brand: String): Double {
        var totalprice = 0.0
        for (d in drinksList) {
            if (d.brand.equals(brand)) {
                totalprice += d.getPrice()
            }
        }
        return totalprice
    }


    //Remove a drink
    fun removeDrink(d: Drinks) {
        drinksList.remove(d)
    }


    //Show Driks Information
    fun showDrinkInformation() {
        for (drink in drinksList)
            println(drink.showDrinkInformation())
    }

    //Total price by shelf
    fun totalPriceShelf(shelf: Int): Double {
        var totalPrice = 0.0
        for (drink in drinksList) {
            if (drink.shelf == shelf)
                totalPrice += drink.getPrice()
        }
        return totalPrice
    }
}