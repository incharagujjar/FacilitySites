package facility.service;


import java.util.List;


import facility.model.Sites;




public interface SitesService {
	Sites saveSites(Sites sites);
	Sites getSitesByFacilityId(long facilityId);
	List<Sites> getAllSites();
	
	Sites getSitesById(long id);
	Sites updateSites(Sites sites, long id);
	void deleteSites(long id);
	
 
	
	
	
	
}
	





		
	


