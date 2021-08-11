package facility.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import facility.model.Facility;
import facility.model.Sites;

import facility.service.FacilityService;
import facility.service.SitesService;

@RestController
@RequestMapping("/api")
public class FacilityController {
	 
	@Autowired
	private FacilityService facilityService;
	@Autowired
	private SitesService sitesService;
	


	

	@PostMapping("/facility")
	public ResponseEntity<Facility> saveFacility(@RequestBody Facility facility){
		return new ResponseEntity<Facility>(facilityService.saveFacility(facility), HttpStatus.CREATED);
	}
	
	@PostMapping("/sites")
	public ResponseEntity<Sites> saveSites(@RequestBody Sites sites){
		return new ResponseEntity<Sites>(sitesService.saveSites(sites), HttpStatus.CREATED);
	}
	
	
	
//	
//	@GetMapping("facility/{id}")
//	public List<Facility> getAllFacility(){
//		return facilityService.getAllFacility();
//	}
	
//	@GetMapping()
//	public List<Sites> getAllSites(){
//		return sitesService.getAllSites();
//	}
	


	@GetMapping("/sitesfacility/{id}")		
public ResponseEntity<Sites> getSitesByFacilityId(@PathVariable("facilityId") long facilityId){
	return new ResponseEntity<Sites>(sitesService.getSitesByFacilityId(facilityId), HttpStatus.OK);
	
	}


	  

	@GetMapping("/facility/{id}")
	public ResponseEntity<Facility> getFacilityById(@PathVariable("id") long facilityId){
		return new ResponseEntity<Facility>(facilityService.getFacilityById(facilityId), HttpStatus.OK);
	}

	
	@GetMapping("/sites/{id}")
	public ResponseEntity<Sites> getSitesById(@PathVariable("id") long sitesId){
		return new ResponseEntity<Sites>(sitesService.getSitesById(sitesId), HttpStatus.OK);
	}

	
	
	
	
	@PutMapping("/facility/{id}")
	public ResponseEntity<Facility> updateFacility(@PathVariable("id") long id
												  ,@RequestBody Facility facility){
		return new ResponseEntity<Facility>(facilityService.updateFacility(facility, id), HttpStatus.OK);
	}
	
	
	@PutMapping("/sites/{id}")
	public ResponseEntity<Sites> updateSites(@PathVariable("id") long id
												  ,@RequestBody Sites sites){
		return new ResponseEntity<Sites>(sitesService.updateSites(sites, id), HttpStatus.OK);
	}
	
	@DeleteMapping("/facility/{id}")
	public ResponseEntity<String> deleteFacility(@PathVariable("id") long id){
		
	
		facilityService.deleteFacility(id);
		
		return new ResponseEntity<String>("Facility deleted successfully!.", HttpStatus.OK);
	}
		
		
		@DeleteMapping("/sites/{id}")
		public ResponseEntity<String> deleteSites(@PathVariable("id") long id){
			
		
			sitesService.deleteSites(id);
			
			return new ResponseEntity<String>("Sites deleted successfully!.", HttpStatus.OK);
		
	
			
	}
	
}


