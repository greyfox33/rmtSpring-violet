package demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Map;
//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "status")
public class StatusController {

    @Autowired
    StatusRepository repository;
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Status> getAll() {
        return (List<Status>)repository.findAll();
    }
    
    @RequestMapping(method=RequestMethod.GET, value="{child_id}")
    public List<Status> getOne(@PathVariable Long child_id) {
       	return (List<Status>) repository.findByChildID(child_id);
    }
    
//    @RequestMapping(method=RequestMethod.POST)
//    public Child create (@RequestBody Child child) {
//        return null;
//    }
 
}
    
//	@RequestMapping
//	@ResponseBody
//	public String all() {
//		
//        // fetch all customers
//		String Out;
//				
//        Out = "Children found with findAll():<br>";
//        Out += "-------------------------------<br>";
//        for (Child child : repository.findAll()) {
//            Out += child.toString();
//        }
//        Out += "end<br>-------------------------------<br>";
//        return (Out);
        // fetch an individual customer by ID
		/*
        Child child = repository.findOne(1L);
        System.out.println("Child found with findOne(1L):");
        System.out.println("--------------------------------");
        System.out.println(child);
        System.out.println();
        */

        // fetch customers by last name
        /*
        System.out.println("Child found with findByLastName('johnson'):");
        System.out.println("--------------------------------------------");
        for (Child johnson : repository.findByLastName("johnson")) {
            System.out.println(johnson);
        }
        */
