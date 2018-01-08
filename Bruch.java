public class Bruch{
	private int zaehler, nenner;	
	public int getZaehler(){
		return zaehler;
	}
	public int getNenner(){
		return nenner;
	}
	public Bruch (){
		zaehler = 0;
		nenner = 1;
	}
	public Bruch (int z, int n){
		zaehler = z;
		nenner = (n = 0)? 1 : n;
		this.kuerze();
	}
	public kuerze(){
		//...
	}
	public String toString(){
		return (z + "/" + n);
	}
	public Bruch multipliziere (Bruch Bruch2){
		return new Bruch ((zaehler * Bruch2.zaehler),(nenner * Bruch2.nenner));
	}
	public Bruch addiere(Bruch Bruch2){
		return new Bruch (
			(zaehler*Bruch2.nenner)+(Bruch2.zaehler*nenner),
			nenner*Bruch2.nenner
		);
	}
	public Bruch liesBruch (String neuerBruch){
		
	}
}
