package ni.edu.uam.docentesuam.controller;


import lombok.Getter;
import ni.edu.uam.docentesuam.modelos.Carrera;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carreras")
public class CiudadController {
    private final CarreraService service;

    public CarreraController(CarreraService service){
        this.service = service;
    }
@GetMapping
    public Iterable<Carrera> findAll(){
        return service.findAll();
}
@GetMapping("/{id}")
    public Carrera findById(Long id){
        return service.findById(id);
}
@PostMapping
    public Carrera save(Carrera carrera){
        carrera.setId(id);
        return service.save(carrera);
}
@DeleteMapping("/{id}")
    public void delete(Long id){
        service.delete(id);
}

}
