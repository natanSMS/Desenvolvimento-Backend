package com.example.ex01.service;

import java.util.List;

import com.example.ex01.model.Leito;
import com.example.ex01.repository.LeitoRepository;

public class LeitoService {
    private LeitoRepository leitoRepository;

    public List<Leito> listarLeitos() {
        return leitoRepository.getAll();
    }

    public String cadastrarLeito(Leito leito) {
        if(leitoRepository.save(leito)) {
            leitoRepository.getAll().add(leito);
            return "leito adicionado";
        }

        return "leito não adicionado";
    }
}
