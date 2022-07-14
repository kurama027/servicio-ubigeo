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

import com.formacionbdi.spring.app.ubigeo.entity.tipoPoblacion;
import com.formacionbdi.spring.app.ubigeo.service.tipoPoblacionService;


@RestController
public class tipoPoblacionController {
	@Autowired
	private tipoPoblacionService tips; 
	
	@GetMapping("/listar-tipoblacion")
	public List<tipoPoblacion>listar(){
		return tips.findAll(); 	
	}
	
	@GetMapping("/ver-tipoblacion/{id}")
	public tipoPoblacion detalle(@PathVariable Long id) { 
		return tips.findById(id);
	}

	@DeleteMapping("/eliminar-tipoblacion/{ID_TIPO_POBLACION}")
    public ResponseEntity<?> delete(@PathVariable(value = "ID_TIPO_POBLACION") Long ID_TIPO_POBLACION, HttpServletRequest request) {
        HashMap<String, Object> result = new HashMap<>();
        tipoPoblacion data = tips.findById(ID_TIPO_POBLACION);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe registro con id: " + ID_TIPO_POBLACION);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        try {
            tips.delete(data);
            result.put("success", true);
            result.put("message", "Se ha eliminado los datos del registro.");
            result.put("data", data);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(new Exception(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
