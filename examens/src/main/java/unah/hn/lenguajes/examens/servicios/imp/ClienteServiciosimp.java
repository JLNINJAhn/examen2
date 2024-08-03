package unah.hn.lenguajes.examens.servicios.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes.examens.modelos.Cliente;
import unah.hn.lenguajes.examens.repositorio.ClienteRepositorio;
import unah.hn.lenguajes.examens.servicios.ClienteServicios;

@Service
public class ClienteServiciosimp implements ClienteServicios {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public Cliente crearCliente(Cliente nvCliente) {
        return clienteRepositorio.save(nvCliente);
    }

    

}
