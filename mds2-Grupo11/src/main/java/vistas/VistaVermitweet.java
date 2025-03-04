package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

@Tag("vista-vermitweet")
@JsModule("./views/vista-vermitweet.ts")
public class VistaVermitweet extends LitTemplate {

    public VistaVermitweet() {
        // You can initialise any data required for the connected UI components here.
    }

}