package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		
        String[] villes = {"Cassis", "Bandol", "Sanary-sur-Mer", "Cerbère", "Cucuron"};
        
        System.out.println("*******Villes du sud de la France (avant modification):");
        for (String ville : villes) {
            System.out.print(ville);
            System.out.print(" | ");
        }
        System.out.println("\n-------------------------------------------------------");
        
        villes[3] = "Reims";
        System.out.println("*******Villes du sud de la France (apres modification:");
        for (String ville : villes) {
        	System.out.print(ville);
            System.out.print(" | ");
        }
        System.out.println("\n-------------------------------------------------------");
        
        System.out.println("longueur du tableau: " + villes.length);
	}

}
