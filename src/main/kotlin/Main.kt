fun main()
{
    println("Fundamentals Of Kotlin")
    var choice:Int? = 0

    do {
        println("-:Choose One Of The Following Programs To Run:-")
        println("------------------------------------------------")
        print("Enter Your Choice: ")
        choice = readLine()?.toIntOrNull()

        when(choice)
        {
            1-> Salary()

            2-> Distance()

            3 -> NumberHandling()
        }

    }while(choice!=18)

}
