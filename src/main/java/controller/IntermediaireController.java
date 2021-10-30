package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Intermediaire;
import service.IntermediaireService;

@RestController
public class IntermediaireController {
	
	 @Autowired
	    private IntermediaireService intermediaireService;

	    /**
	    * Read - Get all employees
	    * @return - An Iterable object of Employee full filled
	    */
	    @GetMapping("/intermediaires")
	    public Iterable<Intermediaire> getIntermediaires() {
	        return intermediaireService.getIntermediaires();
	    }

}




