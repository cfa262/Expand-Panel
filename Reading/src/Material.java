import java.util.Arrays;
import java.util.Scanner;


public class Material {
	private String materialName;
	private int numberOfMaterials;
	private MatClass[] Material;

	public void readMaterialData()
	{
		MatClass source = new MatClass(materialName, materialName, materialName, numberOfMaterials);

		Scanner scan = new Scanner(System.in);

		System.out.println("How many Materials are there?");
		numberOfMaterials= scan.nextInt();

		for (int i=0; i<numberOfMaterials; i++)
		{
			System.out.println("What is Material " + (i+1) + "?");
			materialName = scan.next();

			System.out.println("Enter "+materialName+ " information.");
			source.readData();
			System.out.println(source);
		}

	}

	public Material(String materialName, int i, MatClass[] Material) {
		this.materialName = materialName;
		this.numberOfMaterials = i;
		this.Material = Material;
	}

	public MatClass[] getMaterial() {
		return Material;
	}

	public void setMaterial(MatClass[] Material) {
		this.Material = Material;
	}

}
