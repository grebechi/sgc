package br.edu.ifrs.osorio.grebechi.sgc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "<h1>Versão 3: Olá, Professor Roger Gonçalves Urdangarin! Deploy 4 via Jenkins.</h1>";
    }
}
