package tp_7;

public class partie4 {
	
	public static double lireTransaction(double[] transactions, int index) {
	    return transactions[index];
	}
	
	public static void main(String[] args) {
	    double[] mesTransactions = {100.50, 20.0, 55.75};

	    try {
	        double t = lireTransaction(mesTransactions, 10);
	        System.out.println("Transaction lue : " + t);
	    } 
	    catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Erreur : L'index demandé n'existe pas dans la liste des transactions.");
	    } 
	    catch (NullPointerException e) {
	        System.out.println("Erreur : La liste des transactions n'est pas initialisée (null).");
	    }
	}

}