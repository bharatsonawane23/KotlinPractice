package abstractclass

fun main() {
    val car = Car()
    val bike = Bike()
    println(car.getWheelsCount())
    println(bike.getWheelsCount())

    println(getWheelsCount(car))
    println(getWheelsCount(bike))
}

fun getWheelsCount(vehicle: Vehicle): Int {
    return vehicle.getWheelsCount()
}

abstract class Vehicle {
    abstract fun getWheelsCount(): Int
}

class Car : Vehicle() {
    override fun getWheelsCount(): Int {
        return 4
    }

}

class Bike : Vehicle() {
    override fun getWheelsCount(): Int {
        return 2
    }

}