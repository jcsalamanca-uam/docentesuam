package ni.edu.uam.docentesuam.repository;

import ni.edu.uam.docentesuam.modelos.Carrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

}
