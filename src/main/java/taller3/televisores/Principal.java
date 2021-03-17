package taller3.televisores;

public class Principal {
	public static void main(String[] args) {
		Marca marca1 = new Marca("Sonky");
	    Marca marca2 = new Marca("Lp");
		
	    Tv tv1 = new Tv(marca1, true);
	    Tv tv2 = new Tv(marca2, false);
	    
	    tv1.setPrecio(3000);
	    tv2.setCanal(80);
	    tv1.setCanal(121);
		tv2.setVolumen(7);
		
		Control control1 = new Control();
		control1.enlazar(tv1);
		control1.turnOff();
		control1.setCanal(50);
		control1.turnOn();
		control1.canalUp();
		control1.volumenUp();
		
	    System.out.println(tv2.getCanal());
	    System.out.println(tv1.getPrecio());
	    System.out.println(tv1.getMarca().getNombre());
	    System.out.println(tv1.getCanal());
	}
}
