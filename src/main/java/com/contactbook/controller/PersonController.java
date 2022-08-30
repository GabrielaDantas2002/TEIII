package com.contactbook.controller;



import com.contactbook.entity.Person;
import com.contactbook.repository.PersonRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/person")
@Api(value = "API Rest for people management")
@CrossOrigin("*")
public class PersonController {

    @Autowired
    private PersonRepository repository;

    @PostMapping(value = "/save")
    @ApiOperation("Insert person in table person")
    @ResponseStatus(HttpStatus.CREATED)
    public Person save(@RequestBody Person person){
        return repository.save(person);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "Return a contact list")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> list() {
        return repository.findAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    @ApiOperation("Delete a person from table")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @PutMapping("/update")
    @ApiOperation("Update a person in table person")
    @ResponseStatus(HttpStatus.OK)
    public Person update(@RequestBody Person person){
        return repository.save(person);
    }
}
