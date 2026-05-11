package ni.edu.uam.docentesuam.controller;

import ni.edu.uam.docentesuam.modelos.Carrera;
import ni.edu.uam.docentesuam.service.CarreraServicio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carreras")
public class CiudadController {

    private final CarreraServicio service;

    public CiudadController(CarreraServicio service){
        this.service = service;
    }

    @GetMapping
    public Iterable<Carrera> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Carrera findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public Carrera save(@RequestBody Carrera carrera){
        return service.save(carrera);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}