package Partie2;
import Parite1.Abonnement;
public class AbonnementJeux extends Abonnement{
	public int nbJeuxInclus;
	public int heuresJeuParMois;
	
	public AbonnementJeux(String nom,double prixBase,int nbProfils ,int nbJeuxInclus,int heuresJeuParMois) {
		super(nom,prixBase,nbProfils);
		this.nbJeuxInclus=nbJeuxInclus;
		this.heuresJeuParMois=heuresJeuParMois;
	}

	
	public double calculerCoutMensuel() {
		double nvPrix=this.getPrixBase();
		if(nbJeuxInclus>50) nvPrix+=25;
		if(heuresJeuParMois>40)nvPrix+=15;
		return nvPrix;
	}
	

	public int calculerScoreSatisfaction() {
		int scorinit=40;
		if(nbJeuxInclus>30) scorinit+=20;
		if(heuresJeuParMois>20)scorinit+=20;
		if(this.getNbProfils()>2) scorinit+=10;
		if(scorinit>100) return 100;else return scorinit;
	}
}


