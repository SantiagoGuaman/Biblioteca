package MVC;

import Controlador.ControladorMenuPrincipal;
import Vista.VistaPrincipal;

public class Main {

    public static void main(String[] args) {
        VistaPrincipal vp = new VistaPrincipal();
        ControladorMenuPrincipal cp = new ControladorMenuPrincipal(vp);
        cp.iniciaControl();
    }
    
}