package vehicle

enum class TypeVehicle(val type: String, val tax: Int) {
    MOTORCYCLE(type = "motorcycle", tax = 15),
    MINIBUS(type = "minibus", tax = 25),
    BUS(type = "bus", tax = 30),
    CAR(type = "car", tax = 20)

}