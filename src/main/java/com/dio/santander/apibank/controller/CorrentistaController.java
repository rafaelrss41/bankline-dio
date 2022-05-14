package com.dio.santander.apibank.controller;


import com.dio.santander.apibank.dto.NovoCorrentista;
import com.dio.santander.apibank.model.Correntista;
import com.dio.santander.apibank.repository.CorrentistaRepository;
import com.dio.santander.apibank.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
    @Autowired
    private CorrentistaRepository repository;
    @Autowired
    private CorrentistaService service;

    @GetMapping
    public List<Correntista> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovoCorrentista correntista){

        service.save(correntista);
    }
}