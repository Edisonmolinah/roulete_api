package com.edd.ruouleta_api.controller;

import com.edd.ruouleta_api.dtos.RuletaDTO;
import com.edd.ruouleta_api.model.Ruleta;
import com.edd.ruouleta_api.service.IRuletaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class RuletaController {

    final IRuletaService ruletaService;

    public RuletaController(IRuletaService ruletaService) {
        this.ruletaService = ruletaService;

    }
    @PostMapping("/newruleta")
    public ResponseEntity<?> createRuleta(){
        ruletaService.createRuleta();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("getallruleta")
    public ResponseEntity<List<Ruleta>> geteRuleta(){

        return new ResponseEntity<>(ruletaService.getRuleta(), HttpStatus.CREATED);
    }
}
