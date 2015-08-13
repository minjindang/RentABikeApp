import java.util.*;
public class RentABike {
	private String storeName;
	final List bikes = new ArrayList();

	public RentABike(String storeName){
		this.storeName = storeName;
		bikes.add(new Bike("Shimano","Roadmaster", 20,"111111", 15,"Fair"));
		bikes.add(new Bike("Cannondale","F2000 XTR", 18,"222222", 12,"Excellent"));
		bikes.add(new Bike("Trek","6000", 19,"333333", 12.4,"Fair"));
	}

	public String toString(){return "RentABike: " + storeName;}

	public List getBikes(){return bikes;}

	public Bike getBikes(String serialNo){
		Iterator iter = bikes.iterator();
		while(iter.hasNext()){
			Bike bike = (Bike)iter.next();
			if(serialNo.equals(bike.getSerialNo() )) return bike;
		}
		return null;
	}
}