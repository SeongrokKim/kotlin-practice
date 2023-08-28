fun main() {
    var input = readln().split(" ").map{it.toInt()}.sorted().reversed()
    var f = input[0]
    var s = input[1]
    var t = input[2]
    if(f != s && s != t){
        println(f*100)
    }
    else if(f == s && s == t){
        println(10000+f*1000)
    }
    else{
        if(f == s && s != t){
            println(1000+f*100)
        } else if(f == t && s != t){
            println(1000+f*100)
        } else{
            println(1000+s*100)
        }
    }
}