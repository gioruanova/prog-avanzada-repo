import interfaces.Animal;

public abstract class Mascota implements Animal {

	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias tenía hambre";
	private static final String MSG_COM_ENFERMO = " dice: No tenía mucha hambre, pero gracias";

	private static final int CIEN = 100;

	// TODO Completar

	private String nombre;
	private double peso;
	private boolean vacunado;
	private Estado estado;

	public Mascota(String nombre, double peso, boolean vacunado, Estado estado) {
		this.nombre = nombre;
		this.peso = peso;
		this.vacunado = vacunado;
		this.estado = estado;
	}

	// TODO Completar
	/**
	 * Alimenta a las mascotas de forma general. Si su estado es hambiento estar�
	 * feliz y dara las gracias ya que ten�a hambre Si su estado es feliz, se
	 * enfermar� e indicar� que comio demasiado. si estaba enfermo, dara las
	 * gracias, pero seguir� enfermo.
	 * adem�s actualizar� el peso sumando al actual la multiplicaci�n entre la
	 * cantidad de comida recibida y un multiplicador.
	 * Finalmente indicar� su estado
	 * 
	 * @param comida
	 * @param multiplicador
	 */

	@Override
	public void comer(double comida) {
		if (this.getEstado().equals(Estado.HAMBRIENTO)) {
			System.out.println(getNombre() + " dice: " + MSG_COM_HAMBRIENTO);
			this.setEstado(Estado.FELIZ);
			System.out.println("El estado de: " + getNombre() + " es: " + this.getEstado().getDescripcion());
		} else if (this.getEstado().equals(Estado.FELIZ)) {
			System.out.println(getNombre() + " dice: " + MSG_COM_FELIZ);
			this.setEstado(Estado.ENFERMO);
			System.out.println("El estado de: " + getNombre() + " es: " + this.getEstado().getDescripcion());
		} else if (this.getEstado().equals(Estado.ENFERMO)) {
			System.out.println(getNombre() + " dice: " + MSG_COM_ENFERMO);
			System.out.println("El estado de: " + getNombre() + " es: " + this.getEstado().getDescripcion());
		}

	}

	public String getNombre() {
		return nombre;
	}

	public double getPeso() {
		return peso;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
