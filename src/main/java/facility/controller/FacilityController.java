package facility.controller;



	import java.util.List;

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

import facility.service.FacilityService;

	@RestController
	@RequestMapping("/api")
	public class FacilityController {
		 
		@Autowired
		private FacilityService facilityService;


		

		@PostMapping("/facility")
		public ResponseEntity<Facility> saveFacility(@RequestBody Facility facility){
			return new ResponseEntity<Facility>(facilityService.saveFacility(facility), HttpStatus.CREATED);
		}
		
		
		@GetMapping()
		public List<Facility> getAllFacility(){
			return facilityService.getAllFacility();
		}
		
		
		@GetMapping("/facility/{id}")
		public ResponseEntity<Facility> getFacilityById(@PathVariable("id") long facilityId){
			return new ResponseEntity<Facility>(facilityService.getFacilityById(facilityId), HttpStatus.OK);
		}

		
		
		
		
		@PutMapping("/facility/{id}")
		public ResponseEntity<Facility> updateFacility(@PathVariable("id") long id
													  ,@RequestBody Facility facility){
			return new ResponseEntity<Facility>(facilityService.updateFacility(facility, id), HttpStatus.OK);
		}
		
		
		@DeleteMapping("/facility/{id}")
		public ResponseEntity<String> deleteFacility(@PathVariable("id") long id){
			
		
			facilityService.deleteFacility(id);
			
			return new ResponseEntity<String>("Facility deleted successfully!.", HttpStatus.OK);
		}
		
	}





