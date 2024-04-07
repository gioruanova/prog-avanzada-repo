import java.util.ArrayList;
import java.util.List;

import interfaces.Mostrable;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";

	private String nombre;
	private List<Mascota> animalesIngresados;
	private Doctor doctor;

	public Veterinaria(String nombre, Doctor doctor) {
		this.animalesIngresados = new ArrayList<Mascota>();
		this.doctor = doctor;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void admitirMascota(Mascota mascota) {
		this.animalesIngresados.add(mascota);
		System.out.printf(TXT_INGRESO, mascota.getNombre());
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		Mascota m = null;
		boolean seEncontro = false;
		int i = 0;
		while (i < this.animalesIngresados.size() && !seEncontro) {
			if (this.animalesIngresados.get(i).getNombre().equals(nombreDeMascota)) {
				m = this.animalesIngresados.get(i);
				seEncontro = true;
			}
			i++;
		}
		return m;
	}

	public void vacunar() {
		int acu = 0;
		for (Mascota mascota : animalesIngresados) {
			if (!mascota.isVacunado()) {
				mascota.setVacunado(true);
				acu++;
			}
		}
		System.out.println("Vacunas apllicadas: " + acu);
	}

	@Override
	public void mostrar() {
		System.out.println(this.getClass().getSimpleName() + this.getNombre());
		System.out.println("Doctor de turno: " + this.getDoctor().getNombre());
		int acuPerros = 0;
		int acuGatos = 0;
		int acuConejos = 0;
		for (Mascota mascota : animalesIngresados) {
			if (mascota instanceof Perro) {
				acuPerros++;
			} else if (mascota instanceof Gato) {
				acuGatos++;
			} else if (mascota instanceof Conejo) {
				acuConejos++;
			}
		}
		System.out.printf(TXT_CANTIDADES, acuConejos, acuGatos, acuPerros);
	}

}
