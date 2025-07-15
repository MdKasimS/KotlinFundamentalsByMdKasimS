import kotlin.reflect.typeOf

class StringHandling {

    var InputString : String = ""
    var OutPutString : String = ""
    var character : Char = 'A'
    init {

    }

    fun CheckCharacterType()
    {
        print("Input your character: ")

        character = readLine()!!.firstOrNull()!!.toChar()

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

    fun CheckPallindrome()
    {
        var numberHandler = NumberHandling()

//        println(numberHandler.OutPutNumber)
//        println(numberHandler.ActualNumber)
        if(numberHandler.OutPutNumber.contentEquals(numberHandler.ActualNumber.toString()))
        {
            println("Entered number is palindrome")
        }
        else
        {
            println("Not a palindrome")
        }


    }

}