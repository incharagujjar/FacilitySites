package facility.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import facility.exception.ResourceUnavailable;
import facility.model.Sites;
import facility.repository.SitesRepository;
import facility.service.SitesService;

@Service
public class SitesServiceImpl  implements SitesService{

	@Autowired
	private SitesRepository sitesRepository;
	
	
	
	@Override
	public Sites getSitesByFacilityId(long facilityId) {

		return sitesRepository.findById(facilityId).orElseThrow(() -> 
						new ResourceUnavailable("Facility", "Id", facilityId));
		
	}


	@Override
	public Sites saveSites(Sites sites) {
		return sitesRepository.save(sites);
	}

	@Override
	public List<Sites> getAllSites() {
		return sitesRepository.findAll();
	}

	@Override
	public Sites getSitesById(long id) {

		return sitesRepository.findById(id).orElseThrow(() -> 
						new ResourceUnavailable("Sites", "Id", id));
		
	}

	@Override
	public Sites updateSites(Sites sites, long id) {
		
	
		Sites existingSites = sitesRepository.findById(id).orElseThrow(
				() -> new ResourceUnavailable("Sites", "Id", id)); 
		
		existingSites.setName(sites.getName());
		existingSites.setPostalCode(sites.getPostalCode());
		existingSites.setPrefecture(sites.getPrefecture());
		existingSites.setCity(sites.getCity());
		existingSites.setAddress(sites.getAddress());
		existingSites.setAddress2(sites.getAddress2());
		existingSites.setCountry(sites.getCountry());
		existingSites.setLatitude(sites.getLatitude());
		existingSites.setLongitude(sites.getLongitude());
		existingSites.setNum_of_floors(sites.getNum_of_floors());
		existingSites.setFacilityid(sites.getFacilityid());
		existingSites.setSiteManagerName(sites.getSiteManagerName());
		existingSites.setSiteManagerEmail(sites.getSiteManagerEmail());
		existingSites.setUserid(sites.getUserid());
		existingSites.setCreateDate(sites.getCreateDate());
		existingSites.setPhoneNumber(sites.getPhoneNumber());
		existingSites.setPhonePrefix(sites.getPhonePrefix());
		existingSites.setSiteMarketingMessage(sites.getSiteMarketingMessage());
		existingSites.setSiteDescription(sites.getSiteDescription());
	
	 sitesRepository.save(existingSites);
		return existingSites;
	}

	@Override
	public void deleteSites(long id) {
		
		
		sitesRepository.findById(id).orElseThrow(() -> 
								new ResourceUnavailable("Sites", "Id", id));
		sitesRepository.deleteById(id);
	}
	
}

