package util

enum class Options(val action:String, val discription: String) {
    ADD_N("ADD_N", "Add new vehicle in the parking"),
    ADD_D("ADD_D", "Add dynamically vehicles in the parking"),
    SHOW_L("SHOW_L", "Show a list vehicles in the parking"),
    CHECK_OUT("CHECK_OUT", "Remove the vehicle from the parking")

}