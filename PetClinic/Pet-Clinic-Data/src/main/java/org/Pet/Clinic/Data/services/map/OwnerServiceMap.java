package org.Pet.Clinic.Data.services.map;

import java.util.Set;

import org.Pet.Clinic.Data.model.Owner;
import org.Pet.Clinic.Data.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, String> implements CrudService<Owner, String> {

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(String id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
}
