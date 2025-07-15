class Calculator {

    var num1: Double = 0.0
    var num2: Double = 0.0

    fun AcceptNumbers() {
        println("Enter Num 1: ")
        num1 = readLine()?.toDoubleOrNull() ?: 0.0
        println("Enter Num 2: ")
        num2 = readLine()?.toDoubleOrNull() ?: 0.0
    }

    fun Add(): Double
    {
        return num1 + num2
    }

    fun Substract(): Double
    {
        return num1 - num2
    }

    fun Multiply(): Double
    {
        return num1 * num2
    }

    fun Divide(): Double
    {
        if(num2!=0.0)
        {
            return num1/num2
        }
        return 0.0
    }

    init
    {
        var choice: Int?
        do {
            println("Choose Operation: ")
            println("1. Accept Numbers 1 & 2")
            println("2. Add Numbers")
            println("3. Substract Numbers")
            println("4. Multiply Numbers")
            println("5. Divide Numbers")
            println("6. Exit")
            println("Enter your choice: ")
            choice = readLine()?.toIntOrNull()

            when(choice)
            {
                1 -> AcceptNumbers()
                2 -> println(Add())
                3 -> println(Substract())
                4 -> println(Multiply())
                5 -> println(Divide())
                6 ->  break
                else -> println("Please Input A valid option")
            }

        }while(choice!=6)
    }



}