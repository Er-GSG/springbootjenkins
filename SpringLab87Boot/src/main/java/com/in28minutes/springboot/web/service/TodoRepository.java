package com.in28minutes.springboot.web.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.web.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

	// service.retrieveTodos(name)

	// service.deleteTodo(id);
	// service.retrieveTodo(id)
	// service.updateTodo(todo)
	// service.addTodo(getLoggedInUserName(model), todo.getDesc(),
	// todo.getTargetDate(),false);
}