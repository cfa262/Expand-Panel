import java.util.Scanner;


public class Electronic {

	protected int numDevices;
	Scanner scan = new Scanner(System.in);
	public void readElectronicData()
	{
		System.out.println("How many devises are present?");
		numDevices = scan.nextInt();

		ElectClass device = new ElectClass(null, numDevices, numDevices, null, numDevices);

		for (int i = 0; i<numDevices; i++)
		{
			device.readData();
			System.out.println(device);
		}

	}
}
