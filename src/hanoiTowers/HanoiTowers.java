package hanoiTowers;
import java.util.Arrays;
import java.util.ArrayList;

public class HanoiTowers {

	public static void main(String[] args) {
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();
		ArrayList<Integer> third = new ArrayList<Integer>();
		first.add(3);
		first.add(2);
		first.add(1);
		printTowers(first, second, third);
		moveDisks(first, second, third);
	}
	
	
	
	
	
	private static void moveDisks(ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> third) {
		
		System.out.println("Moving disks");
		int movedElement = 0;
		
		    while(first.size() > 0 || second.size() > 0) {
		    	
		    	if(first.size() > 0) {//__--------------------------------------------
		    		movedElement = first.get(first.size() - 1);
		    		if(third.isEmpty()) {
		    			third.add(movedElement);
		    			first.remove(first.size() -1);
		    		}else if(movedElement < third.get(third.size() -1)) {
		    			third.add(movedElement);
		    			first.remove(first.size() -1);
		    		}else if(second.isEmpty()) {
	    				second.add(movedElement);
		    			first.remove(first.size()- 1);
	    			}
		    		else if(movedElement < second.get(second.size() -1)) {
		    			second.add(movedElement);
		    			first.remove(first.size()- 1);
		    		}else {
		    			movedElement = third.get(third.size()- 1);	
		    			if(second.isEmpty()) {
		    				second.add(movedElement);
			    			third.remove(third.size()- 1);
		    			} else if(movedElement < second.get(second.size() -1)) {
		    				second.add(movedElement);
			    			third.remove(third.size()- 1);
		    			}
		    		}
		    	}else {//__-------------------------------------------- 
		    		
		    		if(second.size() > 0) {
		    			movedElement = second.get(second.size() - 1);
		    			if(third.isEmpty()) {
		    				third.add(movedElement);
			    			second.remove(second.size()- 1);
		    			}else if(movedElement < third.get(third.size() -1)) {
		    				third.add(movedElement);
			    			second.remove(second.size()- 1);
		    			}else {
			    			System.out.println("First is empty");
			    			movedElement = third.get(third.size()- 1);
			    			first.add(movedElement);
			    			third.remove(third.size()- 1);
			    			movedElement = second.get(second.size()- 1);
			    			third.add(movedElement);
			    			second.remove(second.size()- 1);
			    		}
		    		}
		    	}
		    	printTowers(first, second, third);
		    }
		
			
						
			
		
		
		
	}
	
	private static void printTowers(ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> third) {
		
		System.out.println(Arrays.toString(first.toArray()) + "First");
		System.out.println(Arrays.toString(second.toArray()) + "Second");
		System.out.println(Arrays.toString(third.toArray()) + "Third");
		System.out.println("-----------------------------------------");
	}
	
	
	
	
	
}

	