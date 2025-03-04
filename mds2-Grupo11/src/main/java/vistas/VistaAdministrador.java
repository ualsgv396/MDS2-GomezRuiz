package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("vista-administrador")
@JsModule("./views/vista-administrador.ts")
public class VistaAdministrador extends LitTemplate {

    public VistaAdministrador() {
        // You can initialise any data required for the connected UI components here.
    }

}