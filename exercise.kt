fun main() {
    var n = readln().toInt()
    var answer = "int"
    while(n>0){
        answer = "long ${answer}"
        n -= 4
    }
    println(answer)
}