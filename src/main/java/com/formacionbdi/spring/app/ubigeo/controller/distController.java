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

import com.formacionbdi.spring.app.ubigeo.entity.distrito;
import com.formacionbdi.spring.app.ubigeo.service.distService;



@RestController
public class distController {
	@Autowired
	private distService diser; 
	
	@GetMapping("/listar-distrito")
	public List<distrito>listar(){
		return diser.findAll(); 	
	}
	
	@GetMapping("/ver-distrito/{id}")
	public distrito detalle(@PathVariable Long id) { 
		return diser.findById(id);
	}

	@DeleteMapping("/eliminar-distrito/{ID_TAX_DISTRITO}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_TAX_DISTRITO") Long ID_TAX_DISTRITO, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        distrito data = diser.findById(ID_TAX_DISTRITO);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_TAX_DISTRITO);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            diser.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
