package KotlinSamples


    //    Null pointer exception and index out of bound exception

    fun main(args: Array<String>) {
        val S1: String? = null
        val S2 = "Index"
        println(S1!!.length)
        val L_Int = ArrayList<Int>()
        L_Int.add(1)
        L_Int.add(2)
        L_Int.add(3)
        L_Int.add(4)
        println(L_Int[5])
    }
