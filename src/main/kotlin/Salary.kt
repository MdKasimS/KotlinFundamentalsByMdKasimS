import kotlin.math.absoluteValue



class Salary {

    val HouseRentAllowance: Int = 20

    val DearnessAllowance: Int = 40

    var BasicSalary: Double = 0.00

    fun GrossSalary(basicSalary:Double):String
    {
        var grossSalary:Double = basicSalary + basicSalary * DearnessAllowance * 0.01
                                  +  basicSalary * HouseRentAllowance * 0.01
        return grossSalary.toReadableString()
    }

    fun GetBasicSalary() {
        print("Enter Your Base Salary: ")
        BasicSalary = readLine()!!.toDouble()
    }

    init
    {
        GetBasicSalary()
        println(GrossSalary(basicSalary = BasicSalary))
    }

}
