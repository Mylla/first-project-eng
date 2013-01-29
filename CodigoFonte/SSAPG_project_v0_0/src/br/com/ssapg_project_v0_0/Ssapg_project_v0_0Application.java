package br.com.ssapg_project_v0_0;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;
import br.com.ssapg_project_v0_0.WEscolha.EventoBtVoltar;
import com.vaadin.Application;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;

public class Ssapg_project_v0_0Application extends com.vaadin.Application implements Button.ClickListener {
	
	//private Button b;
	//Variaveis
		private VerticalLayout vlButtons = new VerticalLayout(); 
		private HorizontalLayout hlPrincipal = new HorizontalLayout();
		private Button btVoltar;
		private Button btAluEsp;
		private Button btAluReg;
	
	@Override
	public void init() {
		Window main = new Window("SSAPG");
		setMainWindow(main);
		
		//Buttons
        Button btAluEsp = new Button("Aluno Especial");
        Button btAluReg = new Button("Aluno Regular");
        
        btAluEsp.addListener(this);
        btAluReg.addListener(this);
		
        vlButtons.addComponent(btAluReg);
        vlButtons.addComponent(btAluEsp);
        
		main.addComponent(vlButtons);
		
		//Button
        btVoltar = new Button("Voltar");
		btVoltar.addListener(this);
		
		//Add componentes aos layouts
		vlButtons.addComponent(btAluEsp);
		vlButtons.setComponentAlignment(btAluEsp, Alignment.MIDDLE_CENTER);
		vlButtons.addComponent(btAluReg);
		vlButtons.setComponentAlignment(btAluReg, Alignment.MIDDLE_CENTER);
		hlPrincipal.addComponent(btVoltar);
		hlPrincipal.setComponentAlignment(btVoltar, Alignment.MIDDLE_CENTER);
		
		//Add layouts a janela
		main.addComponent(vlButtons);
		main.addComponent(hlPrincipal);
		
	}

	//Evento do button Avançar
	public void buttonClick(ClickEvent event) {
		/*if(event.getButton()==this.btAluEsp){
	         //this.getMainWindow().addWindow(new WAluEspecial("Aluno Especial")); 
		
	    }*/
		if(event.getButton()==this.btAluReg){
	         this.getMainWindow().addWindow(new WAluRegular("Aluno Regular")); 
		
	    }/*
		if(event.getButton()==this.btVoltar){
	         
	    }*/
	}

}
