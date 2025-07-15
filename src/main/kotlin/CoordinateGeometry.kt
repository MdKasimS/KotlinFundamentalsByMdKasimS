class CoordinateGeometry {
    var x: Double = 0.0
    var y: Double = 0.0
    var Points =  mutableListOf<Point>()

    var x2: Double = 0.0
    var x3: Double = 0.0
    var y2: Double = 0.0
    var y3: Double = 0.0

    fun Get2DPoints()
    {

        println("How many points you want: ")
        var numberOfPoints = readLine()!!.toInt()

        for(i in 1..numberOfPoints)
        {
            println("Enter X for point no.${i} : ")
            x = readLine()?.toDoubleOrNull() ?: 0.00
            println("Enter Y for point no.${i} : ")
            y = readLine()?.toDoubleOrNull() ?: 0.00

            Points.add( Point(x,y))
        }
    }

    fun DisplayPoints() {
        println("Points entered:")
        for ((index, point) in Points.withIndex()) {
            println("Point ${index + 1}: (${point.x}, ${point.y})")
        }
    }

    fun ArePointsCollinearByArea(): Boolean
    {
        Get2DPoints()

        DisplayPoints()
        val area: Double = 0.5 * Math.abs(Points[0].x * (Points[1].y - Points[2].y) + Points[1].x * (Points[2].y - Points[0].y) + Points[2].x * (Points[0].y - Points[1].y))

        if(area==0.0)
        {
            println("Points are collinear")
            return true
        }
        println("Points are non-collinear with area = ${area}")
        return false

    }
}