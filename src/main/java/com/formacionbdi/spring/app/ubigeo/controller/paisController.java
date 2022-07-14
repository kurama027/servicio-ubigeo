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

import com.formacionbdi.spring.app.ubigeo.entity.pais;
import com.formacionbdi.spring.app.ubigeo.service.paisService;


@RestController
public class paisController {
	@Autowired
	private paisService paser; 
	
	@GetMapping("/listar-pais")
	public ResponseEntity<?> findAll(HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta.");
        result.put("data", paser.findAll());
        return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	@GetMapping("/ver-pais/{id}")
	public pais detalle(@PathVariable Long id) { 
		return paser.findById(id);
	}

	@DeleteMapping("/eliminar-pais/{ID_PAIS}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_PAIS") Long ID_PAIS, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        pais data = paser.findById(ID_PAIS);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_PAIS);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            paser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
