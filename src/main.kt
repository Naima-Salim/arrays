import java.util.*

fun main() {
    names(arrayOf("Tessa", "Susan", "Saido", "Naima"))
    countries()
    numbers()
    var ppl=people(arrayOf("Cudra","Naima","Tut"))
    println(ppl)

}
fun names(names:Array<String>) {
    println(names.contentToString())
}
fun countries(){
    var cities=arrayOf("harare", "mumbai", "dodoma", "jakarta")
      cities.sortedArray().forEach { Naima->
          println(Naima.capitalize())

      }
}
fun numbers(){
    var numArray = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numArray[1].plus(numArray[4])
    println(sum)
    var index = numArray.indexOf(158)
    println(index)

    var sortedNums = numArray.sortedArray()
    println(sortedNums.contentToString())

}
fun people (names:Array<String>):String {
    var Tessa=names.contentToString()
    return(Tessa)



}



