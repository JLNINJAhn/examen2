package unah.hn.lenguajes.examens.servicios.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.examens.modelos.Prestamos;
import unah.hn.lenguajes.examens.repositorio.PrestamosRepositorio;
import unah.hn.lenguajes.examens.servicios.PrestamosServicio;

@Service
public class PrestamosServiciosimp implements PrestamosServicio {
    @Autowired
    PrestamosRepositorio prestamosRepositorio;

    @Override
    public Prestamos crearPrestamos(Prestamos prestamos) {
        return prestamosRepositorio.save(prestamos);
    }

}
