/*Una agenda de contactos está formada por un conjunto de contactos (Piensa en que tipo puede ser)
Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un tamaño por defecto (10)
*/
/*Create a PhoneBook*/
class PhoneBook {
    var size = 0
    var myContact = arrayListOf<Contacts>()

    constructor() {
        myContact = ArrayList<Contacts>(this.size)
        this.size = 10
    }

    constructor(size: Int) {
        this.myContact = ArrayList(size)
        this.size = size
    }

    /*funtion for add contacts*/
    fun addContact(c: Contacts) {
        myContact.add(c)
    }

    /*Contains contact*/
    fun containsContact(c: Contacts): Boolean {
        var flag = false
        for (contact in myContact) {
            if (contact.name.equals(c.name))
                flag = true
        }
        return flag
    }


    /*listContact(): List the PhoneBook*/

    fun listContacto() {
        for (contact in myContact)
            println(printlnContact(contact))
    }

    fun printlnContact(c: Contacts): String {
        return "Contact :" + c.name + " Mobile: " + c.phoneNumber
    }


    /*findContact(String name): find a contact using his name and show his phone number.*/
    fun findContact(name: String): String {
        var phone = ""
        for (contact in myContact) {
            if (contact.name.equals(name)) {
                phone = contact.phoneNumber
                break
            }
        }
        return phone
    }

    /*deleteContact(Contacto c): Delete a contact and show a confirmation message */
    fun deleteContact(c: Contacts) {
        if (containsContact(c)) {
            myContact.remove(c)
            println("The contact was delete")
        }else{
           println("The contact doesn't exist")
        }
    }

    /*fullPhonebook()*/
    fun fullPhonebook() {
        if (myContact.size < this.size) {
            println("The phonebook has capacity ")
        } else {
            println("The phonebook hasn't capacity")
        }

    }

    /*freeSpaces(): */
    fun freeSpaces(): Int {
        return this.size - myContact.size
    }
}