<h2>Bootcamp TI Android</h2>
<p>That project is the first deliverable of the Bootcamp TI Android Module Kotlin</p>
<p>Code by: Santiago<code>lenilson.santiago@mercadolivre.com</code> and Emanuelle<code>emanuelle.carvalho@mercadolivre.com </code>
<h3>AlkeParking</h3>
<p>AlkeParking is a parking that allows to park some types of vehicles (car, motorcycles, minibus and bus) . Its maximum capacity is only 20 vehicles. </p>
<h4>The Project Structure</h4>

<h5>packages</h5>
<ul>
    <li><b>parking</b> - classes of domain Parking. All classes related to domain Parking</li>
    <li><b>prompt</b> - classes that implement interaction with terminal.</li>
    <li><b>util</b> - utility classes and enum classes.</li>
    <li><b>vehicle</b> - classes of domain Vehicle. All classes related to domain Vehicles.</li>
</ul>

<h4>Classes</h4>
<code>parking.Parking</code>
<p><i>public data class</i></p>
<p>The <i>Parking</i> class contains all methods and properties that allow to instantiate a parking and its functionalities. </p>
<h5>properties</h5>

<code>public var vehicles: MutableSet&#x0003C;Vehicle&#x0003E;</code>
<p>Variable stores a list of vehicles. Must initialize on constructor of class <code>Parking(vehicles : MutableSet&#x0003C;Vehicle&#x0003E;)</code></p>

<code>private var report: Pair(Int, Int)</code>
<p>That variable is initialized with values integer numbers. it is used to store data from financial report.</p>

<h5>methods</h5>
<code>addVehicle(vehicle: Vehicle): Boolean</code>
<p>That method allows to add a vehicle to the parking lot. The input parameter is a variable type of <code>Vehicle</code>. If the operation was a success its return is a boolean type, in that case, it returns true.</p>

<code>checkOutVehicle(vehicle: Vehicle): Vehicle?</code>
<p>That method checkout a vehicle from the parking lot (Can indicate the vehicle in the input parameter). When this method is called, other methods are also called.
That is necessary because a series of operations are also carried, such as remove a vehicle, calculating fee and discount, verifying if the vehicle exists.
The method returns a vehicle type value if the operations were successful, otherwise it returns null.</p>