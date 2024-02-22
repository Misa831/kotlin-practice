fun main(){
    //print a string
    println("Hello world!")

    //print numbers
    print(15*4)
    println()

    //declare a variable of type string
    var myString: String = "Random String"
    println(myString)

    //declaring val means this value is immutable, cannot be changed.
    val pi: Double = 3.14
    println(pi)

    //the compiler can make an inference on type
    var typeTest = 2.6
    print("${typeTest::class.simpleName}")
}
