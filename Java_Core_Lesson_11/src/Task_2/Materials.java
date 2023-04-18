package Task_2;

import java.util.Random;

public enum Materials {
	LEATHER, SUEDE, PLASTIC;

	private static Random r = new Random();

    public static Materials randomMaterials()  {
    	Materials[] arrayOfMaterials = values();
        return arrayOfMaterials[r.nextInt(arrayOfMaterials.length)];
    }
    
}
