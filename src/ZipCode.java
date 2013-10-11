class ZipCode {

	public static String searchAddress(int zipcode) {

		String address = null;
		switch (zipcode) {
		case 0:
			address = "Tokyo";
			break;
		case 1:
			address = "Osaka";
			break;
		case 2:
			address = "Aichi";
			break;
		default:
			address = "Japan";
			break;
		}
		return address;
	}

}
