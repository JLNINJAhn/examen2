package unah.hn.lenguajes.examens.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.lenguajes.examens.modelos.Cliente;

public interface ClienteRepositorio  extends JpaRepository<Cliente,String>{
            
}
