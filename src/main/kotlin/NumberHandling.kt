class NumberHandling {

    var InputNumber1: Int = 0
    var OutPutNumber: String = ""
    var ActualNumber: Int = 0
    var numbers = mutableListOf<Int>()

    fun checkFiveDigitnumber() {
        print("Enter the number : ")
        InputNumber1 = readLine()!!.toInt()
        ActualNumber = InputNumber1

        if (InputNumber1.toString().length >= 5) {

            var modulo = 0
            while (InputNumber1 != 0) {
                modulo = InputNumber1 % 10
                OutPutNumber = OutPutNumber + modulo
                InputNumber1 = InputNumber1 / 10
            }
            println("Reverse of the input number : ${OutPutNumber}")
            return
        } else {
            println("Entered number length is less than 5. Please enter valid number again")
            return
        }
    }

    fun acceptIntegers()
    {
        var choice = 1

        do {
            print("Enter Integer : ")
            numbers.add(readLine()!!.toInt())
            print("Want to add more numbers [1.Yes 0.No] : ")
            choice = readLine()!!.toInt()
        }while(choice!=0)

        println("Numbers are : ")
        (0..numbers.count()-1).forEach { i -> print("${numbers.get(i)} ")}

        println()
        printNumbers(true, true)
        println()

    }

    fun printNumbers(isPositive: Boolean, isNegative: Boolean)
    {
        if(isPositive)
        {
            println("All positive numbers: ")
            for(i in numbers)
            {
                if(i>0)
                    print("${i} ")
            }
        }

        if(isNegative)
        {
            println("All negative numbers: ")
            for(i in numbers)
            {
                if(i<0)
                    print("${i} ")
            }
        }
    }

    fun calculateIntelligence()
    {
        var x = 5.5
        var y = 0.0
        for (i in 1..6)
        {
            y = 2 + (i + 0.5 * x)
            x = x + 0.5

            println("${i}. ${x} ${y}")
        }
    }

    fun calculateFibonacci(): Int
    {
        print("Enter the number for factorial calculation : ")
        InputNumber1 = readLine()!!.toInt()

        var firstNumber = 1
        var secondNumber = 0
        var sum = 0

        (1..InputNumber1)
            .forEach { i ->
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