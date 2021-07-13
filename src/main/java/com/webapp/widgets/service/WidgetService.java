package com.webapp.widgets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.widgets.model.Widget;
import com.webapp.widgets.repository.WidgetRepository;

@Service
public class WidgetService {
	@Autowired
	WidgetRepository repo;
	
	public Optional<Widget> getById(int id) {
		return repo.findById(id);
	}
	
	public List<Widget> getAll() {
		return repo.findAll();
	}
	
	public Widget addWidget(Widget widget ) {
		repo.save(widget);
		return widget;
	}
	
	public boolean deleteById(int id) {
		boolean exists = repo.existsById(id);
		if(exists) repo.deleteById(id);
		return exists;
	}
	
	public Widget update(int id, Widget widget) {
		repo.deleteById(id);
		repo.save(widget);
		return widget;
	}
	
}
