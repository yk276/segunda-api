package br.com.senac.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculadoraExercicio")
public class CalculadoraController {

    @GetMapping("/somarMetodo")
    public ResponseEntity<String> somarMetodo(@RequestParam int numero1, @RequestParam int numero2){

        double resultado = numero1 + numero2;

        return ResponseEntity.ok("Resultado: " + resultado);
    }

    @GetMapping("/subtrairMetodo")
    public ResponseEntity<String> subtrairMetodo(@RequestParam int numero1, @RequestParam int numero2){

        double resultado = numero1 - numero2;

        return ResponseEntity.ok("Resultado: " + resultado);
    }

    @GetMapping("/dividirMetodo")
    public ResponseEntity<String> dividirMetodo(@RequestParam int numero1, @RequestParam int numero2){

        double resultado = numero1 / numero2;

        return ResponseEntity.ok("Resultado: " + resultado);
    }

    @GetMapping("/multiplicarMetodo")
    public ResponseEntity<String> multiplicarMetodo(@RequestParam int numero1, @RequestParam int numero2){

        double resultado = numero1 * numero2;

        return ResponseEntity.ok("Resultado: " + resultado);
    }
}
