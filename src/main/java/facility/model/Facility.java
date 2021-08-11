package facility.model;







import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

import javax.persistence.Table;


	import lombok.Data;

	@Data
	@Entity
@Table(name="facilities")
	public class Facility {
		public Facility() {}
		

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long facilityid;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "companyName")
		private String companyName;
		
		@Column(name = "companyLocation")
		private String companyLocation;
		
		@Column(name = "companyLocation2")
		private String companyLocation2;
		
		@Column(name = "personInCharge")
		private String personInCharge;
		
		@Column(name = "personInChargeDivision")
		private String personInChargeDivision;
		
		@Column(name = "personInChargePhonenumber")
		private String personInChargePhonenumber;
		
		@Column(name = "personInChargeEmail")
		private String personInChargeEmail;
		
		@Column(name = "createDate")
		private String createDate;
		
		@Column(name = "pinCode")
		private String pinCode;
		

	@Column(name = "contactFirstName")
		private String contactFirstName;
	
	

		@Column(name = "contactLastName")
		private String contactLastName;
		
		@Column(name = "status")
		private String status;
		
		@Column(name = "city")
		private String city;
		
		@Column(name = "state")
		private String state;
		
		@Column(name = "service_type")
		private String service_type;
	
	


		public Facility(long facilityid, String name, String companyName, String companyLocation, String companyLocation2, String personInCharge, String personInChargeDivision, String personInChargePhonenumber, String personInChargeEmail, String createDate, String pinCode, String contactFirstName, String contactLastName, String status, String city, String state, String service_type  ) {
			super();
			
			this.facilityid = facilityid;
			this.name = name;
			this.companyName = companyName;
			this.companyLocation = companyLocation;
			this.companyLocation2 = companyLocation2;
			this.personInCharge = personInCharge;
			 this.personInChargeDivision =  personInChargeDivision;
			 this.personInChargeDivision =  personInChargeDivision;
			 this.personInChargePhonenumber = personInChargePhonenumber;
			 this.personInChargeEmail = personInChargeEmail;
			 this.createDate = createDate;
			 this.pinCode = pinCode;
			 this.contactFirstName = contactFirstName;
			 this.contactLastName = contactLastName;
			 this.status = status;
			 this.city = city;
			 this.state = state;
			 this.service_type = service_type;
		}




		public long getFacilityid() {
			return facilityid;
		}




		public void setFacilityid(long facilityid) {
			this.facilityid = facilityid;
		}




		public String getName() {
			return name;
		}




		public void setName(String name) {
			this.name = name;
		}




		public String getCompanyName() {
			return companyName;
		}




		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}




		public String getCompanyLocation() {
			return companyLocation;
		}




		public void setCompanyLocation(String companyLocation) {
			this.companyLocation = companyLocation;
		}




		public String getCompanyLocation2() {
			return companyLocation2;
		}




		public void setCompanyLocation2(String companyLocation2) {
			this.companyLocation2 = companyLocation2;
		}




		public String getPersonInCharge() {
			return personInCharge;
		}




		public void setPersonInCharge(String personInCharge) {
			this.personInCharge = personInCharge;
		}




		public String getPersonInChargeDivision() {
			return personInChargeDivision;
		}




		public void setPersonInChargeDivision(String personInChargeDivision) {
			this.personInChargeDivision = personInChargeDivision;
		}




		public String getPersonInChargePhonenumber() {
			return personInChargePhonenumber;
		}




		public void setPersonInChargePhonenumber(String personInChargePhonenumber) {
			this.personInChargePhonenumber = personInChargePhonenumber;
		}




		public String getPersonInChargeEmail() {
			return personInChargeEmail;
		}




		public void setPersonInChargeEmail(String personInChargeEmail) {
			this.personInChargeEmail = personInChargeEmail;
		}




		public String getCreateDate() {
			return createDate;
		}




		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}




		public String getPinCode() {
			return pinCode;
		}




		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}




		public String getContactFirstName() {
			return contactFirstName;
		}




		public void setContactFirstName(String contactFirstName) {
			this.contactFirstName = contactFirstName;
		}




		public String getContactLastName() {
			return contactLastName;
		}




		public void setContactLastName(String contactLastName) {
			this.contactLastName = contactLastName;
		}




		public String getStatus() {
			return status;
		}




		public void setStatus(String status) {
			this.status = status;
		}




		public String getCity() {
			return city;
		}




		public void setCity(String city) {
			this.city = city;
		}




		public String getState() {
			return state;
		}




		public void setState(String state) {
			this.state = state;
		}




		public String getService_type() {
			return service_type;
		}




		public void setService_type(String service_type) {
			this.service_type = service_type;
		}
		
	}
			
		
		

		

		

		