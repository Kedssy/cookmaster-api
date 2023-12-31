package br.integration.cookmasterapi.repository;

import br.integration.cookmasterapi.model.Preparo;
import br.integration.cookmasterapi.model.ReceitaIngrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreparoRepository extends JpaRepository<Preparo, Long> {

    @Query
    public List<Preparo> findByDescricaoContainingAllIgnoringCase(String descricao);

    @Query
    public List<Preparo> findByReceitaId(Long idReceita);

}
