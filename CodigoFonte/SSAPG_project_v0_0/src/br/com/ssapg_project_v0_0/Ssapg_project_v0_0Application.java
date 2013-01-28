package br.com.ssapg_project_v0_0;

import com.vaadin.Application;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Ssapg_project_v0_0Application extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Ssapg_project_v0_0 Application");
		Window dialog = new Window("Cadastro", new A());
		dialog.setModal(true);
		
		mainWindow.addWindow(dialog);
		setMainWindow(mainWindow);
	}

}
