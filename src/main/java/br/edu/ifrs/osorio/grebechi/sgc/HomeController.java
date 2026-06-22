package br.edu.ifrs.osorio.grebechi.sgc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "<h1>Etapa 2 do trabalho: Olá, Professor Roger Gonçalves Urdangarin! Deploy 03 via Jenkins. Utilizando um container Docker!</h1>";
    }
}
