package org.javapracticeprograms;

public class ArrayPracticeProgram {

	public static void main(String[] args) {
		int[] marks = { 10, 20, 30, 40, 10, 50, 30, 60, 70, 10 };
		int[] freq = new int[marks.length];

		for (int i = 0; i < marks.length; i++) {

			int no = marks[i];
			int count = 1;
			for (int j = i + 1; j < marks.length; j++) {
				if (no == marks[j]) {
					count++;
					freq[j] = -1;
				}
			}
			if (freq[i]!=-1) {
				freq[i]=count;
			}
		}
		int countOfDuplicates=0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i]>1) {
				countOfDuplicates++;	
			}
		}
		System.out.println("Duplicate Values Count:"+countOfDuplicates);
		int UniqueValues=0;
		for (int i = 0; i < freq.length; i++) {
			
			if (freq[i]==1) {
				UniqueValues++;
			}
			
		}
		System.out.println("Unique Values Count:"+UniqueValues);
		
		for (int i = 0; i < freq.length; i++) {
			
			if (freq[i]!=-1) {
				
				System.out.println(marks[i]+" appeard "+freq[i]);
				
			}
			
		}
	}

}