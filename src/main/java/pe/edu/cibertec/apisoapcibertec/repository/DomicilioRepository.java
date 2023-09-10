package pe.edu.cibertec.apisoapcibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.apisoapcibertec.model.Domicilio;

@Repository
public interface DomicilioRepository
    extends JpaRepository<Domicilio, Integer>
{

}
