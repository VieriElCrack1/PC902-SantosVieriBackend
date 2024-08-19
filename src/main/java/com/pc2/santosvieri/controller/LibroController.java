package com.pc2.santosvieri.controller;

import com.pc2.santosvieri.model.Libro;
import com.pc2.santosvieri.service.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RequestMapping("/url/libro")
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class LibroController {

    private LibroService libroService;

    @GetMapping("/consultaLibro")
    public ResponseEntity<Map<String, Object>> consultaLibros(
            @RequestParam(value = "titulo", defaultValue = "", required = false) String titulo,
            @RequestParam(value = "anio", defaultValue = "0") int anio,
            @RequestParam(value = "estado", defaultValue = "1") int estado,
            @RequestParam(value = "idcategoria", defaultValue = "0") int idcategoria) {
        Map<String, Object> salida = new HashMap<>();
        try {
            List<Libro> lista = libroService.consultaLibros(titulo + "%", anio, estado, idcategoria);
            if(CollectionUtils.isEmpty(lista)) {
                salida.put("mensaje", "lista vacia");
            }else {
                if(lista.size() > 1) {
                    salida.put("mensaje", "Existe " + lista.size() +  " libros para mostrar");
                }else {
                    salida.put("mensaje", "Existe " + lista.size() +  " libro para mostrar");
                }
                salida.put("lista", lista);
            }
        }catch (Exception e) {
            salida.put("mensaje", e.getMessage());
        }
        return new ResponseEntity<Map<String, Object>>(salida, HttpStatus.OK);
    }
}
