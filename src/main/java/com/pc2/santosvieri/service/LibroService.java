package com.pc2.santosvieri.service;

import com.pc2.santosvieri.model.Libro;

import java.util.List;

public interface LibroService {
    List<Libro> consultaLibros(String titulo, int anio, int estado, int idcategoria);
}
