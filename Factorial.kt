fun main() 
{
   val num = 5
   println("Factorial of a number $num is ${Factorial.calculateFactorial(num)}")
}

class Factorial{
    
    companion object {
        @JvmStatic
        fun calculateFactorial(n:Int):Long{
            return if(n==0 || n==1) // base case 
            {
                1
            }
            
            else{
                n.toLong() * calculateFactorial(n-1)
            }
        }
    }
}
/*Output : Factorial of a number 5 is 120 */
