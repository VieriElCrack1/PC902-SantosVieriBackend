package com.pc2.santosvieri.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "categoria_libro")
public class CategoriaLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcategoria;
    private String descripcion;

    @OneToMany(mappedBy = "categoriaLibro")
    private List<Libro> libroList;
}
