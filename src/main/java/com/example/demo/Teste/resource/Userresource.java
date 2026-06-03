package com.example.demo.Teste.resource;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;




import com.example.demo.Teste.User;

@RestController
@RequestMapping(value="/users")

public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L,"Tarciso","tarciso@gmail.com","99999","12123");
		return ResponseEntity.ok().body(u);
		
	}

}
