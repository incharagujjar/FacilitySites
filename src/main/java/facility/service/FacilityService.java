package facility.service;


	
	import java.util.List;


	import facility.model.Facility;



	public interface FacilityService {
		Facility saveFacility(Facility facility);
		List<Facility> getAllFacility();
		
		Facility getFacilityById(long id);
		Facility updateFacility(Facility facility, long id);
		void deleteFacility(long id);
	
	}




