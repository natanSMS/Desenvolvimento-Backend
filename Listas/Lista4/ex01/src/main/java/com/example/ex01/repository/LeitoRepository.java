package com.example.ex01.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.ex01.model.Leito;

public class LeitoRepository {
    private List<Leito> leitos = new ArrayList<>();

    public List<Leito> getAll() {
        return leitos;
    }

    public boolean save(Leito leito) {
        for(Leito leitoNaLista : leitos) {
            if(leitoNaLista.getId() == leito.getId()) {
                return false;
            }
        }

        return true;
    }
}
