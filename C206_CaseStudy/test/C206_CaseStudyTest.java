import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private ArrayList<Package> packageList;
	private Package p1;
	private Package p2;
	@Test
	public void addPackageTest() {
		//Item is not null, so that can add a new item- boundary
		assertNotNull("Test if there is valid package arrayList to add to",packageList);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		C206_CaseStudy.addPackage(packageList,p1);
		assertEuqals("Test that Package arrayList size is 1",1,packageList.size());
		
	}
//say
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
