package br.com.fran.descomplica.filmeflix.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/config")
public class ConfigAPI {
    
    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Operando.");
    }
    
}
