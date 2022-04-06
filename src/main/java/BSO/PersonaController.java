package BSO;

import org.springframework.web.bind.annotation.*;

@RestController

public class PersonaController {
    @GetMapping("/user/{nombre}")
    public String user(@PathVariable String nombre) {
        return "Hola "+ nombre;

    }


    @PostMapping("/useradd")
    public Persona userAdd(@RequestBody Persona persona) {
        persona.setEdad(persona.getEdad()+1);
        return persona;
    }
}
