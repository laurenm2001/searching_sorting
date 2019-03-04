import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class SearchAndSort {
	
	/**
	 * Program execution starts here.
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		SearchAndSort sas = new SearchAndSort();
		Scanner in = new Scanner(System.in);
		String target = "";
		String algorithm = "";
		int check = 0;
		String dataType = "";
		String store = "";
		 
		do {
			do {
				System.out.print("What algorithm would you like to execute? ");
				algorithm = in.nextLine();
				if(algorithm.equals("binary") || algorithm.equals("linear") || algorithm.equals("bubble") 
						|| algorithm.equals("selection") || algorithm.equals("insertion") || algorithm.equals("merge")) {
					check = 1;
				}else if(algorithm.equals("quit")) {
					check = 2;
				}
			}while(check < 1);
			if(check < 2) {
			check = 0;
			
			do {
				System.out.print("What type of data? ");
				dataType = in.nextLine();
				
				if(dataType.equals("integers") || dataType.equals("strings")) {
					check = 1;
				}
			}while(check != 1);
			
			check = 0;
			
			do {
				System.out.print("How is it stored? ");
				store = in.nextLine();
				if(store.equals("array") || store.equals("list") ) {
					check = 1;
				}
			}while(check != 1);
			
			System.out.print("Enter the data. ");
			String data = in.nextLine();
			
			if(algorithm.equals("linear") || algorithm.equals("binary")) {
				 System.out.print("Enter target value. ");
				target = in.nextLine();
			}
		
		
		
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		ArrayList<String> stringArray = new ArrayList<String>();
		String[] dataArray = data.split(",\\s+");
		
		if(dataType.equals("integers")){
			for (int i = 0; i < dataArray.length; i++) {
				intArray.add(Integer.parseInt(dataArray[i])) ;
			}
		}else {
			for (int i = 0; i < dataArray.length; i++) {
				stringArray.add(dataArray[i]) ;
			}
		}
				
		
		if(algorithm.equals("bubble")) {
			if(dataType.equals("integers") && store.equals("array")) {
				ArrayList<Integer> newArray = sas.bubbleSort(intArray);
				System.out.println(newArray);
			}else if(dataType.equals("integers") && store.equals("list")) {
				ArrayList<Integer> newArray = sas.bubbleSort(intArray);
				int[] newlist = new int[newArray.size()];
				for(int i = 0; i< newlist.length; i++) {
					newlist[i] = newArray.get(i);
				}
				System.out.println(Arrays.toString(newlist));
			}else if(dataType.equals("strings") && store.equals("array")) {
				ArrayList<String> newArray = sas.bubbleSortString(stringArray);
				System.out.println(newArray);
			}else {
				ArrayList<String> newArray = sas.bubbleSortString(stringArray);
				String[] newlist = new String[newArray.size()];
				for(int i = 0; i< newlist.length; i++) {
					newlist[i] = newArray.get(i);
				}
				System.out.println(Arrays.toString(newlist));			}
		}else if(algorithm.equals("selection")) {
			if(dataType.equals("integers") && store.equals("array")) {
				ArrayList<Integer> newArray = sas.selectionSort(intArray);
				System.out.println(newArray);
			}else if(dataType.equals("integers") && store.equals("list")) {
				ArrayList<Integer> newArray = sas.selectionSort(intArray);
				int[] newlist = new int[newArray.size()];
				for(int i = 0; i< newlist.length; i++) {
					newlist[i] = newArray.get(i);
				}
				System.out.println(Arrays.toString(newlist));
			}else if(dataType.equals("strings") && store.equals("array")) {
				ArrayList<String> newArray = sas.selectionSortString(stringArray);
				System.out.println(newArray);
			}else {
				ArrayList<String> newArray = sas.selectionSortString(stringArray);
				String[] newlist = new String[newArray.size()];
				for(int i = 0; i< newlist.length; i++) {
					newlist[i] = newArray.get(i);
				}
				System.out.println(Arrays.toString(newlist));	
			}
		}else if(algorithm.equals("insertion")) {
			if(dataType.equals("integers") && store.equals("array")) {
				ArrayList<Integer> newArray = sas.insertionSort(intArray);
				System.out.println(newArray);
			}else if(dataType.equals("integers") && store.equals("list")) {
				ArrayList<Integer> newArray = sas.insertionSort(intArray);
				int[] newlist = new int[newArray.size()];
				for(int i = 0; i< newlist.length; i++) {
					newlist[i] = newArray.get(i);
				}
				System.out.println(Arrays.toString(newlist));
			}else if(dataType.equals("strings") && store.equals("array")) {
				ArrayList<String> newArray = sas.insertionSortString(stringArray);
				System.out.println(newArray);
			}else {
				ArrayList<String> newArray = sas.insertionSortString(stringArray);
				String[] newlist = new String[newArray.size()];
				for(int i = 0; i< newlist.length; i++) {
					newlist[i] = newArray.get(i);
				}
				System.out.println(Arrays.toString(newlist));	
			}
		}else if(algorithm.equals("merge")) {
			if(dataType.equals("integers") && store.equals("array")) {
				ArrayList<Integer> newArray = sas.mergeSort(intArray);
				System.out.println(newArray);
			}else if(dataType.equals("integers") && store.equals("list")) {
				ArrayList<Integer> newArray = sas.mergeSort(intArray);
				int[] newlist = new int[newArray.size()];
				for(int i = 0; i< newlist.length; i++) {
					newlist[i] = newArray.get(i);
				}
				System.out.println(Arrays.toString(newlist));
			}else if(dataType.equals("strings") && store.equals("array")) {
				ArrayList<String> newArray = sas.mergeSortString(stringArray);
				System.out.println(newArray);
			}else {
				ArrayList<String> newArray = sas.mergeSortString(stringArray);
				String[] newlist = new String[newArray.size()];
				for(int i = 0; i< newlist.length; i++) {
					newlist[i] = newArray.get(i);
				}
				System.out.println(Arrays.toString(newlist));	
			}
		}else if(algorithm.equals("linear")) {
			if(dataType.equals("integers")) {
				int index = sas.linearSearch(intArray, target);
				System.out.println(index);
			}else {
				int index = sas.linearSearchString(stringArray, target);
				System.out.println(index);
			}
		}else {
			if(dataType.equals("integers")) {
				int index = sas.binarySearch(intArray, target);
				System.out.println(index);
			}else {
				int index = sas.binarySearchString(stringArray, target);
				System.out.println(index);
			}
		}
		
	}
			System.out.println("");	
	}while(check != 2);
		
		in.close();
	}
	
	public ArrayList<Integer> bubbleSort(ArrayList<Integer> intArray) {
		
			
			int swapcount = 0;
			
			do {
				swapcount = 0;
				for(int i = 0; i< intArray.size()-1; i++) {
					if(intArray.get(i)>intArray.get(i+1)) {
						int temp = intArray.get(i);
						intArray.set(i, intArray.get(i+1));
						intArray.set(i+1, temp);
						swapcount++;
					}
				}
			}while (swapcount > 0);
			
			
			return intArray;
		}
	
	public ArrayList<String> bubbleSortString(ArrayList<String> stringArray){
			int swapcount = 0;
			
			do {
				swapcount = 0;
				for(int i = 0; i< stringArray.size()-1; i++) {
					if(stringArray.get(i).compareTo(stringArray.get(i+1))>0) {
						String temp = stringArray.get(i);
						stringArray.set(i, stringArray.get(i+1));
						stringArray.set(i+1, temp);
						swapcount++;
					}
				}
			}while (swapcount > 0);
			
			
			return stringArray;
	}
	
	public ArrayList<Integer> selectionSort(ArrayList<Integer> intArray){
		
		
		for(int i = 0; i<intArray.size(); i++) {
			int minindex = i;
			
			for(int j = i +1; j<intArray.size(); j++) {
				if(intArray.get(minindex)>intArray.get(j)) {
					minindex = j;
				}
			}
			
			int temp = intArray.get(i);
			intArray.set(i, intArray.get(minindex));
			intArray.set(minindex, temp);
		}
		
		return intArray;
	}
	
	public ArrayList<String> selectionSortString(ArrayList<String> stringArray){
		
		
		for(int i = 0; i<stringArray.size(); i++) {
			int minindex = i;
			
			for(int j = i +1; j<stringArray.size(); j++) {
				if(stringArray.get(j).compareTo(stringArray.get(minindex))<0) {
					minindex = j;
				}
			}
			
			String temp = stringArray.get(i);
			stringArray.set(i, stringArray.get(minindex));
			stringArray.set(minindex, temp);
		}
		
		return stringArray;
	}
	
	public ArrayList<Integer> insertionSort(ArrayList<Integer> intArray){
			
		
		for(int i = 1; i<intArray.size(); i++) {
			int value = intArray.get(i);
			int j = i-1;
			
			while(j >=0 && intArray.get(j)>value) {
				intArray.set(j+1, intArray.get(j));
				j--;
			}
			
			intArray.set(j+1, value);
		}
		
		return intArray;

	}
	
	public ArrayList<String> insertionSortString(ArrayList<String> intArray){
			
		
		for(int i = 1; i<intArray.size(); i++) {
			String value = intArray.get(i);
			int j = i-1;
			
			while(j >=0 && intArray.get(j).compareTo(value)>0) {
				intArray.set(j+1, intArray.get(j));
				j--;
			}
			
			intArray.set(j+1, value);
		}
		
		return intArray;

	}
	
	public ArrayList<Integer> mergeSort(ArrayList<Integer> intArray){
		
		
		int size = intArray.size();
		
		if(size < 2) {
			return intArray;
		}
		
		int middle = size/2;
		ArrayList<Integer> left = new ArrayList<Integer>(middle);
		ArrayList<Integer> right = new ArrayList<Integer>(intArray.size()-middle);
		
		
		for(int i = 0; i < middle; i++) {
			left.add(intArray.remove(0));
		}
	    while (intArray.size()!=0) {
	    	right.add(intArray.remove(0));
	    }

	    mergeSort(left);  
	    mergeSort(right); 

	    while (left.size()!=0 && right.size()!=0) {
	     
	      if (left.get(0) < right.get(0)) {
	    	  intArray.add(left.remove(0));
	      }
	      else {
	    	  intArray.add(right.remove(0));
	      }
	    }

	  
	    while(left.size()!=0) {
	    	intArray.add(left.remove(0));
	    }
	    while(right.size()!=0) {
	    	intArray.add(right.remove(0));
	    }
		
		
		return intArray;
	}
	
public ArrayList<String> mergeSortString(ArrayList<String> intArray){
		
		
		int size = intArray.size();
		
		if(size <= 1) {
			return intArray;
		}
		
		int middle = size/2;
		ArrayList<String> left = new ArrayList<String>(middle);
		ArrayList<String> right = new ArrayList<String>(intArray.size()-middle);
		
		
		for(int i = 0; i < middle; i++) {
			left.add(intArray.remove(0));
		}
	    while (intArray.size()!=0) {
	    	right.add(intArray.remove(0));
	    }

	    mergeSortString(left);  
	    mergeSortString(right); 

	    while (left.size()!=0 && right.size()!=0) {
	     
	      if (left.get(0).compareTo(right.get(0))<0) {
	    	  intArray.add(left.remove(0));
	      }
	      else {
	    	  intArray.add(right.remove(0));
	      }
	    }

	  
	    while(left.size()!=0) {
	    	intArray.add(left.remove(0));
	    }
	    while(right.size()!=0) {
	    	intArray.add(right.remove(0));
	    }
		
		
		return intArray;
	}

	
	public int linearSearch(ArrayList<Integer> intArray, String tar){
		
		
		int target = Integer.parseInt(tar);
		
		for(int i = 0; i< intArray.size(); i++) {
			if(intArray.get(i) == target) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public int linearSearchString(ArrayList<String> intArray, String tar){
		
		
		
		for(int i = 0; i< intArray.size(); i++) {
			if(intArray.get(i).equals(tar)) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	public int binarySearch(ArrayList<Integer> intArray, String tar) {
		
		ArrayList<Integer> array = selectionSort(intArray);
		
		int target = Integer.parseInt(tar);
		
			int newmid = 0;
			int size = array.size()-1;
			
			while(newmid <= size) {
				int mid = newmid + (array.size()-1)/2;
				if(target == array.get(mid)) {
					return mid;
				}else if(target > array.get(mid)) {
					newmid = mid+1;
				}else {
					size = mid -1;
				}
			}
			
			return -1;
			
		
	}
	
public int binarySearchString(ArrayList<String> intArray, String tar) {
		
		ArrayList<String> array = selectionSortString(intArray);
		
		
			int newmid = 0;
			int size = array.size()-1;
			
			while(newmid <= size) {
				int mid = newmid + (array.size()-1)/2;
				if(tar.equals(array.get(mid))) {
					return mid;
				}else if(tar.compareTo(array.get(mid))<0) {
					newmid = mid+1;
				}else {
					size = mid -1;
				}
			}
			
			return -1;
			
		
	}
}
