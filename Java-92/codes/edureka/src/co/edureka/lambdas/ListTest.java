package co.edureka.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(86,74,93,65,82,76,99,80);

		System.out.println(marks);
		
		Collections.sort(marks,	(o1, o2) -> (o1>o2)?-1:1);

		System.out.println(marks);
		
		marks.forEach((t) -> System.out.println(t));
		
		Stream<Integer> marksStream = marks.stream();
		System.out.println("no of subjects = " + marksStream.count());
		
		marks.stream().forEach(t -> System.out.println(t));
		System.out.println();
		
		List<Integer> evenMarks = marks.stream().filter(t -> (t%2==0)?true:false).collect(Collectors.toList());
		System.out.println("even marks = " + evenMarks);
		
		System.out.println("\n adding a grace mark of 5 for all subjects: ");
		
		Stream<Integer> marksWithGraceStream = marks.stream().map(t -> t+5);
		List<Integer> graceMarks = marksWithGraceStream.collect(Collectors.toList());
		System.out.println(graceMarks);
	}

}
