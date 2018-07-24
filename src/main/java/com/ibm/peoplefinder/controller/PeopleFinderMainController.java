package com.ibm.peoplefinder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleFinderMainController {
  
  
  @GetMapping("/")
  public String getValue
    (){
    
       return "Inside PeopleFinderMainController";
  }
}