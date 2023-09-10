package pe.edu.cibertec.apisoapcibertec.converter;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.apisoapcibertec.model.Domicilio;
import pe.edu.cibertec.ws.objects.Domiciliows;

@Component
public class DomicilioConvert {

    public Domicilio convertDomicilioWsToDomicilio(Domiciliows domiciliows){
        Domicilio domicilio = new Domicilio();
        domicilio.setIddomicilio(domiciliows.getIddomicilio());
        domicilio.setDescdomicilio(domiciliows.getDescdomicilio());
        domicilio.setNrodomicilio(domiciliows.getNrodomicilio());
        domicilio.setRefdomicilio(domiciliows.getRefdomicilio());
        return domicilio;
    }
    public Domiciliows convertDomicilioToDomicilioWs(Domicilio domicilio){
        Domiciliows domiciliows = new Domiciliows();
        domiciliows.setIddomicilio(domicilio.getIddomicilio());
        domiciliows.setDescdomicilio(domicilio.getDescdomicilio());
        domiciliows.setNrodomicilio(domicilio.getNrodomicilio());
        domiciliows.setRefdomicilio(domicilio.getRefdomicilio());
        return domiciliows;
    }

}
