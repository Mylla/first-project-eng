//Exemplo, dps deletar
package br.com.ssapg_project_v0_0;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class WEscolha extends Window{
	
	//Variaveis
	private OptionGroup ogTpAlu; 
	private VerticalLayout vlPrincipal = new VerticalLayout(); 
	private HorizontalLayout hlPrincipal = new HorizontalLayout();
	private Button btVoltar;
	
	public WEscolha(String windowName) {
		this.setCaption("Escolha uma opção");
        this.setPositionX(100);
        this.setPositionY(100);
        this.setWidth(500, Window.UNITS_PIXELS);
        this.setHeight(500, Window.UNITS_PIXELS);
        
        //OptionGroup
        OptionGroup ogTpAlu = new OptionGroup("Tipo do aluno:");
		
		ogTpAlu.addItem("Aluno Especial");
		ogTpAlu.addItem("Aluno Regular");
		this.addComponent(ogTpAlu);
        
		//Button
        btVoltar = new Button("Voltar");
		btVoltar.addListener(new EventoBtVoltar());
		
		//Add componentes aos layouts
		vlPrincipal.addComponent(ogTpAlu);
		vlPrincipal.setComponentAlignment(ogTpAlu, Alignment.MIDDLE_CENTER);
		hlPrincipal.addComponent(btVoltar);
		hlPrincipal.setComponentAlignment(btVoltar, Alignment.MIDDLE_CENTER);
		
		//Add layouts a janela
		this.addComponent(vlPrincipal);
		this.addComponent(hlPrincipal);
      
	}

	//Evento do botão para voltar para tela principal
	public class EventoBtVoltar implements Button.ClickListener {
	       
        public void buttonClick(ClickEvent event) {
            VerticalLayout vl = new VerticalLayout();
            Window w = getWindow();
            w.removeAllComponents();
            vl.setSizeFull();
 
            Label lbl = new Label("Voltou!");
            
            vl.addComponent(lbl);
            vl.setComponentAlignment(lbl, Alignment.MIDDLE_CENTER);
            //Aqui tem que setar a tela principal
            w.setContent(vl);
        }
    }

}
