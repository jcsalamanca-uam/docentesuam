package ni.edu.uam.docentesuam.service;

import ni.edu.uam.docentesuam.modelos.Carrera;
import ni.edu.uam.docentesuam.repository.CarreraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraServicio {

    private final CarreraRepository repo;

    public CarreraServicio(CarreraRepository repo) {
        this.repo = repo;
    }

    public List<Carrera> findAll(){
        return repo.findAll();
    }

    public Carrera findById(Long id){
        return repo.findById(id).orElse(null);
    }

    public Carrera save(Carrera carrera){
        return repo.save(carrera);
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}