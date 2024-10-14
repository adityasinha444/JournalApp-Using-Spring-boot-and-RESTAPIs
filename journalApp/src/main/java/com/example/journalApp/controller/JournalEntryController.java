package com.example.journalApp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.journalApp.entity.JournalEntry;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
	
	private Map<Long, JournalEntry> journalEntries = new HashMap<>();   
	
	 @GetMapping
	public List<JournalEntry> getAll(){   // localhost:8080/journal GET
		return new ArrayList<>(journalEntries.values());
		
	}
	 
	@PostMapping
	public boolean createEntry(@RequestBody JournalEntry myEntry) {    // localhost:8080/ journal POST
		journalEntries.put(myEntry.getId(),myEntry);
		return true;
	}
	  
}
