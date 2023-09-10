package pe.edu.cibertec.apisoapcibertec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.apisoapcibertec.model.Domicilio;
import pe.edu.cibertec.apisoapcibertec.repository.DomicilioRepository;

import java.util.List;
import java.util.Optional;


@Service
public class DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public List<Domicilio> obtenerDomicilios(){
        return domicilioRepository.findAll();
    }

    public Domicilio obtenerDomicilioXId(Integer id){
        Optional<Domicilio> domicilio = domicilioRepository
                .findById(id);
        if(domicilio.isEmpty()){
            return null;
        }
        return domicilio.get();
    }
    public Domicilio guardarDomicilio(Domicilio domicilio){
        return domicilioRepository.save(domicilio);
    }
}
