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

            3 -> NumberHandling()

            4-> StringHandling().CheckCharacterType()

            5-> StringHandling().CheckPallindrome()

            6 -> CoordinateGeometry().ArePointsCollinearByArea()

            7 -> SteelGrader().DeterminSteelGrade()

            8 -> Calculator()
        }

    }while(choice!=18)

}
