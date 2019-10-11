package lesson1_3;

public class Search {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int find = search(array, 0, 5);
		System.out.println(find);

	}
//original iteration.
	private static int searchIter(int [] data, int n, int target) {
		for (int i = 0; i < n; i++)
			if (data[i] == target)
				return i;
		return -1;
	}
	
//It's mine. My recursion.
	private static int search(int[] array, int start, int target) {
		if (start >= array.length)
			return -1;
		else if (target == array[start])
			return start;
		else 
			return search(array, start + 1,target);
	}

//lecture note's solution. explicit parameters
	private static int searchSolution(int[] data, int begin, int end, int target) {
		if (begin > end)
			return -1;
		else if (target == data[begin])
			return begin;
		else
			return searchSolution(data, begin + 1, end, target);
	}
//lecture note's solution2. explicit parameters
		private static int searchSolution2(int[] data, int begin, int end, int target) {
			if (begin > end)
				return -1;
			else if (target == data[end])
				return begin;
			else
				return searchSolution2(data, begin, end-1, target);
		}
//lecture note's solution3. explicit parameters
				private static int searchSolution3(int[] data, int begin, int end, int target) {
					if (begin > end)
						return -1;
					else {
						int middle = (begin + end)/2;
						if (data[middle] == target)
							return middle;
						int index = searchSolution3(data, begin, middle - 1, target);
						if (index != -1)
							return index;
						else
							return searchSolution3(data, middle + 1, end,target);
					}
				}
}

