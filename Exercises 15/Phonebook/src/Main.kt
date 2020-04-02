import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    var lolo = Contacts("Lolo", "58180260")
    var lola = Contacts("Lola", "58180261")
    var loli = Contacts("Loli", "58180262")
    var lole = Contacts("Lole", "58180263")
    var lulo = Contacts("Lulo", "58180264")
    var lulu = Contacts("Lulu", "58180267")
    var agendal = PhoneBook()
    var agenda2 = PhoneBook(6)
    agenda2.addContact(lolo)
    agenda2.addContact(lola)
    agenda2.addContact(loli)
    agenda2.addContact(lole)
    agenda2.addContact(lulo)
    println(agenda2.containsContact(lulu))
    agenda2.addContact(lulu)
    println(agenda2.containsContact(lulu))
    println(agenda2.findContact("Lulo"))
    agenda2.listContacto()
    println(agenda2.freeSpaces())
    agenda2.fullPhonebook()
    agenda2.deleteContact(lolo)
    println(agenda2.freeSpaces())
    agenda2.fullPhonebook()
    agenda2.listContacto()


    println(agendal.freeSpaces())
    agendal.addContact(lolo)
    println(agendal.findContact("Lolo"))
    agendal.deleteContact(lulu)
    agendal.deleteContact(lolo)

}