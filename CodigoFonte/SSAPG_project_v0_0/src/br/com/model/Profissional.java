package br.com.model;

public class Profissional {

	private String local;
	private String cargo;
	
	
	public Profissional(String local, String cargo) {
		this.local = local;
		this.cargo = cargo;
	}
	
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}
