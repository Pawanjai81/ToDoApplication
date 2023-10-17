package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class TodoController {
    @Autowired
    List<Todo> todoList;

    //create todos -Post APIs

    //add a todo

    @PostMapping("todo")
    public String addTodo(@RequestBody Todo myTodo)
    {
        todoList.add(myTodo);
        return "todo added";
    }



    // get api0

    //get all todos:

    @GetMapping("todos")
    public List<Todo> getAllTodos()
    {
        return  todoList;
    }


    //update todo :

    // send a todo id :id1 and status:s1

    @PutMapping("todo/id/{id}/status")
    public String setTodoStatusById(@PathVariable Integer id, @RequestParam boolean flag)
    {
        for(Todo todo : todoList)
        {
            if(todo.getTodoId().equals(id))
            {
                todo.setTodoStatus(flag);
                return "todo: "   + id  + "updated to " +  flag;
            }
        }

        return "Invalid id";
    }


    //delete api

    @DeleteMapping("todo/id/{id}")
    public String removeTodoById(@PathVariable Integer id)
    {
        for(Todo todo : todoList)
        {
            if(todo.getTodoId().equals(id))
            {
                todoList.remove(todo);
                return "todo: "   + id  + " removed";
            }
        }

        return "Invalid id";
    }
    @PostMapping("todos")
    public String  addTodo(@RequestBody List<Todo> myTodo){
//        for(Todo todo : myTodo){
//            todoList.add(todo);
//
//        }

        todoList.addAll(myTodo);   // this is one code same above for loop
        return myTodo.size()+ "todos were added";
    }

    @GetMapping("todos/undone")
    public List<Todo> getAllUnDoneTod(){
        List<Todo> unDoneTodos = new ArrayList<>();
        for(Todo todo : todoList){
            if(!todo.isTodoStatus()){
                unDoneTodos.add(todo);
            }
        }
        return unDoneTodos;

        //this line is is using streams to get all undone todos;
        //return todoList.stream().filter(todo -> !todo.isTodoStatus()).collect(Collectors.toList());
    }

    @DeleteMapping("remove")
    public List<Todo> removeTodos(@RequestBody List<Integer> idList){
//        for(Todo  originalTodo : todoList){
//            for(Integer id : idList){
//                if(originalTodo.getTodoId().equals(id)){
//                    todoList.remove(originalTodo);
//                }
//            }
//        }
        for(Integer id : idList){
            for(int i=0; i<todoList.size(); i++){
                if(id.equals(todoList.get(i).getTodoId())){
                    todoList.remove(todoList.get(i));
                    break;
                }
            }
        }
        return todoList;
    }
}
