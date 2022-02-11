package perso;
public class perso {
 private String nom;
private int vie;
public perso(String name,int life){
this.nom = name;
this.vie = life;
}
public String LeNom(){
return this.nom;
}
public void damage(Personnage cible, int degats){
		cible.vie -= degats;
		System.out.println(this.LeNom() + " attaque " + cible.LeNom() + " qui perd " + degats + " Points de vie");

	}


}
