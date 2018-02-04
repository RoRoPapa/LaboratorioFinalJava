package com.gm.mundopc;

public class Teclado extends DispositivosEntrada {
	
	
	private int idTeclado;
	private static int contadorTeclados;
	
	
	public Teclado() {
		
	}
	public Teclado(String tipoEntrada,String marca ) {
		super(tipoEntrada,marca);
		this.idTeclado = ++contadorTeclados;
	}
	@Override
	
	public String toString() {
		return super.toString()+" id:"+idTeclado;
	}
	
	
	 
}
