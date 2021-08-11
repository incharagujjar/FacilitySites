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
	
@Table(name="sites")
	public class Sites {
		public Sites() {}
		
		

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long sitesid;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "postalCode")
		private String postalCode;
		
		@Column(name = "prefecture")
		private String prefecture;
		
		@Column(name = "city")
		private String city;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "address2")
		private String address2;
		
		@Column(name = "country")
		private String country;
		
		@Column(name = "latitude")
		private String latitude;
		
		@Column(name = "longitude")
		private String longitude;
		
		@Column(name = "num_of_floors")
		private String num_of_floors;
		

	@Column(name = "facilityid")
		private String facilityid;
	
	

		@Column(name = "siteManagerName")
		private String siteManagerName;
		
		@Column(name = "siteManagerEmail")
		private String siteManagerEmail;
		
		@Column(name = "userid")
		private String userid;
		
		@Column(name = "createDate")
		private String createDate;
		
		@Column(name = "phoneNumber")
		private String phoneNumber;
		
		@Column(name = "phonePrefix")
		private String phonePrefix;
		
		@Column(name = "siteMarketingMessage")
		private String siteMarketingMessage;
		
		@Column(name = "siteDescription")
		private String siteDescription;
		
		


		
	
		

		public Sites(long sitesid, String name, String postalCode, String prefecture, String city, String address, String address2, String country, String latitude, String longitude, String num_of_floors, String facilityid, String siteManagerName, String siteManagerEmail, String userid, String createDate, String phoneNumber, String phonePrefix, String siteMarketingMessage, String siteDescription ) {
			super();
			this.sitesid = sitesid;
			this.name = name;
			this.postalCode = postalCode;
			this.prefecture = prefecture;
			this.city = city;
			this.address = address;
			 this.address2 =  address2;
			 this.country =  country;
			 this.latitude = latitude;
			 this.longitude = longitude;
			 this.num_of_floors = num_of_floors;
			 this.facilityid = facilityid;
			 this.siteManagerName = siteManagerName;
			 this.siteManagerEmail= siteManagerEmail;
			 this.userid =userid;
			 this.createDate = createDate;
			 this.phoneNumber = phoneNumber;
			 this.phonePrefix = phonePrefix;
			 this.siteMarketingMessage = siteMarketingMessage;
			 this.siteDescription = siteDescription;
		
		}

		

		

		public long getSitesid() {
			return sitesid;
		}


		public void setSitesid(long sitesid) {
			this.sitesid = sitesid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getPrefecture() {
			return prefecture;
		}

		public void setPrefecture(String prefecture) {
			this.prefecture = prefecture;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAddress2() {
			return address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getLatitude() {
			return latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getNum_of_floors() {
			return num_of_floors;
		}

		public void setNum_of_floors(String num_of_floors) {
			this.num_of_floors = num_of_floors;
		}

		public String getFacilityid() {
			return facilityid;
		}

		public void setFacilityid(String facilityid) {
			this.facilityid = facilityid;
		}

		public String getSiteManagerName() {
			return siteManagerName;
		}

		public void setSiteManagerName(String siteManagerName) {
			this.siteManagerName = siteManagerName;
		}

		public String getSiteManagerEmail() {
			return siteManagerEmail;
		}

		public void setSiteManagerEmail(String siteManagerEmail) {
			this.siteManagerEmail = siteManagerEmail;
		}

		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		

		public String getCreateDate() {
			return createDate;
		}



		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}



		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPhonePrefix() {
			return phonePrefix;
		}

		public void setPhonePrefix(String phonePrefix) {
			this.phonePrefix = phonePrefix;
		}

		public String getSiteMarketingMessage() {
			return siteMarketingMessage;
		}

		public void setSiteMarketingMessage(String siteMarketingMessage) {
			this.siteMarketingMessage = siteMarketingMessage;
		}

		public String getSiteDescription() {
			return siteDescription;
		}

		public void setSiteDescription(String siteDescription) {
			this.siteDescription = siteDescription;
		}
	}


