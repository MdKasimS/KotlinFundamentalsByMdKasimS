fun main()
{
    println("Fundamentals Of Kotlin")
    var choice:Int?
    do {
        println("-:Choose One Of The Following Programs To Run:-")
        println("------------------------------------------------")
        print("Enter Your Choice: ")
        choice = readLine()?.toIntOrNull()

        when(choice)
        {
            1-> Salary()

            2-> Distance()

            3 -> NumberHandling().checkFiveDigitnumber()

            4-> StringHandling().checkCharacterType()

            5-> StringHandling().checkPallindrome()

            6 -> CoordinateGeometry().ArePointsCollinearByArea()

            7 -> SteelGrader().DeterminSteelGrade()

            8 -> Calculator()

            9 -> NumberHandling().calculateFibonacci()

            10 -> StringHandling().printPyramid()

            11 -> NumberHandling().acceptIntegers()

            12 -> NumberHandling().calculateIntelligence()
        }

    }while(choice!=18)

}
