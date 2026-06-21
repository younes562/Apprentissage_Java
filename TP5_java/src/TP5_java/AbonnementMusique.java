package TP5_java;
public class AbonnementMusique extends Abonnement {

    private int     nbPlaylists;
    private boolean optionOffline;

    public AbonnementMusique(String nom, double prixBase, int nbProfils,
            int nbPlaylists, boolean optionOffline) {
      super(nom, prixBase, nbProfils);
      this.nbPlaylists = nbPlaylists;
      this.optionOffline = optionOffline;
   }

    public double calculerCoutMensuel() {
        double cout = getPrixBase();
        if (nbPlaylists > 5) {
        	cout = cout + 5 ;    
        }
        if (optionOffline) {
        	cout = cout + 15 ;  
        }
        return cout;
    }

    public int calculerScoreSatisfaction() {
        int score = 55 ;
        score  = score + Math.min( nbPlaylists * 2 , 20) ;   
        if (optionOffline) score = score + 15 ;
        if (score > 100)   score = 100;
        return score;
    }
    }