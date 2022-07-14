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

import com.formacionbdi.spring.app.ubigeo.entity.departamento;
import com.formacionbdi.spring.app.ubigeo.service.depaService;



@RestController
public class depaController {
	@Autowired
	private depaService depaser; 
	
	@GetMapping("/listar-departamento")
	public List<departamento>listar(){
		return depaser.findAll(); 	
	}
	
	@GetMapping("/ver-departamento/{id}")
	public departamento detalle(@PathVariable Long id) { 
		return depaser.findById(id);
	}

	@DeleteMapping("/eliminar-departamento/{ID_DEPARTAMENTO}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_DEPARTAMENTO") Long ID_DEPARTAMENTO, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        departamento data = depaser.findById(ID_DEPARTAMENTO);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_DEPARTAMENTO);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            depaser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
