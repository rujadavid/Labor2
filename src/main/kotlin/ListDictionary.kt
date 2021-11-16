import java.io.File
import IDictionary.Companion.dictionaryName


object ListDictionary: IDictionary {

    val wordsListDict = mutableListOf<String>()

    // beolvasas (konstruktor)
    init{
        File(dictionaryName).forEachLine { wordsListDict.add(it) }
    }

    override fun adWord(word: String) {
        wordsListDict.add(word)
    }

    override fun findWord(word: String): Boolean {
        if(wordsListDict.contains(word)){
            return true
        }
        else{
            return false
        }
    }

    override fun getSize(): Int {
        return wordsListDict.size
    }

}