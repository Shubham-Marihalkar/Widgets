package com.webapp.widgets.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.widgets.model.Widget;

@Repository
public interface WidgetRepository extends CrudRepository<Widget, Integer> {

	@Override
	List<Widget> findAll();
}
