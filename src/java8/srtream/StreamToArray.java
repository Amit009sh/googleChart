package java8.srtream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        
                 List<Integer> i = list.stream().collect(Collectors.toList());
                 System.out.println(i);
	}

}
