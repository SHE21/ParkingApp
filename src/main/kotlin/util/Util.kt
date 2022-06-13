package util

import vehicle.Vehicle
import kotlin.math.ceil
import kotlin.math.roundToInt

    //
    fun calculateFee(timeInMinutes: Int, vehicle: Vehicle): Int {
        val t = ceil(timeInMinutes / 15.0).roundToInt()
        var totalToPaY = ((t * 5) + vehicle.type.tax)
        if (vehicle.discountCard != null){
            val discount = totalToPaY * (Parameters.VALUE_OF_DISCOUNT.value / 100)
            totalToPaY -= discount.toInt()
        }
        return totalToPaY
    }

    //
    fun getIntervalOfTime(timeIn: String, timeOut:String): Long {
        val timeHourIn = timeIn.split(":")[0].toInt() * 3600000 // 1 hour has 3600000 milliseconds
        val timeMinutesIn = timeIn.split(":")[1].toInt() * 60000 // 1 minute has 60000 milliseconds
        val timeInMilliseconds = timeHourIn + timeMinutesIn

        print("TIME IN: $timeInMilliseconds\n")

        val timeHourOut = timeOut.split(":")[0].toInt() * 3600000
        val timeMinutesOut = timeOut.split(":")[1].toInt() * 60000
        val timeOutMilliseconds = timeHourOut + timeMinutesOut

        print("TIME OUT: $timeOutMilliseconds\n")
        print("FINAL ${ timeOutMilliseconds - timeInMilliseconds }\n")

        return (timeOutMilliseconds - timeInMilliseconds).toLong()
    }

    //
    fun getTimeInArrayFormat(timeMilliseconds: Long): Array<Int>{
        val seconds = timeMilliseconds/1000
        val hours = seconds/(60*60)
        val minutes = seconds % ((60*60))/60

        return arrayOf(hours.toInt(), minutes.toInt())
    }

    //
    fun getTimeInMinutesFormat(time: Array<Int>):Int{
        return (time[0] * 60) + (time[1] * 60) / 60
    }