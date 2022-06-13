package vehicle

public enum class TypeVehicle(val type: String, val tax: Int) {
    MOTO(type = "moto", tax = 15),
    MINIBUS(type = "minibus", tax = 25),
    BUS(type = "bus", tax = 30),
    CAR(type = "car", tax = 20),;

}