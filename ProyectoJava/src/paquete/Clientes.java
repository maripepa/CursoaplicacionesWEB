package paquete;



public class Clientes {
	
	String nombre;
	int saldo;
	
	//esto es un constructor
	
	public Clientes(String nombreC, int saldoC) {
			nombre = nombreC;
		    saldo = saldoC;
	}
   public void depositar (int deposito) {
	   saldo=saldo+deposito;
   }
   public void extraer (int dinero){
	   saldo=saldo-dinero;
   }
   
   
   
   
   
	public static void main(String[] args) {
		
		String nombreC="Juan";
		int saldoC= 1200;
		
		Clientes uno= new Clientes(nombreC, saldoC);
		
		
		
		System.out.println("He creado a "+ uno.nombre +" y tiene un saldo inicial "+ uno.saldo); //esto es lo mismo que escribir los textos en Javascript
		
		uno.depositar(1000);
		System.out.println("Saldo tras deposito "+ uno.saldo);
		uno.extraer(1000);
		System.out.println("Saldo tras extraccion "+ uno.saldo);
		
	
	

	}

}
