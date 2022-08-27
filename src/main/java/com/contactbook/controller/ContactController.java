package com.contactbook.controller;

import com.contactbook.entity.Contact;
import com.contactbook.repository.ContactRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/contact")
@Api(value = "API Rest for contacts management")
@CrossOrigin("*")
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @PostMapping(value = "/save")
    @ApiOperation("Insert contact in table contact")
    @ResponseStatus(HttpStatus.CREATED)
    public Contact save(@RequestBody Contact contact){
        return repository.save(contact);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "Return a contact list")
    @ResponseStatus(HttpStatus.OK)
    public List<Contact> list() {
        return repository.findAll();
    }

    @DeleteMapping(value = "/delete/{id}")
    @ApiOperation("Delete a contact from table")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }

    @PutMapping("/update")
    @ApiOperation("Update a contact in table contact")
    @ResponseStatus(HttpStatus.OK)
    public Contact update(@RequestBody Contact contact){
        return repository.save(contact);
    }
}
