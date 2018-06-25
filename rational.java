// Klassen
public class rational {
	// Datenelemente gekapselt
	private int num;	// Zaehler
	private int denom;	// Nenner

	// Konstruktor
	public rational() {
	num = 0;
	denom = 1;
	}

	public rational(int num, int denom) {
		this.num = num;
		this.denom = denom;
	}
// Methoden
	int gcd(){
		int x = num;
		int y = denom;

		if  (num == 0)
		 return denom;

		// Sonderfall abfangen
		if (x==0)
	 	// der ggt ist y
		if (y==0)
	 	// der ggt ist x
	
		// Endlosschleife vermeiden
		if(x < 0)
		 x =- x;
		if(y < 0)
	 	 y = -y;

		while (x != y)
		 if(x > y)
		  x = x - y;
		 else
		  y = y - x;
		return x;
		
	}
// kÃ¼rzen
	public void reduce(){
		
		int teiler = gcd();
		num = num/teiler;
		denom = denom/teiler;
	
	}
// erweitern
	public void extend(int n){
	
		num = num * n;
		denom = denom * n;

	}

	public String toString(){
	
		return(num + "/" + denom);

	}

	public String toStringReduce(){

		reduce();
		return toString();		
	}
}
