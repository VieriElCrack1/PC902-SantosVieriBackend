package com.pc2.santosvieri.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @OneToMany(mappedBy = "categoriaLibro")
    private List<Libro> libroList;
}
