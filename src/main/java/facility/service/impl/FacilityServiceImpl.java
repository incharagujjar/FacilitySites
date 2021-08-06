package facility.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import facility.exception.ResourceUnavailable;
import facility.model.Facility;
import facility.repository.FacilityRepository;
import facility.service.FacilityService;

@Service
public class FacilityServiceImpl  implements FacilityService{

	@Autowired
	private FacilityRepository facilityRepository;
	


	@Override
	public Facility saveFacility(Facility facility) {
		return facilityRepository.save(facility);
	}

	@Override
	public List<Facility> getAllFacility() {
		return facilityRepository.findAll();
	}

	@Override
	public Facility getFacilityById(long id) {

		return facilityRepository.findById(id).orElseThrow(() -> 
						new ResourceUnavailable("Facility", "Id", id));
		
	}

	@Override
	public Facility updateFacility(Facility facility, long id) {
		
	
		Facility existingFacility = facilityRepository.findById(id).orElseThrow(
				() -> new ResourceUnavailable("Facility", "Id", id)); 
		
		existingFacility.setName(facility.getName());
		existingFacility.setCompanyName(facility.getCompanyName());
		existingFacility.setCompanyLocation(facility.getCompanyLocation());
		existingFacility.setCompanyLocation2(facility.getCompanyLocation2());
		existingFacility.setPersonInCharge(facility.getPersonInCharge());
		existingFacility.setPersonInChargeDivision(facility.getPersonInChargeDivision());
		existingFacility.setPersonInChargePhonenumber(facility.getPersonInChargePhonenumber());
		existingFacility.setPersonInChargeEmail(facility.getPersonInChargeEmail());
		existingFacility.setCreateDate(facility.getCreateDate());
		existingFacility.setPinCode(facility.getPinCode());
		existingFacility.setContactFirstName(facility.getContactFirstName());
		existingFacility.setContactLastName(facility.getContactLastName());
		existingFacility.setStatus(facility.getStatus());
		existingFacility.setCity(facility.getCity());
		existingFacility.setState(facility.getState());
		existingFacility.setService_type(facility.getService_type());

	
	 facilityRepository.save(existingFacility);
		return existingFacility;
	}

	@Override
	public void deleteFacility(long id) {
		
		
		facilityRepository.findById(id).orElseThrow(() -> 
								new ResourceUnavailable("Facility", "Id", id));
		facilityRepository.deleteById(id);
	}
	
}






	