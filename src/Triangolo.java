/**
 * <b>Trapezio</b>
 * <u>@author Quintana</u>
 * risultato atteso 5, risultato ottenuto 4
 */
public class Triangolo {
	/**
	 * Attributo della base
	 */
	private double base;
	/**
	 * Attributo dell'altezza
	 */
	private double altezza;
	
	/**
	 * Costruttore
	 * @param base, parametro della base
	 * @param altezza, parametro dell'altezza
	 */
	public Triangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	/**
	 * Metodo per il calcolo dell'area
	 * @return valore dell'area
	 */
	public double area() {
		return (base*altezza)/2;
	}
	
	public static void main(String[] args) {
		Triangolo t=new Triangolo(5,3);
		System.out.println("AREA : "+t.area());
	}
}
