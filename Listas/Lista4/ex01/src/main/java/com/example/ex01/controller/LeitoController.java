package com.example.ex01.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex01.model.Leito;
import com.example.ex01.service.LeitoService;

@RestController
@RequestMapping("/leitos")
public class LeitoController {
    private LeitoService leitoService;

    @GetMapping
    public List<Leito> listarLeitos() {
        return leitoService.listarLeitos();
    }

    @PostMapping
    public String cadastrarLeito(@RequestBody Leito leito) {
        return leitoService.cadastrarLeito(leito);
    }
}
