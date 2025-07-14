class Distance {

    var DistanceInKm:Double? = 0.0
    var DistanceInFeet: Double? = 0.0
    var DistanceInInch: Double? = 0.0
    var DistanceInCm: Double? = 0.0
    var DistanceInMeters: Double? = 0.0

    init
    {
        print("Enter distance in KM: ")
        DistanceInKm = readLine()!!.toDouble()

        DistanceInMeters = (DistanceInKm ?: 0.0) * 1000
        DistanceInCm = (DistanceInMeters ?: 0.0) * 100
        DistanceInFeet = (DistanceInCm ?: 0.0) * 0.032
        DistanceInInch = (DistanceInFeet ?: 0.0) * 0.3937

        println("Distance in KM:- ${DistanceInKm}")
        println("Distance in M:- ${DistanceInMeters}")
        println("Distance in CM:- ${DistanceInCm}")
        println("Distance in Feet:- ${DistanceInFeet}")
        println("Distance in Inch:- ${DistanceInInch}")

    }

}