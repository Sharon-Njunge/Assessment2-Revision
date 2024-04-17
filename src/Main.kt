fun main() {
    removeString("Barnie bakes brown bagels and buns")
    println(sumCountAverage(arrayOf(60,70,80,90,30)))
    calculateVolume(15.0)
    checkString("Sharon")

}

fun removeString(word:String){
    var sentence = word.lowercase().split("b")
    println(sentence)
}
data class Calc(var sum:Int, var count:Int, var average:Double)
    fun sumCountAverage(numbers:Array<Int>):Calc{
        var sum = numbers.sum()
        var count = numbers.count()
        var average = numbers.average()
        var result = Calc(sum,count,average)
        return result
    }

fun calculateVolume(radius:Double){
    val pi = 3.14159
    val num = 4/3
    val vol = pi * num * radius * radius * radius
    println(vol)
}

fun checkString(text:String){
    if (text == text.reversed()){
        println("Is palindrome")
    }else{
        println("Is not palindrome")
    }
}
