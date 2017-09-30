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
public class Futbolista extends SeleccionFutbol {

	private int dorsal;

	private String demarcacion;

	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public void jugarPartido() {
		System.out.println("Juega un partido");
	}

	public void entrenar() {
		System.out.println("Entrena");
	}

}