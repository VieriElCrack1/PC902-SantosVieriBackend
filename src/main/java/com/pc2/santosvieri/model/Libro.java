package com.pc2.santosvieri.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idlibro;
    private String titulo;
    private int anio;
    private String serie;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaRegistro;
    private int estado;

    @ManyToOne
    @JoinColumn(name = "idcategoria")
    private CategoriaLibro categoriaLibro;
}
