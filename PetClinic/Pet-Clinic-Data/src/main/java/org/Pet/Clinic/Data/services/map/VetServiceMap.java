package org.Pet.Clinic.Data.services.map;

import java.util.Set;

import org.Pet.Clinic.Data.model.Vet;
import org.Pet.Clinic.Data.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, String> implements CrudService<Vet, String> {

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(String id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
}
