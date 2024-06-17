class Garage {
    private val vehicules =  mutableListOf<Vehicule>()

    fun ajouterVehicules(vehicule: Vehicule){
        vehicules.add(vehicule)
    }

    fun afficherGarage(){
        println("dans le Garage il y a :")
        println("   ")
        for (vehicule in vehicules){
            println("Marque : ${vehicule.marque}")
            println("Année de Frabrication : ${vehicule.anneeFrabrication}")
            println("couleur : ${vehicule.couleur}")
            println("Les Klaxons est: ")
            vehicule.klaxonner()
            println("   ")
            // ceci un commentaire
        }
    }
}