package br.edu.ifpe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituicaoEnsinoDAO extends JpaRepository<InstituicaoEnsino, String> {

}
