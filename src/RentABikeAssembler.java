import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RentABikeAssembler {
	public static final void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("RentABike-context.xml");
		CommandLineView clv = (CommandLineView)ctx.getBean("commandLineView");
		clv.printAllBikes();
	}
}