package Person;

public class Address {
	private String addressLine1;
	private String city;
	private String state;
	private Integer zipCode;
	
	public Address(String addressLine1, String city, String state, Integer zipCode) {
		this.addressLine1 = addressLine1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ "]";
	}
	
	
}
