package br.dev.pinna.repository;

import br.dev.pinna.model.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRepository extends JpaRepository<Exchange, Long> {

    Exchange findByFromAndTo(String from, String to);
}
