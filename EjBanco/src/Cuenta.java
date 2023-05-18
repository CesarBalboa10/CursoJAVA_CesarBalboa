import java.util.ArrayList;
import java.util.List;

public abstract class Cuenta {

	private int numCuenta;
    private double saldo;
    private List<Movimiento> movimientos;
    private Cliente cliente;
    
    
    
	public Cuenta(int numCuenta, double saldo, List<Movimiento> movimientos, Cliente cliente) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.movimientos = new ArrayList<>();
		this.cliente = cliente;
	}
	public int getNumCuenta() {
		return numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	public Cliente getCliente() {
		return cliente;
	}
    
	public void depositar(double deposito) {
		this.saldo += deposito;
		movimientos.add(new Movimiento(deposito));
	}

    public abstract void extraer(double dinero);

	
}
