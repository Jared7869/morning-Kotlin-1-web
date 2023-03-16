fun main(args: Array<String>) {
    var x:Int
    val y:Int

    x = 20
    x = 30
    println(x)

    y = 40
    println(y)
    //Calculating SI of a loan borrowed
    var principle = 10000
    var rate = 2.5
    var time = 5
    var interest = (principle * rate * time) / 100.0
    println("Your interest is$interest")


    //calculating the volume of a cylinder
    var radius = 42
    var pie = 3.142
    var height = 21
    var volume = (pie * radius * radius * height)
    println("Your volume is $volume")
}