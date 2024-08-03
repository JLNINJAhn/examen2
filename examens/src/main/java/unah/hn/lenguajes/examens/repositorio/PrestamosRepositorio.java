package unah.hn.lenguajes.examens.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import unah.hn.lenguajes.examens.modelos.Prestamos;

public interface PrestamosRepositorio extends JpaRepository <Prestamos,Integer> {
    
}
