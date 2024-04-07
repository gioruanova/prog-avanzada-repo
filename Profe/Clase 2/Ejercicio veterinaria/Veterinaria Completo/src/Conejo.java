public class Conejo extends Mascota {

	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;

	public Conejo(String nombre, double peso, boolean vacunados, Estado estado) {
		super(nombre, peso, vacunados, estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer(double comida) {
		super.comer(comida);
		super.actualizarPeso(comida * MULT_ALIMENTACION);
	}

	@Override
	public void defecar() {
		System.out.println("Ya fui al baño, toma mis pequeñas cosas");
		super.actualizarPeso(PORC_DESC_PESO);
	}
}
