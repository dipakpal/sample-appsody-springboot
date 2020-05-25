package application;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/hello")
public class MyRestController {
	
	@GetMapping
	public String getHello( ) {
		return "Hello Spring-Boot!!!";
	}

}
