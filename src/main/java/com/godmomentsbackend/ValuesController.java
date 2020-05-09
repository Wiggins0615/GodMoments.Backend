package com.godmomentsbackend;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/values")
public class ValuesController {

	@GetMapping()
	public ResponseEntity<List<String>> getUsernames() {
		List<String> usernames = new ArrayList<String>();
		usernames.add("First");
		usernames.add("Second");
		usernames.add("Third");
		return ResponseEntity.ok(usernames);
	}
}
