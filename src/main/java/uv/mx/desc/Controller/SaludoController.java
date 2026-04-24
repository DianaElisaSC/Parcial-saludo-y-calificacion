package uv.mx.desc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/Alumno")
    public String saludo() {
        return "Hola Diana, tu calificación es 9";
    }
}