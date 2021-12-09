package ec.edu.ups.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.ups.demo.models.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido , Long>{
    
}
