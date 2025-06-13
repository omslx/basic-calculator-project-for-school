fun calculate(t: List<Int>, x: String): Int {
    var result = 1
    for (i in 1..30)
        print("-")
    if(x.isNotEmpty())
    when (x) {
        "+" -> {result =t[0] + t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
        "-" -> {result =t[0] - t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
        "*" -> {result =t[0] * t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
        "/" -> {result =t[0] / t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
        "%" -> {result =t[0] % t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
    }
    return result
}