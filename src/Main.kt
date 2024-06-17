

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val garage = Garage()
    val voiture = Voiture("Ford",2004,"Bleu")
    val moto = Moto("KTM",2022,"Noir")
    val camion = camion("Daf", 2010,"Jaune")
    garage.ajouterVehicules(moto)
    garage.ajouterVehicules(voiture)
    garage.ajouterVehicules(camion)
    garage.afficherGarage()

}