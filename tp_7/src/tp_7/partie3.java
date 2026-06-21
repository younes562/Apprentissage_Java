package tp_7;

public class partie3 {
	
	public static double lireMontant(String valeur) throws NumberFormatException, IllegalArgumentException {
	    double montant = Double.parseDouble(valeur);
	    
	    if (montant < 0) {
	        throw new IllegalArgumentException("Le montant ne peut pas être négatif.");
	    }
	    	    
	    return montant;
	}
	
	public static void main(String[] args) {
	    try {
	        double montantRecu = lireMontant("-55"); 
	        System.out.println("Montant converti : " + montantRecu);
	    } 
	    catch (IllegalArgumentException e) {
	        System.out.println("Gestion centralisée dans le main : " + e.getMessage());
	    }
	}

}