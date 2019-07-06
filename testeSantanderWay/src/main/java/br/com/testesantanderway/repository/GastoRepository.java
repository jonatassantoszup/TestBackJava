package br.com.testesantanderway.repository;

import br.com.testesantanderway.modelo.Gasto;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface GastoRepository extends SolrCrudRepository<Gasto, String>{
        List<Gasto> findByCodigoUsuarioAndDataCriacaoAfter(String codigoUsuario, LocalDateTime dataCriacao);

        @Cacheable("gastoUsuario")
        Page<Gasto> findByCodigoUsuarioAndDataCriacaoBetween(String codigoUsuario, LocalDateTime inicio, LocalDateTime fim, Pageable paginacao);

        @Cacheable("categoria")
        Optional<String> findCategoriaByDescricao(String descricao);
}