import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(goodString("abcda"));
		System.out.println(goodString("abcdefghiab"));
		System.out.println(goodString("pqr"));
		System.out.println(goodString("bacdefghipalop"));
		System.out.println(goodString("abcdfedree"));
	}

	public static int goodString(String word) {
		int count1 = 0;
		int posi1 = 0;
		int posi2 = 0;
		int smallest = Integer.MAX_VALUE;
		String arr[] = word.split("");
		for (int a = 0; a < arr.length; a++) {
			for (int b = a + 1; b < arr.length; b++) {
				if (arr[a].equals(arr[b]) && a != b) {
					posi1 = a;
					posi2 = b;
					count1 = a + (arr.length - b - 1);
					if (count1 < smallest) {
						smallest = count1;
					}
				}
			}
		}
		if (smallest != Integer.MAX_VALUE) {
			return smallest;
		}
		return -1;
	}
}
