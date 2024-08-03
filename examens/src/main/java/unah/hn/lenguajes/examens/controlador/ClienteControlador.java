package unah.hn.lenguajes.examens.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes.examens.modelos.Cliente;

import unah.hn.lenguajes.examens.servicios.imp.ClienteServiciosimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/creditos")
public class ClienteControlador {
    @Autowired
    private ClienteServiciosimp clienteServiciosimp;

    @PostMapping("/crearCliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {

        
        return this.clienteServiciosimp.crearCliente(cliente);
    }

}
