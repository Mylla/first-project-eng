package br.com.ssapg_project_v0_0;

import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class WAluRegular extends Window{

	//variaveis
	private TextField tfNome;
	private TextField tfEnd;
	private TextField tfEmail;
	private TextField tfNaturalidade;
	private TextField tfNacionalidade;
	private TextField tfEstado;
	private TextField tfTel1;
	private TextField tfTel2;
	private TextField tfDtNasc;
	//private TextField tfFoto;
	private TextField tfBairro;
	private TextField tfCEP;
	private TextField tfRG;
	private TextField tfCPF;
	private TextField tfCidade;
	private TextField tfDedicacao;
	private TextField tfHrSemanal;
	private TextField tfBolsa;

	private VerticalLayout vlPrincipal = new VerticalLayout();
	
	
public WAluRegular(String windowName) {
		
		this.setCaption("Preencha os campos");
        this.setPositionX(100);
        this.setPositionY(100);
        this.setWidth(500, Window.UNITS_PIXELS);
        this.setHeight(500, Window.UNITS_PIXELS);
        
        tfNome = new TextField("Nome Completo: ");
        tfEnd = new TextField("Endereço: ");
        
        vlPrincipal.addComponent(tfNome);
        vlPrincipal.addComponent(tfEnd);
        
        this.addComponent(vlPrincipal);
        
	}

	
	
	public TextField getTfNome() {
		return tfNome;
	}


	public void setTfNome(TextField tfNome) {
		this.tfNome = tfNome;
	}


	public TextField getTfEnd() {
		return tfEnd;
	}


	public void setTfEnd(TextField tfEnd) {
		this.tfEnd = tfEnd;
	}


	public TextField getTfEmail() {
		return tfEmail;
	}


	public void setTfEmail(TextField tfEmail) {
		this.tfEmail = tfEmail;
	}


	public TextField getTfNaturalidade() {
		return tfNaturalidade;
	}


	public void setTfNaturalidade(TextField tfNaturalidade) {
		this.tfNaturalidade = tfNaturalidade;
	}


	public TextField getTfNacionalidade() {
		return tfNacionalidade;
	}


	public void setTfNacionalidade(TextField tfNacionalidade) {
		this.tfNacionalidade = tfNacionalidade;
	}


	public TextField getTfEstado() {
		return tfEstado;
	}


	public void setTfEstado(TextField tfEstado) {
		this.tfEstado = tfEstado;
	}


	public TextField getTfTel1() {
		return tfTel1;
	}


	public void setTfTel1(TextField tfTel1) {
		this.tfTel1 = tfTel1;
	}


	public TextField getTfTel2() {
		return tfTel2;
	}


	public void setTfTel2(TextField tfTel2) {
		this.tfTel2 = tfTel2;
	}


	public TextField getTfDtNasc() {
		return tfDtNasc;
	}


	public void setTfDtNasc(TextField tfDtNasc) {
		this.tfDtNasc = tfDtNasc;
	}


	public TextField getTfBairro() {
		return tfBairro;
	}


	public void setTfBairro(TextField tfBairro) {
		this.tfBairro = tfBairro;
	}


	public TextField getTfCEP() {
		return tfCEP;
	}


	public void setTfCEP(TextField tfCEP) {
		this.tfCEP = tfCEP;
	}


	public TextField getTfRG() {
		return tfRG;
	}


	public void setTfRG(TextField tfRG) {
		this.tfRG = tfRG;
	}


	public TextField getTfCPF() {
		return tfCPF;
	}


	public void setTfCPF(TextField tfCPF) {
		this.tfCPF = tfCPF;
	}


	public TextField getTfCidade() {
		return tfCidade;
	}


	public void setTfCidade(TextField tfCidade) {
		this.tfCidade = tfCidade;
	}


	public TextField getTfDedicacao() {
		return tfDedicacao;
	}


	public void setTfDedicacao(TextField tfDedicacao) {
		this.tfDedicacao = tfDedicacao;
	}


	public TextField getTfBolsa() {
		return tfBolsa;
	}


	public void setTfBolsa(TextField tfBolsa) {
		this.tfBolsa = tfBolsa;
	}

	public TextField getTfHrSemanal() {
		return tfHrSemanal;
	}


	public void setTfHrSemanal(TextField tfHrSemanal) {
		this.tfHrSemanal = tfHrSemanal;
	}

}
