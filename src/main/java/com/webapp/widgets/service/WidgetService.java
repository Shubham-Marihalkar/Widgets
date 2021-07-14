package com.webapp.widgets.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.widgets.WidgetsApplication;
import com.webapp.widgets.model.Widget;
import com.webapp.widgets.repository.WidgetRepository;

@Service
public class WidgetService {
	@Autowired
	WidgetRepository repo;
	
	public Optional<Widget> getById(int id) {
		try{
			WidgetsApplication.logger.info("service for fetchin Widget by id");
			return repo.findById(id);
		}catch(Exception e) {
			WidgetsApplication.logger.error("Error in service while fetching Widget by id");
			throw e;
		}
	}
	
	public List<Widget> getAll() {
		try{
			WidgetsApplication.logger.info("service for fetchin all Widgets");
			return repo.findAll();
		}catch(Exception e) {
			WidgetsApplication.logger.error("Error in service while fetching all Widgets");
			throw e;
		}
	}
	
	public Widget addWidget(Widget widget ) {
		try{
			WidgetsApplication.logger.info("service for adding Widget");
			repo.save(widget);
			return widget;
		}catch(Exception e) {
			WidgetsApplication.logger.error("Error in service while adding Widgets");
			throw e;
		}
	}
	
	public boolean deleteById(int id) {
		try{
			WidgetsApplication.logger.info("service for deleting Widget");
			boolean exists = repo.existsById(id);
			if(exists) repo.deleteById(id);
			return exists;
		}catch(Exception e) {
			WidgetsApplication.logger.error("Error in service while deleting Widgets");
			throw e;
		}
	}
	
	public Widget update(int id, Widget widget) {
		try{
			WidgetsApplication.logger.info("service for updating Widget");
			repo.deleteById(id);
			repo.save(widget);
			return widget;
		}catch(Exception e) {
			WidgetsApplication.logger.error("Error in service while updating Widgets");
			throw e;
		}
	}
	
}
