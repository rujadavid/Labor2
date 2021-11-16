interface IDictionary {

    fun adWord(word: String)
    fun findWord(word: String):Boolean
    fun getSize(): Int

    companion object{val dictionaryName="C:\\DAVID\\SZAMTECH 4\\Android\\Labor2\\src\\main\\resources\\dict.txt"}

}