import java.util.ArrayList;
import java.util.List;

import interfaces.Mostrable;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";

	private Doctor doctor;
	private List<Mascota> animalesIngresados;

	public Veterinaria(String nombre, Doctor doctor) {
		this.animalesIngresados = new ArrayList<Mascota>();
		this.doctor = doctor;
		// TODO A completar
	}

	public void admitirMascota(Mascota mascota) {
		this.animalesIngresados.add(mascota);
		System.out.printf(TXT_INGRESO, mascota.getNombre());

		// TODO A completar
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		Mascota aDevolver = null;
		boolean seEncontro = false;
		int i = 0;
		while (i < animalesIngresados.size() && !seEncontro) {
			if (this.animalesIngresados.get(i).getNombre().equals(nombreDeMascota)) {
				aDevolver = this.animalesIngresados.get(i);
				seEncontro = true; // condicion de corte
			} else {
				i++;
			}
		}
		// animalesIngresados.forEach(e -> System.out.println(e.getNombre()));

		return aDevolver;
	}

	public void vacunar() {
		int acu = 0;
		for (Mascota mascota : animalesIngresados) {
			if (!mascota.isVacunado()) {
				mascota.setVacunar(true);
				acu++;
			}
		}
		System.out.println("Vacunas aplicadas: " + acu);
	}

	public Doctor getDoctor() {
		return doctor;
	}

	@Override
	public void mostrar() {
		System.out.println("Veterinaria: " + this.getClass().getSimpleName());
		System.out.println("Doctor de turno: " + getDoctor().getNombre());
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
