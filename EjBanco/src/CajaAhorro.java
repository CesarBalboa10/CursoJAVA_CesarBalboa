import java.util.List;

public class CajaAhorro extends Cuenta{

	public CajaAhorro(int numCuenta, double saldo, List<Movimiento> movimientos, Cliente cliente) {
		super(numCuenta, saldo, movimientos, cliente);
	}

	@Override
	public void extraer(double dinero) {
		if (this.getSaldo() >= dinero) {
            this.setSaldo(this.getSaldo()-dinero);
            this.getMovimientos().add(new Movimiento(dinero));
        } else {
            System.out.println("No hay saldo suficiente en la cuenta para realizar la extraccion");
        }
		
	}

}
