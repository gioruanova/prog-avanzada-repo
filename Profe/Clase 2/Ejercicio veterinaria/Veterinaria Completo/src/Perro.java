public class Perro extends Mascota {

	private static final double MULT_ALIMENTACION = 0.05;
	private static final double PORC_DESC_PESO = -3;

	public Perro(String nombre, double peso, boolean vacunados, Estado estado) {
		super(nombre, peso, vacunados, estado);
	}

	@Override
	public void comer(double comida) {
		super.comer(comida);
		super.actualizarPeso(comida * MULT_ALIMENTACION);

	}

	@Override
	public String getNombre() {
		return super.getNombre();
	}

	@Override
	public void defecar() {
		System.out.println("Ya fui al baño, recoge mi regalito");
		super.actualizarPeso(PORC_DESC_PESO);
	}
}
