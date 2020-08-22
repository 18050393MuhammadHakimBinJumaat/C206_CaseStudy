import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AddPackageTest {

	@Test
	public void addPackageTest{
		// Item list is not null, so that can add a new item - boundary
				assertNotNull("Check if there is valid Camcorder arraylist to add to", camcorderList);
				//Given an empty list, after adding 1 item, the size of the list is 1 - normal
				//The item just added is as same as the first item of the list
				ResourceCentre.addCamcorder(camcorderList, cc1);
				assertEquals("Check that Camcorder arraylist size is 1", 1, camcorderList.size());
				assertSame("Check that Camcorder is added", cc1, camcorderList.get(0));
				
				//Add another item. test The size of the list is 2? -normal
				//The item just added is as same as the second item of the list
				ResourceCentre.addCamcorder(camcorderList, cc2);
				assertEquals("Check that Camcorder arraylist size is 2", 2, camcorderList.size());
				assertSame("Check that Camcorder is added", cc2, camcorderList.get(1));
	}
}
