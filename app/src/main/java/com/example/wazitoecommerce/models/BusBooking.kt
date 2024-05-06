package com.example.wazitoecommerce.models
class BusBooking {
    var name:String = ""
    var destination:String = ""
    var fare:String = ""
    var imageUrl:String = ""
    var id:String = ""

    constructor(name: String, destination: String, fare: String, imageUrl: String, id: String) {
        this.name = name
        this.destination = destination
        this.fare = fare
        this.imageUrl = imageUrl
        this.id = id
    }

    constructor()
}