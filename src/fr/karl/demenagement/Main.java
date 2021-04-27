package fr.karl.demenagement;

public class Main {

	public static void main(String[] args) {
		int nbCartonLocal1 = 34;
		int nbCartonLocal2 = 0;
		int nbCartonCamion = 0;
		int nbCapaciteCamion = 9;

		while (nbCartonLocal1 > 0) {
			while (nbCartonCamion < nbCapaciteCamion && nbCartonLocal1 > 0) {
				nbCartonLocal1 = nbCartonLocal1 - 1;
				nbCartonCamion = nbCartonCamion + 1;
			}
			System.out.println("Un voyage de " + nbCartonCamion + " cartons");
			while (nbCartonCamion > 0) {
				nbCartonCamion = nbCartonCamion - 1;
				nbCartonLocal2 = nbCartonLocal2 + 1;
			}
			System.out.println("Le camion repart au local 1");
		}
	}
}