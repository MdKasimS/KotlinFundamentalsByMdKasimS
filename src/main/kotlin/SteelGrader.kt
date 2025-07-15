class SteelGrader {
    var Hardness: Int = 0
    var Carbon: Double = 0.0
    var Tensile: Int = 0

    fun DeterminSteelGrade()
    {
        println("Enter Hardness : ")
        Hardness = readLine()?.toIntOrNull() ?: 0

        println("Enter Carbon : ")
        Carbon = readLine()?.toDoubleOrNull() ?: 0.0

        println("Enter Hardness : ")
        Tensile = readLine()?.toIntOrNull() ?: 0

        GetSteelGrade()
    }

    fun GetSteelGrade()
    {
        when
        {
            Hardness >= 50 && Carbon <0.7 && Tensile > 5600
            -> println("Grade 10")
            Hardness >= 50 && Carbon <0.7 ->
                println("Grade 9")
            Carbon <0.7 && Tensile > 5600 ->
                println("Grade 8")
            Hardness >= 50 && Tensile > 5600 ->
                println("Grade 7")
            Hardness >= 50 || Carbon <0.7 || Tensile > 5600 ->
                println("Grade 6")
            else ->
                println("Grade 5")

        }

    }
}