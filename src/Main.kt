fun main() {
    val input = arrayListOf(0,0)
    for (i in 0..1) {
        print("Please Enter The Number ${i + 1} : ")
        val nulFinder = readln().toIntOrNull() ?: 0
        if (nulFinder != 0)
            input[i] = nulFinder
    }
    val prot: String?
    print("Enter The Protocol : ")
    prot = readln()
    calculate(input, prot)

}