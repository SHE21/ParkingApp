## AlkeParking
AlkeParking is a parking lot that allows four types of vehicles (car, motorcycle, minibus and bus)
and has a maximum capacity of up to 20 parked vehicles.

##Project Structure

#### packages

- parking - classes of domain Parking. All classes related to domain Parking
- prompt - classes that implement interaction with terminal.
- util - utility classes and enum classes.
- vehicle - classes of domain Vehicle. All classes related to domain Vehicles.

#### Classes

`parking.Parking`

_public data class_

The _Parking_ class contains all methods and properties that allow to instantiate a parking and its functionalities.

##### properties

`public var vehicles: MutableSet<Vehicle>`

Variable stores a list of vehicles. Must initialize on constructor of class `Parking(vehicles : MutableSet<Vehicle>)`

`private var report: Pair(Int, Int)`

That variable is initialized with values integer numbers. it is used to store data from financial report.

##### methods

`addVehicle(vehicle: Vehicle): Boolean`

That method allows to add a vehicle to the parking lot. The input parameter is a variable type of `Vehicle`. If the operation was a success its return is a boolean type, in that case, it returns true.

`checkOutVehicle(vehicle: Vehicle): Vehicle?`

That method checkout a vehicle from the parking lot (Can indicate the vehicle in the input parameter). When this method is called, other methods are also called. That is necessary because a series of operations are also carried, such as remove a vehicle, calculating fee and discount, verifying if the vehicle exists. The method returns a vehicle type value if the operations were successful, otherwise it returns null.

`listVehicles(): ArrayList`

That method get a list of vehicles, but it returns only the license plate in string type.

`financialReport(): String`

That method returns the financial report. The financial report shows the total number of vehicles removed from the parking lot and the total earnings.

`vehicleAlreadyParked(vehicle: Vehicle): Boolean` _private method_

Allows to check if the vehicle is in the parking lot.

`getVehicleByPlate(plate: String): Vehicle?`

Get a vehicle by license plate, if the vehicle was found the method will return true.

![AlkeParkingDiagramClass](AlkeParkingDiagramClass.png)

## Functionalities
- Add vehicle to the parking lot by entering the license plate number from an Options Menu on the console;
- Inform discount coupon, if any, to reduce the total fare by 15%;
- Remove vehicle from the parking lot and inform the total amount of the fee to be paid;
- List the list of license plates of vehicles that are parked at the moment;
- List the total number of vehicles that were removed from the parking lot;
- List the values received from all vehicles that have been parked.

#### Fees

Each type of vehicle has a specific fixed rate, as shown in the table below:

| Type of vehicles   | Fee |
| ------------------ |----:|
| Car                | $20 |
| Motorcycle         | $15 |
| Minibus            | $25 |
| Bus                | $30 |

After the first 2 hours, there will be a variable rate where you will be charged $5 for every 15 minutes exceeded, regardless of the type of vehicle.

## Developed by:
- Lenilson Santiago (lenilson.santiago@mercadolivre.com)
- Emanuelle Carvalho (emanuelle.carvalho@mercadolivre.com)

Project developed as the first Integrating Exercise of Mercado Livre's IT Bootcamp Mobile Android

