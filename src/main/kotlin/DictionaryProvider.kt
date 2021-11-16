
object DictionaryProvider {

    fun createDictionary(dictType: DictionaryType): IDictionary{
        when(dictType){
            DictionaryType.ARRAY_LIST -> return ListDictionary
            DictionaryType.TREE_SET -> return TreeSetDictionary
            DictionaryType.HASH_SET -> return HashSetDictionary
        }
    }


}