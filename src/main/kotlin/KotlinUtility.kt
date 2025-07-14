import java.text.DecimalFormat

fun Double.toReadableString(): String {
    val formatter = DecimalFormat("#.###############")  // Customize precision
    return formatter.format(this)
}

class KotlinUtility