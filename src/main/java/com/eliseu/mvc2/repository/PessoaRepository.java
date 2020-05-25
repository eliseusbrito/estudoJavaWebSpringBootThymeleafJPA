package com.eliseu.mvc2.repository;

import com.eliseu.mvc2.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
