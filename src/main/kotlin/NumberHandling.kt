class NumberHandling {

    var InputNumber1:Int = 0
    var OutPutNumber: String = ""
    var ActualNumber :Int = 0


    fun CheckFiveDigitnumber()
    {
        print("Enter the number : ")
        InputNumber1 = readLine()!!.toInt()
        ActualNumber = InputNumber1

        if(InputNumber1.toString().length>=5)
        {

            var modulo: Int = 0
            while (InputNumber1!=0)
            {
                modulo = InputNumber1 % 10
                OutPutNumber = OutPutNumber + modulo
                InputNumber1 = InputNumber1 / 10
            }
            println("Reverse of the input number : ${OutPutNumber}")
        }
        else
        {
            println("Entered number length is less than 5. Please enter valid number again")
        }
    }

    fun CalculateFibonacci(): Int
    {
        print("Enter the number for factorial calculation : ")
        InputNumber1 = readLine()!!.toInt()

        var firstNumber = 1
        var secondNumber = 0
        var sum = 0

        for(i in 1..InputNumber1)
        {
//          println(firstNumber)
            sum = firstNumber + secondNumber
            secondNumber = firstNumber
            firstNumber = sum
        }
//        println(secondNumber)

        println("Fibonacci of ${InputNumber1} is ${secondNumber}")
        return sum
    }
/* Fibonacci
____________
index| F(n) |
------------|
0    |  0   |
1    |  1   |
2    |  1   |
3    |  2   |
4    |  3   |
5    |  5   |
6    |  8   |
------------
*/
}