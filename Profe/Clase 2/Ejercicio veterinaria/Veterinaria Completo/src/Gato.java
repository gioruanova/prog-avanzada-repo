public class Gato extends Mascota {

	private static final double MULT_ALIMENTACION = 0.033;
	private static final int PORC_DESC_PESO = -1;

	public Gato(String nombre, double peso, boolean vacunados, Estado estado) {
		super(nombre, peso, vacunados, estado);
	}

	@Override
	public void comer(double comida) {
		super.comer(comida);
		super.actualizarPeso(comida * MULT_ALIMENTACION);
	}

	@Override
	public void defecar() {
		System.out.println("Ya fui al baño, recoge mi regalito");
		super.actualizarPeso(PORC_DESC_PESO);
	}
}
