package TP5_java;
public class AbonnementVideo extends Abonnement {

    private boolean optionHD;
    private boolean option4K;
    
    public AbonnementVideo(String nom, double prixBase, int nbProfils,
                           boolean optionHD, boolean option4K) {
        super(nom, prixBase, nbProfils);   
        this.optionHD  = optionHD;
        this.option4K  = option4K;
    }

    
    public double calculerCoutMensuel() {
        double cout = getPrixBase();       
        if (optionHD)  cout = cout + 10 ;        
        if (option4K)  cout = cout + 20 ;        
        return cout;
    }

    public int calculerScoreSatisfaction() {
        int score = 60;
        if (optionHD) {
        	score = score +  10 ;
        }
        
        if (option4K) {
        	score = score + 20 ;
        }
        if (getNbProfils() >= 4) {
        	score = score + 10;
        }
        if (score > 100) {
        	score = 100;   
        }
        return score;
    }

    
    public void afficherInfos() {
        super.afficherInfos();

        if (optionHD) {
            System.out.println("  Vidéo HD  : Oui");
        } else {
            System.out.println("  Vidéo HD  : Non");
        }

        if (option4K) {
            System.out.println("  Vidéo 4K  : Oui");
        } else {
            System.out.println("  Vidéo 4K  : Non");
        }
    }
}