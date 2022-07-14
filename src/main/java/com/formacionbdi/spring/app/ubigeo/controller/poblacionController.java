package com.formacionbdi.spring.app.ubigeo.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.spring.app.ubigeo.entity.poblacion;
import com.formacionbdi.spring.app.ubigeo.service.poblacionService;

@RestController
public class poblacionController {
	@Autowired
	private poblacionService pobser; 
	
	@GetMapping("/listar-poblacion")
	public List<poblacion>listar(){
		return pobser.findAll(); 	
	}
	
	@GetMapping("/ver-poblacion/{id}")
	public poblacion detalle(@PathVariable Long id) { 
		return pobser.findById(id);
	}

	@DeleteMapping("/eliminar-poblacion/{ID_POBLACION}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_POBLACION") Long ID_POBLACION, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        poblacion data = pobser.findById(ID_POBLACION);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_POBLACION);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            pobser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
