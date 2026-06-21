package Partie2;
import Parite1.Abonnement;
import Partie3.Reducible;

public class AbonnementMusique extends Abonnement implements Reducible{
	public int nbPlaylists;
	public boolean optionOffline;
	
	public AbonnementMusique(String nom,double prixBase,int nbProfils,int nbPlaylists,boolean optionOffline) {
		super(nom,prixBase,nbProfils);
		this.nbPlaylists=nbPlaylists;
		this.optionOffline=optionOffline;
	}
	
	public double calculerCoutMensuel() {
		if(optionOffline) {
			return getPrixBase()+15;
		}else {
			return getPrixBase();
		}
	}
	
	@Override
	public int calculerScoreSatisfaction() {
		int scorinit=50;
		if(nbPlaylists>20) scorinit+=20;
		if(optionOffline)scorinit+=20;
		if(this.getNbProfils()>1) scorinit+=10;
		if(scorinit>100) return 100;else return scorinit;
	}
	
	@Override
	   public boolean EstEligibleReduction(double pourcentage) {
		   if(pourcentage<=30) return true;return false;
	   }
	   
	   @Override
	   public double AppliquerReduction(double pourcentage) {
		   if (EstEligibleReduction(pourcentage)) {
			   double nvprix=getPrixBase()-getPrixBase()*(pourcentage/100);
			   return nvprix;
		   }
		   System.out.println("le pourcentage de reduction n'est pas accepter");
		   return getPrixBase();
	   }
}


