package com.pc2.santosvieri.repository;

import com.pc2.santosvieri.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

    @Query("SELECT l FROM Libro l WHERE (?1 is null or ?1 = '' or l.titulo like ?1) and (?2 = 0 or l.anio = ?2) and (?3 = 0 or l.estado = ?3) and (?4 = 0 or l.categoriaLibro.idcategoria = ?4)")
    List<Libro> consultaLibros(String titulo, int anio, int estado, int idcategoria);
}
