package com.pc2.santosvieri.service.Impl;

import com.pc2.santosvieri.model.Libro;
import com.pc2.santosvieri.repository.LibroRepository;
import com.pc2.santosvieri.service.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LibroServiceImpl implements LibroService {

    private LibroRepository repository;

    @Override
    public List<Libro> consultaLibros(String titulo, int anio, int estado, int idcategoria) {
        return repository.consultaLibros(titulo, anio, estado, idcategoria);
    }
}
