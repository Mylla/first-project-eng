package br.com.ssapg_project_v0_0;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class Ssapg_project_v0_0Application extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Ssapg_project_v0_0 Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
