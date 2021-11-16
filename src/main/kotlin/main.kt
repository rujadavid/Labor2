import DictionaryProvider.createDictionary
import javafx.scene.control.Separator

fun String.monogram() : String{
    return this.split(" ").map{ it[0]}.joinToString { "" }
}

fun List<String>.joining(separator: String) : String{
    return this.joinToString(separator)
}

fun List<String>.longest() : String{
    return this.maxByOrNull { it.length }.toString()
}

fun main(){

    /*
    val dict: IDictionary = ListDictionary
    println("Number of words: ${dict.getSize()}")
    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.findWord(it) }}")
    }
    */

    /*  hiba!!!

    val dict: IDictionary = TreeSetDictionary
    println("Number of words: ${dict.getSize()}")
    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.findWord(it) }}")
    }
    */

    val myName = "Ruja David"
    println("My name monogram: ")
    println(myName.monogram())
    print("\n")

    val lista = mutableListOf<String>("apple", "pear", "melon","longestWord")

    println("The list elements separated by the separator: ")
    println(lista.joining("/"))
    print("\n")

    println("The longest word in the list: ")
    println(lista.longest())
    print("\n")


}