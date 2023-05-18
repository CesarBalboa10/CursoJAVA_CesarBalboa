import java.util.List;

public class CuentaCorriente extends Cuenta{

	public CuentaCorriente(int numCuenta, double saldo, List<Movimiento> movimientos, Cliente cliente) {
		super(numCuenta, saldo, movimientos, cliente);
	}

	@Override
	public void extraer(double dinero) {
		if (this.getSaldo() >= dinero) {
            this.setSaldo(this.getSaldo()-dinero);
            this.getMovimientos().add(new Movimiento(dinero));
        } else {
        	this.setSaldo(this.getSaldo()-dinero);
            this.getMovimientos().add(new Movimiento(dinero));
            System.out.println("Estas en negativo, ten cuidado");
        }
		
	}

	
	
}
