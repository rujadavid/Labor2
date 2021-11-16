import java.io.File
import IDictionary.Companion.dictionaryName
import java.util.*


object TreeSetDictionary: IDictionary {

    val treeSetDict = TreeSet<String>()

    // beolvasas (konstruktor)
    init{
        File(dictionaryName).forEachLine { treeSetDict.add(it) }
    }

    override fun adWord(word: String) {
        treeSetDict.add(word)
    }

    override fun findWord(word: String): Boolean {
        if(treeSetDict.contains(word)){
            return true
        }
        else{
            return false
        }
    }

    override fun getSize(): Int {
        return treeSetDict.size
    }



}