package com.webapp.widgets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.widgets.model.Widget;
import com.webapp.widgets.service.WidgetService;

@RestController
@RequestMapping("/widgets")
public class WidgetController {
	
	@Autowired
	WidgetService service;
	
	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Widget> getById(@RequestParam int id) {
		return service.getById(id);
	}
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Widget> hey() {
		return service.getAll();
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Widget addWidget(@RequestBody Widget widget ) {
		return service.addWidget(widget);
	}
	
	@DeleteMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public boolean deleteById(@RequestParam int id) {
		return service.deleteById(id);
	}
	
	@PutMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Widget update(@RequestParam int id,@RequestBody Widget widget) {
		return service.update(id, widget);
	}
	
}
