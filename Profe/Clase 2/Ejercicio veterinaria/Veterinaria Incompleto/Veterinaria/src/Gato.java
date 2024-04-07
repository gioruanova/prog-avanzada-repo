public class Gato extends Mascota {

	private static final double MULT_ALIMENTACION = 0.033;
	private static final int PORC_DESC_PESO = -1;

	public Gato(String nombre, double peso, boolean vacunado, Estado estado) {
		super(nombre, peso, vacunado, estado);
		// TODO Auto-generated constructor stub
	}

	public void comer(double comida) {
		super.comer(comida);
	}

	@Override
	public void defecar() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'defecar'");
	}

	// TODO Completar
}
