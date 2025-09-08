package com.codegnan.arrays;

import java.util.Scanner;

public class addition_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter number of rows: ");
		        int rows = sc.nextInt();
		        System.out.print("Enter number of columns: ");
		        int cols = sc.nextInt();

		        int[][] arr1 = new int[rows][cols];
		        int[][] arr2 = new int[rows][cols];
		        int[][] sum = new int[rows][cols];

		        // Input first matrix
		        System.out.println("Enter first matrix:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                arr1[i][j] = sc.nextInt();
		            }
		        }

		        // Input second matrix
		        System.out.println("Enter second matrix:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                arr2[i][j] = sc.nextInt();
		            }
		        }

		        // Add matrices
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                sum[i][j] = arr1[i][j] + arr2[i][j];
		            }
		        }

		        // Display result
		        System.out.println("Sum of matrices:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(sum[i][j] + " ");
		            }
		            System.out.println();
		        }

		        sc.close();
		    }
		}


	
