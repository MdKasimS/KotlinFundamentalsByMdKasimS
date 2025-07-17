class StringHandling {

    var inputString : String = ""
    var outPutString : String = ""
    var character : Char = 'A'

    fun checkCharacterType()
    {
        print("Input your character: ")

        character = readLine()!!.first()

        println(character.code)

        if(character.code >= 97 && character.code <= 123)
        {
            println("Character is lower case alphabet")
        }
        else if(character.code in 91..96
            || character.code in 123..127
            || character.code in 32..64)
        {
            println("Character is a special character")
        }
        else
        {
            println("Entered character is upper case alphabet")
        }
    }

    fun checkPallindrome()
    {
        val numberHandler = NumberHandling()

        numberHandler.checkFiveDigitnumber()

        if(numberHandler.OutPutNumber.contentEquals(numberHandler.ActualNumber.toString()))
        {
            println("Entered number is palindrome")
        }
        else
        {
            println("Not a palindrome")
        }
    }

    fun printPyramid()
    {
        print("Enter the maximum number in Pyramid bases: ")
        var rows = readLine()!!.toInt()
        var count = 1
        var edge = rows
        for(i in 1..rows)
        {
            for (j in 1..edge*2) {
                print(" ")
            }

            for(j in 1..i)
            {
                print("${count++}   ")
            }
            --edge
            println()
        }
    }

}