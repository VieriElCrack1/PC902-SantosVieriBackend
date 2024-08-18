package com.pc2.santosvieri.controller;

import com.pc2.santosvieri.model.CategoriaLibro;
import com.pc2.santosvieri.service.CategoriaLibroService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/url/categoria")
@RestController
public class CategoriaLibroController {

    private CategoriaLibroService categoriaLibroService;

    @GetMapping("/listaLibroCategoria")
    public List<CategoriaLibro> categoriaLibroList() {
        return categoriaLibroService.listadoCategoriaLibro();
    }
}
