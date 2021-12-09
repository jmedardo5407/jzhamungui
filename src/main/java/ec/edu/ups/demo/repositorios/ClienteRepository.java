package ec.edu.ups.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.ups.demo.models.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {
    
}
