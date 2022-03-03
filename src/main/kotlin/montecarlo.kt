import java.util.Scanner

fun f(x:Double, y:Double) = x*x + y*y - 1


fun main(){

    var n =0
    var N:Long=0

    println("How many times you want to run the simulation ?")

    val scanner = Scanner(System.`in`)

    val iteration = scanner.nextLong()

    while(N < iteration){
        print("n = $n , N = $N \t")

        val x = Math.random()
        val y = Math.random()

        if(f(x, y) <= 0){
            // accepted
            print("(x, y) = ($x, $y) \t")
            println("f(x, y) = ${f(x,y)} <= 0 (accepted)")
            n += 1
            N += 1
        }else{
            print("(x, y) = ($x, $y) \t")
            println("f(x, y) = ${f(x,y)} > 0 (rejected)")
            N += 1
        }

    }

    println((4.0 * n) / N)

}
