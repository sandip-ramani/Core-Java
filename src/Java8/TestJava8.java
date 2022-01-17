package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		USB usb = new USB("3.0.1");
		USB usb1 = new USB("3.0.2");
		USB usb2 = null;
		Optional op1 = Optional.of(usb);
		Optional op3 = Optional.of(usb1);
		Optional op4 = Optional.ofNullable(usb2);
		SDCard sdcard = new SDCard(op1, "Microsoft");
		SDCard sdcard1 = new SDCard(op3, "Microsoft");
		SDCard sdcard2 = new SDCard(op4, "Microsoft");
		Optional op2 = Optional.of(sdcard);
		Optional op5 = Optional.of(sdcard1);
		Optional op6 = Optional.of(sdcard2);
		Computer com = new Computer("Core i5",op2,"HP");
		Computer com1 = new Computer("Core i6",op5,"Intel");
		Computer com2 = new Computer("Core i7",op6,"Sony");
		
		List<Computer> li = new ArrayList<>();
		li.add(com);
		li.add(com1);
		li.add(com2);
		
		/*String version = com1.
				
				getSdCard().get().getUsb().get().getVersion();
		System.out.println(version);*/
		
		
		
	//	List<SDCard> versions = li.stream().flatMap(Computer::getSdCard).collect( Collectors.toList());
      
		li.stream().map(e->e.getSdCard().orElse(new SDCard(Optional.of(new USB("No USB")), "No SD Card")))
		.map(e->e.getUsb().orElse(new USB("No version provided")))
		.map(i->i.getVersion()).filter(s->"3.0.1".equalsIgnoreCase(s)).forEach(System.out::println);
		
		Optional<Computer> opc = Optional.of(com1);
		com1.getSdCard().flatMap(SDCard::getUsb).map(USB::getVersion).ifPresent(System.out::println);
		//.map(s->s.get()).map(i->i.getUsb()).map(j->j.get()).map(x->x.getVersion()).forEach(System.out::println);
		
		System.out.println(opc.flatMap(Computer::getSdCard).flatMap(SDCard::getUsb).map(USB::getVersion).orElse("not available"));
		
	}

}
