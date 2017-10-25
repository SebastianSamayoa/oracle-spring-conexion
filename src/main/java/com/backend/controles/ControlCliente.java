package com.backend.controles;

import com.backend.entidades.Cliente;
import com.backend.repositorios.repocliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jhoan
 */
@RestController
@Service
@EnableJpaRepositories(basePackages = "com.backend.repositorios")
public class ControlCliente {

    @Autowired
    repocliente rp;

    @CrossOrigin
    @RequestMapping(
            value = "cliente/all",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public List<Cliente> getall() {
        List<Cliente> result = (List<Cliente>) rp.findAll();

        return result;
    }
}
