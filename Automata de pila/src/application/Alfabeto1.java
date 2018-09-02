package application;

import javafx.beans.property.SimpleStringProperty;

public class Alfabeto1 
{
	
	SimpleStringProperty conjunto;
	SimpleStringProperty alfabeto1;
	SimpleStringProperty alfabeto2;
	SimpleStringProperty estadoini;
	SimpleStringProperty estadosacept;
	
	public Alfabeto1(String conjunto, String alfabeto1, String alfabeto2, String estadoini, String estadosacept)
	{
		this.conjunto = new SimpleStringProperty(conjunto);
		this.alfabeto1 = new SimpleStringProperty(alfabeto1);
		this.alfabeto2 = new SimpleStringProperty(alfabeto2);
		this.estadoini = new SimpleStringProperty(estadoini);
		this.estadosacept = new SimpleStringProperty(estadosacept);
	}

	public SimpleStringProperty getConjunto() {
		return conjunto;
	}

	public void setConjunto(SimpleStringProperty conjunto) {
		this.conjunto = conjunto;
	}

	public SimpleStringProperty getAlfabeto1() {
		return alfabeto1;
	}

	public void setAlfabeto1(SimpleStringProperty alfabeto1) {
		this.alfabeto1 = alfabeto1;
	}

	public SimpleStringProperty getAlfabeto2() {
		return alfabeto2;
	}

	public void setAlfabeto2(SimpleStringProperty alfabeto2) {
		this.alfabeto2 = alfabeto2;
	}

	public SimpleStringProperty getEstadoini() {
		return estadoini;
	}

	public void setEstadoini(SimpleStringProperty estadoini) {
		this.estadoini = estadoini;
	}

	public SimpleStringProperty getEstadosacept() {
		return estadosacept;
	}

	public void setEstadosacept(SimpleStringProperty estadosacept) {
		this.estadosacept = estadosacept;
	}
}
