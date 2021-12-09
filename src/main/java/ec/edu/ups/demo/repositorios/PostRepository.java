package ec.edu.ups.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.ups.demo.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    
}
