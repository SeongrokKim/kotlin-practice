fun main() {
    val x = readln().toInt()
    val n = readln().toInt()
    var tot = 0
    for(var i = 0; i<n; i++){
        val input = readln().split(" ").map{it.toInt()}
        val price = input[0]
        val num = input[1]
        tot += price * num
    }
    if(tot == x){
        println("Yes")
    }
    else{
        println("No")
    }
}