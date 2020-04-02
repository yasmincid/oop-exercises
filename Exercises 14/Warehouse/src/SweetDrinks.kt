class SweetDrinks(
    sugarPercent: Double,
    promotion: Boolean,
    quantityLtrs: Double,
    price: Double,
    brand: String
) : Drinks(quantityLtrs, price, brand) {
    var sugarPercent = sugarPercent
    var promotion = promotion

    override fun getPrice(): Double {
        if (this.promotion == true)
            return 10 * super.getPrice() / 100
        else
            return super.getPrice()
    }

    override fun showDrinkInformation(): String {
        return super.showDrinkInformation()+ " Sugar Percent: " + this.sugarPercent +" Promotion: "+this.promotion
    }

}