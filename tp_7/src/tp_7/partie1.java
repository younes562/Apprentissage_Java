package tp_7;

public class partie1 {
	
	public static double effectuerPaiement(double montant, double solde) {
		if(montant<=0) {
			throw new IllegalArgumentException("le montant doit etre postive strectement");
		}
		if(montant>solde) {
			throw new ArithmeticException("vous n'avez pas sufesament de solde poour effectuer ce paiment");
		}	
		return solde-montant;
	}
    
	public static void main(String[] args) {
		double solde=2000;
		
		System.out.println("=========================paiment avec manatant negative=========================");		
		try {
			effectuerPaiement(-10,solde);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
	        System.out.println("Fin de la transaction");
	    }
		
		System.out.println("=======================paiment avec manatant superier au solde===========================");		
		try {
			effectuerPaiement(3000,solde);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
	        System.out.println("Fin de la transaction");
	    }
		
		
		System.out.println("=======================paiment valid===========================");		
		try {
			effectuerPaiement(200,solde);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
	        System.out.println("Fin de la transaction");
	    }			
	}
}