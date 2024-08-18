package com.pc2.santosvieri.service.Impl;

import com.pc2.santosvieri.model.CategoriaLibro;
import com.pc2.santosvieri.repository.CategoriaLibroRepository;
import com.pc2.santosvieri.service.CategoriaLibroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaLibroServiceImpl implements CategoriaLibroService {

    private CategoriaLibroRepository repository;

    @Override
    public List<CategoriaLibro> listadoCategoriaLibro() {
        return repository.findAll();
    }
}
