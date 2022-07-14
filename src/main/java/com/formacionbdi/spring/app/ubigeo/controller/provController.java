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

import com.formacionbdi.spring.app.ubigeo.entity.provincia;
import com.formacionbdi.spring.app.ubigeo.service.provService;



@RestController
public class provController {

	@Autowired
	private provService provis; 
	
	@GetMapping("/listar-provincia")
	public List<provincia>listar(){
		return provis.findAll(); 	
	}
	
	@GetMapping("/ver-provincia/{id}")
	public provincia detalle(@PathVariable Long id) { 
		return provis.findById(id);
	}

	@DeleteMapping("/eliminar-provincia/{ID_PROVINCIA}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_PROVINCIA") Long ID_PROVINCIA, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        provincia data = provis.findById(ID_PROVINCIA);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_PROVINCIA);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            provis.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
