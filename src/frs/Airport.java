package frs;

public class Airport {
	int id;
	String code;
	String name;
	Address address;

	public Airport(int id, String code, String name, Address address) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Airport [id=" + id + ", code=" + code + ", name=" + name + ", address=" + address + "]";
	}

}
