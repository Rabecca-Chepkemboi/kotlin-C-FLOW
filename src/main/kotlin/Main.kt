import org.w3c.dom.Text


fun main() {
    ageClassifier(5)
    ageClassifier(14)
    ageClassifier(23)

    ages(1)
    ages(4)
    ages(16)
    ages(24)

    countries("Ghana")
    countries("Wales")
    countries("Rwandese")
    countries("Portugal")


    numbers(arrayOf(12, 33, 45, 44, 56))

    language(arrayOf("kiswahili", "english", "french", "kinyarwanda", "luganda", "zulu"))

//    var det = sumDecimal(arrayOf(2.2, "kotlin", 12.1f, 34, 3.1))
//    println(det)


//    val arr = arrayOf(1, 2.5, "3.7", "not a number", 4.2f, "5.1")
    val sum = sumDecimalElements( arrayOf(1, 2.5, "3.7", "not a number", 4.2f, "5.1"))
    println("Sum of decimal elements: $sum")




}

fun language(names: Array<String>){
    for (lang in names){
        println("I can speak $lang")
    }
}

fun ageClassifier(age: Int){
    if(age in 13..19){
        println("you are a teenager")
    }
    else{
        println("you are not a teenager")
    }
}

fun ages(age: Int){
    when (age){
        in 0..3 -> println("baby")
        in 2..5 -> println("todler")
        in 6..17 -> println("child")
        else -> println("adult")
    }
}

//write a function that takes in a string in a country and prints out the coresponding
//nationality for the following countries rwanda, ghana, portugal,wales

fun countries( nationality: String){
    when (nationality){
        "Rwandese" -> println("have you ever been to saturday")
        "Ghana" -> println("have you ever been to monday")
        "Portugal" -> println("have you ever been to sunday")
        "Wales" -> println("have you ever been to tuesday")
        else -> println("Have tou ever been to days of the week")
    }

}

//write a function that takes in an array of random integers and print
//out whether each is odd or even

fun numbers(number: Array<Int>){
    for (num in number) {

        if (num % 2 == 0) {
            println("even")
        }
        else {
            println("odd")
        }
    }
}

//write a function that takes in an array of mixed
//types and returns the sum of the decimal elements only

fun sumDecimalElements(arr: Array<Any>): Double {
    var sum = 0.0
    for (element in arr) {
        if (element is Double || element is Float) {
            sum += element as Double
        } else if (element is String) {
            try {
                sum += element.toDouble()
            } catch (e: NumberFormatException) {
                // ignore non-decimal strings
            }
        }
    }
    return sum
}