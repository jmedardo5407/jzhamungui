package ec.edu.ups.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.ups.demo.models.Proveedor;

public interface ProveedorRepository extends JpaRepository <Proveedor, Long> {
    
}
