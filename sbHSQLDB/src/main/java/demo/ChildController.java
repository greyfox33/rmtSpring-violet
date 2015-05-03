package demo;

import java.util.List;




//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "child")
public class ChildController {

    @Autowired
    ChildRepository repository;
    
	//private Logger log = Logger.getLogger(HelloController.class);

	/*
    @RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Child create(@RequestBody String text) {
		//log.info(String.format("Try to add a Word with text %s to the database", text));
		Word word = wordService.byText(text);
		if (word == null) {
			word = wordService.createWord(text);
		}
		return word;
	}
	*/

    
	@RequestMapping
	@ResponseBody
	public String all() {
		
        // fetch all customers
		String Out;
				
        Out = "Children found with findAll():<br>";
        Out += "-------------------------------<br>";
        for (Child child : repository.findAll()) {
            Out += child.toString();
        }
        Out += "end<br>-------------------------------<br>";
        return (Out);
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
	}
}
