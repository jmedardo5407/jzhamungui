package ec.edu.ups.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
public class PostComment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long id;
    private String review;

    @ManyToOne
    @JoinColumn(name = "post")
    private Post post;
    
}
