package com.company.petapiwithswagger2doc.controller;

import com.company.petapiwithswagger2doc.dto.ResponseDTO;
import com.company.petapiwithswagger2doc.model.Pet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api("Controller for Pet model")
public class PetController
{
    private final List<Pet> pets = new ArrayList<>();

    @PostConstruct
    public void init ()
    {
        Pet pet = new Pet(1, "Dog", 1);
        pets.add(pet);
    }

    @GetMapping("/pet")
    @ApiOperation(value = "Get all pets in database with this method",
            notes = "This method does not allow argument")
    public ResponseEntity<ResponseDTO> getPets ()
    {
        return ResponseEntity.ok(ResponseDTO.of(pets, "Successfully got!"));
    }

    @PostMapping("/pet")
    public ResponseEntity<ResponseDTO> addPet (
            @RequestBody @ApiParam("Pet object") Pet pet
                                      )
    {
        pets.add(pet);
        return ResponseEntity.ok(ResponseDTO.of(pet, "Successfully got!"));
    }
}
