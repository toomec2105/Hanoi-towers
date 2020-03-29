package hanoiTowers;

public class hanoiTowersRecursively {

	public static void main(String[] args) {
		int startPeg = 1;
		int tempPeg = 2;
		int endPeg = 3;
		
		solveTowers(20, startPeg, endPeg, tempPeg);
		
	}
	
	public static void solveTowers(int disks, int source, int destination, int temporary) {
		
		if(disks == 1) {
			System.out.printf("%n@%d --> %d", source, destination);
			return;
		}
		
		solveTowers(disks -1, source, temporary, destination);
		System.out.printf("%n%d --> %d", source, destination);
		
		solveTowers(disks -1, temporary, destination, source);
		
	}
}
