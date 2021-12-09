package ec.edu.ups.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.ups.demo.models.Producto;

public interface ProductoRepository extends JpaRepository <Producto, Long>{
    
}
