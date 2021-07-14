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

import com.webapp.widgets.WidgetsApplication;
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
		try {
			WidgetsApplication.logger.info("GET request for widget by id : " + id);
			return service.getById(id);
		} catch (Exception e) {
			WidgetsApplication.logger.error(" Error while  processong GET request for widget by id : " + id);
			throw e;
		}
	}

	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Widget> hey() {
		try {
			WidgetsApplication.logger.info("GET request to fetch all Widgets");
			return service.getAll();
		} catch (Exception e) {
			WidgetsApplication.logger.error("Error while proessing GET request to fetch all Widgets");
			throw e;
		}
	}

	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Widget addWidget(@RequestBody Widget widget) {
		try {
			WidgetsApplication.logger.info("POST request to add widget : " + widget);
			return service.addWidget(widget);
		} catch (Exception e) {
			WidgetsApplication.logger.error("Error while processing POST request to add widget : " + widget);
			throw e;
		}
	}

	@DeleteMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public boolean deleteById(@RequestParam int id) {
		try {
			WidgetsApplication.logger.info("DELETE request to delete widget with id : " + id);
			return service.deleteById(id);
		} catch (Exception e) {
			WidgetsApplication.logger.error("Error while proecessing DELETE request to delete widget with id : " + id);
			throw e;
		}
	}

	@PutMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Widget update(@RequestBody Widget widget) {
		try {
			WidgetsApplication.logger.info("PUT request for updating widget with id : " + widget.getId());
			return service.update(widget.getId(), widget);
		} catch (Exception e) {
			WidgetsApplication.logger
					.error("Error while processing PUT request for updating widget with id : " + widget.getId());
			throw e;
		}
	}

}
