package pe.edu.idat.demo_metodos_rest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ejercicio1Controller {

    private final Ejericio1Service ejericio1Service;

    public Ejercicio1Controller(Ejericio1Service ejericio1Service){
        this.ejericio1Service = ejericio1Service;
    }
}
