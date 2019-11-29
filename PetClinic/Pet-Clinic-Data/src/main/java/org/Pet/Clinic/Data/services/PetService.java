package org.Pet.Clinic.Data.services;

import java.util.Set;

import org.Pet.Clinic.Data.model.Pet;

public interface PetService {
	Pet findById(String id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}
