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

            6 -> CoordinateGeometry().arePointsCollinearByArea()

            7 -> SteelGrader().DeterminSteelGrade()

            8 -> Calculator()

            9 -> NumberHandling().calculateFibonacci()

            10 -> StringHandling().printPyramid()

            11 -> NumberHandling().acceptIntegers()

            12 -> NumberHandling().calculateIntelligence()

            13 -> Arrays().compoundInterest()

            14 -> CoordinateGeometry().calculateAreaOfTriangle()

            15 -> NumberHandling().checkLeapYear()

            16 -> NumberHandling().rotateNumbers()

            17 -> CoordinateGeometry().areaOfTriangleIn2D()

            18 -> CoordinateGeometry().twoPointsDistanceInPlane()
        }

    }while(choice!=19)

}
