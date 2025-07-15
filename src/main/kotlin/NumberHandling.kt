class NumberHandling {

    var InputNumber1:Int = 0
    var OutPutNumber: String = ""
    var ActualNumber :Int = 0
    init {
        CheckFiveDigitnumber()
    }

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


}