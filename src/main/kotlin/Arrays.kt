class Arrays {

    var principalAmounts = mutableListOf<Double>()
    var perYearCompounds = mutableListOf<Double>()
    var years = mutableListOf<Double>()
    var rateOfInterests = mutableListOf<Double>()

    fun acceptValuesInArray(containerArray: MutableList<Double>) : MutableList<Double>
    {
        var choice = 1

        do {
            print("Enter Integer : ")
            containerArray.add(readLine()!!.toDouble())
            print("Want to add more numbers [1.Yes 0.No] : ")
            choice = readLine()!!.toInt()
        }while(choice!=0)

        return containerArray
    }

    fun compoundInterest()
    {
        var entries = 0
        print("Enter number of entries for Compound Interest calculation: ")
        entries = readLine()!!.toInt()

        for(i in 1..entries)
        {
            print("Enter principal amount: ")
            principalAmounts.add(readLine()!!.toDouble())

            print("Enter compound times in a year: ")
            perYearCompounds.add(readLine()!!.toDouble())

            print("Enter years: ")
            years.add(readLine()!!.toDouble())

            print("Enter rate of interest: ")
            rateOfInterests.add(readLine()!!.toDouble())

        }

        for(i in 0..entries-1)
        {
            println(principalAmounts[i] * (1 + (rateOfInterests[i]/perYearCompounds[i])) * years[i] * perYearCompounds[i])
        }
    }

}