package vehicle

import java.util.Calendar
import java.util.Calendar.*

data class Vehicle(
    var plate: String,
    val type: TypeVehicle,
    var discountCard: String? = null,
    val checkIn: Calendar = getInstance()
) {

    val parkedTime: Long
        get() = (getInstance().timeInMillis - checkIn.timeInMillis) / MILLISECOND

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Vehicle

        if (plate != other.plate) return false

        return true
    }

    override fun hashCode(): Int {
        return plate.hashCode()
    }

    //Check if a vehicle is equals to another vehicle

}