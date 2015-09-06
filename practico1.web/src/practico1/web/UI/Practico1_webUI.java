package practico1.web.UI;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("practico1_web")
public class Practico1_webUI extends UI {
	
	
	private VerticalLayout mainVerticalLayout = new VerticalLayout();
	private AbsoluteLayout panelUsuario = new AbsoluteLayout();

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = Practico1_webUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		getPage().setTitle("Alta de Usuario" );
		this.setResponsive(true);
		mainVerticalLayout.setMargin(true);
		MarginInfo mi = new MarginInfo(false, true, false, true);
		mainVerticalLayout.setMargin(mi);
		setContent(mainVerticalLayout);
		cargarContenido();
	}
	
	
	private void cargarContenido() {
		mainVerticalLayout.addComponent(panelUsuario);
		panelUsuario.setSizeFull();
		Label labelNickUsuario = new Label("Nick: ");
		Label labelPasswordUsuario = new Label("Password: ");
		Label labelMailUsuario = new Label("Mail: ");
		Label labelNombreUsuario = new Label("Nombre Completo: ");
		TextField textNickUsuario = new TextField();
		PasswordField textPasswordUsuario = new PasswordField();
		TextField textMailUsuario = new TextField();
		TextField textNombreUsuario = new TextField();
		Button alta = new Button("Agregar Usuario");
		panelUsuario.addComponent(labelNickUsuario, "left: 10%; right: 80%; top: 10%; bottom: 50%");	
		panelUsuario.addComponent(labelPasswordUsuario, "left: 10%; right:80%; top: 20%; bottom: 50%");
		panelUsuario.addComponent(labelMailUsuario, "left: 10%; right: 80%; top: 30%; bottom: 50%");
		panelUsuario.addComponent(labelNombreUsuario, "left: 10%; right: 80%; top: 40%; bottom: 50%");
		panelUsuario.addComponent(textNickUsuario, "left: 20%; right: 70%; top: 10%; bottom: 50%");
		panelUsuario.addComponent(textPasswordUsuario, "left: 20%; right: 70%; top: 20%; bottom: 50%");
		panelUsuario.addComponent(textMailUsuario, "left: 20%; right: 70%; top: 30%; bottom: 50%");
		panelUsuario.addComponent(textNombreUsuario, "left: 20%; right: 70%; top: 40%; bottom: 50%");
		panelUsuario.addComponent(alta, "left: 40%; right: 50%; top: 50%; bottom: 50%");
		
		
		alta.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				mainVerticalLayout.addComponent(new Label("Usuario Creado (mentira)"));
			}
		});
		//mainVerticalLayout.addComponent(alta);
		mainVerticalLayout.setSizeFull();
	}
}