/**
 * 
 */
package noriegaMestanza;

import java.util.Scanner;

/**
 * Game of life program A program that runs the game of life. Cell needs 2 or 3
 * neighbors to stay alive. 24/04/2017
 * 
 * @author 323995084
 *
 */
public class NewLife {

	/**
	 * @param args
	 */
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// First part of program
		char[][] newLife = new char[20][20];
		char[][] array = new char[20][20];

		System.out.print("This is the game of life.");
		System.out.print("How many cells are alive?");
		int cellnum = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < 20; i++) {// array=20
			for (int j = 0; j < 20; j++) {
				// assigns each cell the value of O
				array[i][j] = 'O';
			}
		}
		for (int i = 0; i < cellnum; i++) {
			System.out.println("Enter the x coordinate.");
			int x = Integer.parseInt(scan.nextLine()) - 1;
			System.out.println("Enter the y coordinate.");
			int y = Integer.parseInt(scan.nextLine()) - 1;
			array[x][y] = 'X';
			// sets selected cells to equal x
		}

		print(array);// prints array
		System.out.println("Do you want to play another day?(Y/N)");

	}

	public static void print(char[][] array) {
		// prints the X in the corresponding row(r) and column(c)
		// second step in program
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[r].length; c++) {

				System.out.print(array[r][c]);
			}
			System.out.println();
		}

	}
	/*
	 * public static char[][] newcells(char[][] array){
	 * 
	 * 
	 * 
	 * return alive(array);
	 * 
	 * }
	 */

	public static char[][] alive(char[][] array) {

		for (int x = 0; x < 20; x++) {
			for (int y = 0; y < 20; y++) {
				if (array[x][y] == 'X') {
					if (rules(array, x, y) == 2 || rules(array, x, y) == 3) {
						array[x][y] = 'X';
					}
				} else if (array[x][y] == 'O') {
					if (rules(array, x, y) == 3) {
						array[x][y] = 'X';
					} else {
						array[x][y] = 'O';
					}
				}
			}
		}
		return array;
	}

	public static char rules(char[][] grid, int r, int c) {
		int total = 0;
		if (grid[r][c] == grid[0][0]) { // if cell is in the top left corner
			if (grid[0][1] == 'X') {
				total++;
			}
			if (grid[1][1] == 'X') {
				total++;
			}
			if (grid[1][0] == 'X') {
				total++;
			}
			if ((total == 2 || total == 3) && grid[r][c] == 'X') {
				return 'X';
			} else if (total == 3) {
				return 'X';
			} else {
				return '0';
			}
		} else if (grid[r][c] == grid[19][0]) { // if cell is in the bottom left
												// corner
			if (grid[19][1] == 'X') {
				total++;
			}
			if (grid[18][1] == 'X') {
				total++;
			}
			if (grid[18][0] == 'X') {
				total++;
			}
			if ((total == 2 || total == 3) && grid[r][c] == 'X') {
				return 'X';
			} else if (total == 3) {
				return 'X';
			} else {
				return '0';
			}
		} else if (grid[r][c] == grid[19][19]) { // if cell is in the bottom
													// right corner
			if (grid[18][18] == 'X') {
				total++;
			}
			if (grid[18][19] == 'X') {
				total++;
			}
			if (grid[19][18] == 'X') {
				total++;
			}
			if ((total == 2 || total == 3) && grid[r][c] == 'X') {
				return 'X';
			} else if (total == 3) {
				return 'X';
			} else {
				return '0';
			}
		} else if (grid[r][c] == grid[0][19]) { // if cell is in the top right
			if (grid[1][18] == 'X') {
				total++;
			}
			if (grid[1][19] == 'X') {
				total++;
			}
			if (grid[0][18] == 'X') {
				total++;
			}
			if ((total == 2 || total == 3) && grid[r][c] == 'X') {
				return 'X';
			} else if (total == 3) {
				return 'X';
			} else {
				return '0';
			}
		} else if (r == 0) { // if cell is on the top corner
			if (grid[r + 1][c] == 'X') {
				total++;
			}
			if (grid[r + 1][c + 1] == 'X') {
				total++;
			}
			if (grid[r + 1][c - 1] == 'X') {
				total++;
			}
			if (grid[r][c - 1] == 'X') {
				total++;
			}
			if (grid[r][c + 1] == 'X') {
				total++;
			}
			if ((total == 2 || total == 3) && grid[r][c] == 'X') {
				return 'X';
			} else if (total == 3) {
				return 'X';
			} else {
				return '0';
			}
		} else if (r == 19) { // if cell is in bottom corner
			if (grid[r - 1][c] == 'X') {
				total++;
			}
			if (grid[r - 1][c - 1] == 'X') {
				total++;
			}
			if (grid[r - 1][c + 1] == 'X') {
				total++;
			}
			if (grid[r][c - 1] == 'X') {
				total++;
			}
			if (grid[r][c + 1] == 'X') {
				total++;
			}
			if ((total == 2 || total == 3) && grid[r][c] == 'X') {
				return 'X';
			} else if (total == 3) {
				return 'X';
			} else {
				return '0';
			}
		} else if (c == 0) { // if cell is in left corner
			if (grid[r][c + 1] == 'X') {
				total++;
			}
			if (grid[r - 1][c + 1] == 'X') {
				total++;
			}
			if (grid[r + 1][c + 1] == 'X') {
				total++;
			}
			if (grid[r + 1][c] == 'X') {
				total++;
			}
			if (grid[r - 1][c] == 'X') {
				total++;
			}
			if ((total == 2 || total == 3) && grid[r][c] == 'X') {
				return 'X';
			} else if (total == 3) {
				return 'X';
			} else {
				return '0';
			}
		} else if (c == 19) { // if cell is in right corner
			if (grid[r][c - 1] == 'X') {
				total++;
			}
			if (grid[r - 1][c - 1] == 'X') {
				total++;
			}
			if (grid[r + 1][c - 1] == 'X') {
				total++;
			}
			if (grid[r + 1][c] == 'X') {
				total++;
			}
			if (grid[r - 1][c] == 'X') {
				total++;
			}
			if ((total == 2 || total == 3) && grid[r][c] == 'X') {
				return 'X';
			} else if (total == 3) {
				return 'X';
			} else {
				return '0';
			}
		} else { // if cell is in center position
			if (grid[r - 1][c] == 'X') {
				total++;
			}
			if (grid[r + 1][c] == 'X') {
				total++;
			}
			if (grid[r][c + 1] == 'X') {
				total++;
			}
			if (grid[r][c - 1] == 'X') {
				total++;
			}
			if (grid[r + 1][c + 1] == 'X') {
				total++;
			}
			if (grid[r - 1][c - 1] == 'X') {
				total++;
			}
			if (grid[r + 1][c - 1] == 'X') {
				total++;
			}
			if (grid[r - 1][c + 1] == 'X') {
				total++;
			}
			if ((total == 2 || total == 3) && grid[r][c] == 'X') {
				return 'X';
			} else if (total == 3) {
				return 'X';
			} else {
				return '0';
			}

		}

	}
}
