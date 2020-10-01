package be.abis.ExA1.model;


public class Address {
	
	private String street;
	private String nr;
	private String zipCode;
	private String town;
	private String country;
	private String countryCode;
	
	public Address(String street, String nr, String zipCode, String town, String country, String countryCode) {
		this.street = street;
		this.nr = nr;
		this.zipCode = zipCode;
		this.town = town;
		this.country = country;
		this.countryCode = countryCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
		this.nr = nr;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public boolean checkBelgianZipCode() {
		return isNumeric(this.zipCode);


	}
	public static boolean isNumeric(final String str) {

		// null or empty
		if (str == null || str.length() == 0) {
			return false;
		}
			for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
			return true;
	}

	public void writeAddressToFile() {
/*		try {
/*
			//BufferedWriter bw = Files.newBufferedWriter(Paths.get("personinfo.txt"))

			File file = new File("C:\\Users\\sammy\\git\\extoolintj2\\JavaTest\\JavaTest\\Adresinfo.txt");
			int countBeforeWrite = 0;
			if (!file.exists()) {
				file.createNewFile();
				countBeforeWrite = Files.readAllLines("C:\\\\Users\\\\sammy\\\\git\\\\extoolintj2\\\\JavaTest\\\\JavaTest\\\\Adresinfo.txt\".size());
						  
			}
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(this.toString());
			pw.close();
		}catch(IOException e) {
			System.out.println("Exception occurred:");
			e.printStackTrace();
		}

 */
	}


	@Override
	public String toString() {
		String text = this.street + " " + this.nr + " " + this.town + " " + this.zipCode;
		return text;
	}



}
