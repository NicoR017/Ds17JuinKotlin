class Voiture : Vehicule {
    constructor(marque : String, anneeFabrication:Int, couleur:String) : super (marque , anneeFabrication, couleur)

    override fun klaxonner(){
        println("tuuuuuuuuuuuuuuuuut")
    }

}