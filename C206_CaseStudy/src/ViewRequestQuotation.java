


public static String retrieveAllRequestQuotation(ArrayList<RequestQuotation> requestquotationList) {
		String output = "";
		for (int i = 0; i < requestquotationList.size(); i++) {

			output += String.format("%-15s %-10.2f %-10d %-20s %-10.2f %-15s %-15s %-15s %-15s\n",
					requestquotationList.get(i).getPropertyType(), requestquotationList.get(i).getAreaSize(),
					requestquotationList.get(i).getContact(), requestquotationList.get(i).getEmail(),
					requestquotationList.get(i).getBudget(), requestquotationList.get(i).getCompletedate(),
					requestquotationList.get(i).getRenovationType(), requestquotationList.get(i).getRenoStyle(),
					requestquotationList.get(i).getSRequest());

		}
		return output;

	}