public class Perro extends Mascota {

	private static final double MULT_ALIMENTACION = 0.05;
	private static final double PORC_DESC_PESO = -3;

	public Perro(String nombre, double peso, boolean vacunado, Estado estado) {
		super(nombre, peso, vacunado, estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer(double comida) {
		super.comer(comida);
	}

	@Override
	public void defecar() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'defecar'");
	}

	// TODO COMPLETAR
}
