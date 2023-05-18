import java.time.LocalDate;

public class Movimiento {

	private LocalDate fecha;
	private double saldo; //Positivo deposito, negativo extraccion

	public Movimiento(double saldo) {
		super();
		this.saldo = saldo;
		this.fecha = LocalDate.now();
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "...";
	}
	
}
