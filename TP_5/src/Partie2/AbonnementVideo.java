package Partie2;
import Parite1.Abonnement;
import Partie3.Reducible;

public class AbonnementVideo extends Abonnement implements Reducible{
   public boolean optionHD;
   public boolean option4k;
   
   public AbonnementVideo(String nom,double prixBase,int nbProfils,boolean optionHD,boolean option4k) {
	   super(nom,prixBase,nbProfils);
	   this.optionHD=optionHD;
	   this.option4k=option4k;
   }
   
   @Override
   public double calculerCoutMensuel() {
	   if(this.optionHD) {
		   double nvPrix=this.getPrixBase()+10;
		   return nvPrix;
	   }else if(this.option4k) {
		   double nvPrix=this.getPrixBase()+20;
		   return nvPrix;
	   }else {
		   return this.getPrixBase();
	   }
   }
   
   @Override
   public int calculerScoreSatisfaction() {
	   int scoreinit=60;
	   if(optionHD) scoreinit+=10;
	   if(option4k) scoreinit+=20;
	   if(getNbProfils()>4) scoreinit+=10;
	   if(scoreinit>10) return 100; else return scoreinit;
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

