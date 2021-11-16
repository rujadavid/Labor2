import java.io.File
import IDictionary.Companion.dictionaryName


object HashSetDictionary: IDictionary {

    val hashSetDict = HashSet<String>()

    init{
        File(dictionaryName).forEachLine { hashSetDict.add(it) }
    }

    override fun adWord(word: String) {
        hashSetDict.add(word)
    }

    override fun findWord(word: String): Boolean {
        if(hashSetDict.contains(word)){
            return true
        }
        else{
            return false
        }
    }

    override fun getSize(): Int {
        return hashSetDict.size
    }


}