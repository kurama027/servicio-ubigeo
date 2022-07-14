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

import com.formacionbdi.spring.app.ubigeo.entity.caserio;
import com.formacionbdi.spring.app.ubigeo.service.caserioService;


@RestController
public class caserioController {
	@Autowired
	private caserioService caser; 
	
	@GetMapping("/listar-caserio")
	public List<caserio>listar(){
		return caser.findAll(); 	
	}
	
	@GetMapping("/ver-caserio/{id}")
	public caserio detalle(@PathVariable Long id) { 
		return caser.findById(id);
	}

	@DeleteMapping("/eliminar-caserio/{ID_CASERIO}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_CASERIO") Long ID_CASERIO, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        caserio data = caser.findById(ID_CASERIO);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_CASERIO);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            caser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
