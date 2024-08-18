package com.pc2.santosvieri.repository;

import com.pc2.santosvieri.model.CategoriaLibro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaLibroRepository extends JpaRepository<CategoriaLibro, Integer> {

}
