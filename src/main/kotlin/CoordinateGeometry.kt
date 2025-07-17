import kotlin.math.sqrt

class CoordinateGeometry {
    var x: Double = 0.0
    var y: Double = 0.0
    var Points = mutableListOf<Point>()

    var x1: Double = 0.0
    var x2: Double = 0.0
    var z1: Double = 0.0
    var x3: Double = 0.0
    var y1: Double = 0.0
    var z2: Double = 0.0
    var y2: Double = 0.0
    var y3: Double = 0.0
    var z3: Double = 0.0

    fun Get2DPoints() {

        println("How many points you want: ")
        var numberOfPoints = readLine()!!.toInt()

        for (i in 1..numberOfPoints) {
            println("Enter X for point no.${i} : ")
            x = readLine()?.toDoubleOrNull() ?: 0.00
            println("Enter Y for point no.${i} : ")
            y = readLine()?.toDoubleOrNull() ?: 0.00

            Points.add(Point(x, y))
        }
    }

    fun displayPoints() {
        println("Points entered:")
        for ((index, point) in Points.withIndex()) {
            println("Point ${index + 1}: (${point.x}, ${point.y})")
        }
    }

    fun arePointsCollinearByArea(): Boolean {
        Get2DPoints()

        displayPoints()
        val area: Double =
            0.5 * Math.abs(Points[0].x * (Points[1].y - Points[2].y) + Points[1].x * (Points[2].y - Points[0].y) + Points[2].x * (Points[0].y - Points[1].y))

        if (area == 0.0) {
            println("Points are collinear")
            return true
        }
        println("Points are non-collinear with area = ${area}")
        return false

    }

    fun calculateAreaOfTriangle(): MutableList<Double> {
        var sideA = arrayListOf<Double>(137.4, 155.2, 149.3, 160.0, 155.6, 149.7)
        var sideB = arrayListOf<Double>(80.9, 92.62, 97.63, 100.25, 68.95, 120.0)

        var angles = arrayListOf<Double>(0.78, 0.89, 1.35, 9.0, 1.25, 1.75)
        var area = mutableListOf<Double>()

        for (i in 0..sideA.count() - 1) {
            var areaCalculated = 0.5 * sideA[i] * sideB[i] * Math.sin(angles[i])
            println(areaCalculated)
            area.add(areaCalculated)
        }
        return area
    }

    fun twoPointsDistanceInPlane(): Double {
        print("Enter x1: ")
        x1 = readLine()!!.toDouble()
        print("Enter y1: ")
        y1 = readLine()!!.toDouble()
        print("Enter x2: ")
        x2 = readLine()!!.toDouble()
        print("Enter y2: ")
        y2 = readLine()!!.toDouble()
        var distance = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
        println(distance)
        return distance
    }

    fun areaOfTriangleIn2D(): Double {
        print("Enter x1: ")
        x1 = readLine()!!.toDouble()
        print("Enter y1: ")
        y1 = readLine()!!.toDouble()
        print("Enter x2: ")
        x2 = readLine()!!.toDouble()
        print("Enter y2: ")
        y2 = readLine()!!.toDouble()
        print("Enter x3: ")
        x3 = readLine()!!.toDouble()
        print("Enter y3: ")
        y3 = readLine()!!.toDouble()

        var area: Double = 0.0

        area = 0.5 * Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)))

        println(area)
        return area
    }

    fun twoPointsDistanceIn3D():Double
    {
        print("Enter x1: ")
        x1 = readLine()!!.toDouble()

        print("Enter y1: ")
        y1 = readLine()!!.toDouble()

        print("Enter z1: ")
        z1 = readLine()!!.toDouble()

        print("Enter x2: ")
        x2 = readLine()!!.toDouble()

        print("Enter z2: ")
        y2 = readLine()!!.toDouble()

        print("Enter x1: ")
        z2 = readLine()!!.toDouble()


        var distance = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2-z1) * (z2-z1))
        println(distance)
        return distance

    }

//    https://www.cbsetuts.com/coordinate-geometry-chapter-wise-important-questions-class-10-mathematics/
}