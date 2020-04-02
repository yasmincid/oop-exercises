open class Drinks(quantityLtrs: Double, price: Double, brand: String) {

    var id = 0
    var quantityLtrs = quantityLtrs
    private var price = price
    var brand = brand
    var shelf = 0


    open fun getPrice(): Double {
        return this.price
    }

    open fun showDrinkInformation(): String {
        return "Id: " + this.id + "Quantity Liters: " + this.quantityLtrs + " Price: " + getPrice() + " Brand: " + this.brand +
                " Shelf: " + this.shelf
    }

}