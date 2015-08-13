public class RentABikeTest extends TestCase {

	private RentABike rentaBike;

	public void setUp() {
		rentaBike = new ArrayListRentABike("Bruce's Bikes");
	}

	public void testGetName() {
		assertEquals("Bruce's Bikes", rentaBike.getStoreName() );
	}

	public void testGetBike() {
		Bike bike = rentaBike.getBike("11111");
		assertNotNull(bike);
		assertEquals("Shimano", bike.getManufacturer() );
	}

	public void testGetBikes() {
		List bikes = rentaBike.getBikes();
		assertNotNull(bikes);
		assertEquals(3, bikes.size());
	}
}