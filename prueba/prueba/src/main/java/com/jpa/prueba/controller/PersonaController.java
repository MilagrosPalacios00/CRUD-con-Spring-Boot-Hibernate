
package com.jpa.prueba.controller;

import com.jpa.prueba.model.Persona;
import com.jpa.prueba.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    private IPersonaService  persoServ;
    
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> getPersonas (){
        return persoServ.getPersonas();
    }
    
    @PostMapping ("/crear/persona")
    public String savePersona (@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "La persona se creo correctamente";
    }
    
    @DeleteMapping ("/borrar/persona/{id}")
    public String deletePersona (@PathVariable Long id){
        persoServ.deletePersona(id);
        return "Persona eliminada correctamente";
    }
    
    @PutMapping ("/editar/persona/{id_original}")
    public Persona editPersona (@PathVariable Long id_original,
                                              @RequestParam (required = false, name = "id") Long nuevaId,
                                              @RequestParam (required = false, name = "nombre") String nuevoNombre,
                                              @RequestParam (required = false, name = "apellido") String nuevoApellido,
                                              @RequestParam (required = false, name = "edad") int nuevaEdad) {
   
        persoServ.editPersona(id_original, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);
        
        return persoServ.findPersona(nuevaId);
     }
    
    
    
                                              
    }
    
    
    
    
    
    
    
    
    
    

