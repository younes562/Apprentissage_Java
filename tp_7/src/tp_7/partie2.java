package tp_7;

public class partie2 {
	public static double lireMontant(String valeur) {
	    try {
	        double montant = Double.parseDouble(valeur);
	        
	        if (montant < 0) {
	            throw new IllegalArgumentException("Le montant ne peut pas être négatif.");
	        }
	        
	        return montant;
	    } 
	    catch (NumberFormatException e) {
	        System.out.println("La valeur n'est pas un nombre");
	        return 0.0; 
	    } 
	    catch (IllegalArgumentException e) {
	        System.out.println("Erreur : " + e.getMessage());
	        return 0.0;
	    }
	}
	
	public static void main(String[] args) {
		
		System.out.println("cas montant negative");
		String montant1="-1000";
		lireMontant(montant1);
		
		System.out.println("cas montant pas un nombre");
		String montant2="-1r000";
		lireMontant(montant2);
		
		System.out.println("cas valide");
		String montant3="3000";
		lireMontant(montant3);

	}
}