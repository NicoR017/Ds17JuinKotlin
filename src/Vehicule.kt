open class Vehicule {

    var marque: String
    var anneeFrabrication: Int
    var couleur: String

    constructor(marque : String, anneeFabrication:Int, couleur:String)  {
        this.marque=marque
        this.anneeFrabrication = anneeFabrication
        this.couleur = couleur
    }

   open fun afficherDetails() {
        println("marque : $marque")
        println("Année de Frabrication : $anneeFrabrication")
        println("couleur : $couleur")
    }

   open fun klaxonner() {
        println("Tuuut, tuut!")
    }
}