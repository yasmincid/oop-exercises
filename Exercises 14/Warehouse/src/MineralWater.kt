open class MineralWater(origin: String, quantityLtrs: Double, price: Double, brand: String) :
    Drinks(quantityLtrs, price, brand) {

    var origin = origin

    override fun getPrice(): Double {
        return super.getPrice()
    }

    override fun showDrinkInformation(): String {
        return super.showDrinkInformation()+ " Origin: "+ this.origin
    }
}
