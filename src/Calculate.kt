val calculate = { t: List<Int>, x: String ->
    var result = 0
    for (i in 1..30)
        print("-")
    if(x.isNotEmpty())
    when (x) {
        "+" -> {result =t[0] beezafe t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
        "-" -> {result =t[0] menha t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
        "*" -> {result =t[0] zarb t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
        "/" -> {result =t[0] taghsim t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
        "%" -> {result =t[0] kharjGhesmat t[1] ; println("\nThe response of ${t[0]} $x ${t[1]} = $result")}
    }
}
