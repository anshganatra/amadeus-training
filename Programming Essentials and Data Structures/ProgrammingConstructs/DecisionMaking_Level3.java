import java.util.*;

public class DecisionMaking_Level3 {

	public static void main(String[] args) {
		
		float costToVendor = 0;
		float paidByClient = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Vendor Dollar Rate: ");
		float vendorRate = sc.nextFloat();
		
		System.out.println("Enter the total hours: ");
		float totalHours = sc.nextFloat();
		
		paidByClient += vendorRate * totalHours;
		
		System.out.println("Was Hardware/Infrastructure Purchased? (Y/N): ");
		boolean hardwarePurchased = (sc.next().toLowerCase().strip() == "y") ? true : false;
		
		if (hardwarePurchased) {
			System.out.println("Total Hardware/Infrastructure Cost: ");
			float hardwareCost = sc.nextFloat();
			
			System.out.println("Was Hardware/Infrastructure Cost borned by client? (Y/N): ");
			boolean hardwarePurchaseSponsored = (sc.next().toLowerCase().strip() == "y") ? true : false;
			
			costToVendor += (hardwarePurchaseSponsored)? hardwareCost * 0.7 :hardwareCost;
			paidByClient += hardwarePurchaseSponsored ? hardwareCost * 0.3 : 0;
		}
		
		System.out.println("Were Software Licenses Needed? (Y/N): ");
		boolean softwareLicensed = (sc.next().toLowerCase().strip() == "y") ? true : false;
		if (softwareLicensed) {
			
			System.out.println("Total Software License Cost: ");
			float softwareCost = sc.nextFloat();
			
			System.out.println("Was Software License Cost borned by client? (Y/N): ");
			boolean softwareLicenseSponsored = (sc.next().toLowerCase().strip() == "y") ? true : false;
			boolean softwareInfrequent = false;
			if(softwareLicenseSponsored) {
				System.out.println("Is the Software Infrequently Used/Client Proprietary? (Y/N):  ");
				softwareInfrequent = (sc.next().toLowerCase().strip() == "y") ? true : false;

			}
			
			costToVendor += (softwareLicenseSponsored) ? (softwareInfrequent? 0 : 0.5 * softwareCost) : softwareCost;
			paidByClient += softwareLicenseSponsored ? (softwareInfrequent ? softwareCost : 0.5 * softwareCost) : 0;
		}
		
		System.out.println("Were external consultants employed? (Y/N): ");
		boolean externalConsultantsEmployed = (sc.next().toLowerCase().strip() == "y") ? true : false;
		if (externalConsultantsEmployed) {
			System.out.println("Dollar Rate for Consultants: ");
			float consultantDollarRate = sc.nextFloat();
			System.out.println("Total hours taken by consultants: ");
			float consultantHours = sc.nextFloat();
			
			costToVendor += consultantDollarRate * consultantHours;
		}
		
		System.out.println("Total Cost Borne By Client: " + paidByClient);
		System.out.println("Cost to Vendor: " + costToVendor);
		System.out.println("PROFIT/LOSS for Vendor: " + (paidByClient - costToVendor));
		
		sc.close();

	}

}
