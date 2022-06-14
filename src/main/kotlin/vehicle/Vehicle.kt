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
    var ourTimeIn: String = ""
    var outTimeOut: String = ""

    //Check if a vehicle is equals to another vehicle
    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }

    override fun hashCode(): Int {
        var result = plate.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }
}