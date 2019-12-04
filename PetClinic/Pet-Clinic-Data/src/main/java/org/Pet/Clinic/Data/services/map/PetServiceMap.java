package org.Pet.Clinic.Data.services.map;

import java.util.Set;

import org.Pet.Clinic.Data.model.Pet;
import org.Pet.Clinic.Data.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, String> implements CrudService<Pet, String> {

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(String id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
}
