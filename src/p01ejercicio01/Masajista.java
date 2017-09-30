/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01ejercicio01;

/**
 *
 * @author alond
 */
public class Masajista extends SeleccionFutbol {

	private String titulacion;

	private int aniosExperiencia;

	public Masajista() {
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int añosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = añosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public void darMasaje() {
		System.out.println("Da un masaje");
	}
}