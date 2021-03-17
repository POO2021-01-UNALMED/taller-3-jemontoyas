package taller3.televisores;
import java.util.*;

public class Tv {
	Marca marca;
	public int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	public Control control;
	public static int numTv;
	public Tv(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getCanal() {
		return canal;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getVolumen() {
		return volumen;
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public int contadorTv(int cont) {
		cont=numTv;
		return cont;
	}
	public void setVolumen( int volum) {
		if (volum < 0 || volum > 7)
			return;
		else 
		volumen = volum;
	}

	public void setCanal (int cana) {
		if (cana < 1 || cana > 120)
			return;
		if (estado == false)
			return;
		else
		canal = cana;
	}
	
	public static void setNumTV (int numtv) {
		 numTv = numtv;
	}
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public void canalUp () {
		if (estado == false) {
			return;
		}
		if(canal == 120){
			return;
		}
		else {
			canal++;
		}
		
	}
	public void canalDown () {
		if (estado == false) {
			return;
		}
		if(canal == 1){
			return;
		}
		else {
			canal--;
		}
		
	}
	public void volumenUp () {
		if (estado == false) {
			return;
		}
		if(volumen == 7){
			return;
		}
		else {
			volumen++;
		}
		
	}
	public void volumenDown () {
		if (estado == false) {
			return;
		}
		if(volumen == 0){
			return;
		}
		else {
			volumen--;
		}
		
	}
	
	
}
