import java.util.Scanner;

public class ClientTester {

	public static void main(String[] args) {
		Client client = new Mathmatica(); //default client
		System.out.println("Hello! Welcome to your number sorting portal.");
		System.out.println("Here's the array of numbers we will be sorting.");
		System.out.println("{5, 23, 17, 2, 8, 20, 52, 31}");
		System.out.println("Please enter the number of the tool you would like to use.");
		System.out.println("1. Mathmatica");
		System.out.println("2. MTool");
		System.out.println("3. MyMath");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch(choice) {
			case 1:
				System.out.println("You have chosen Mathmatica.");
				client = new Mathmatica();
				client.performSort();
				//print the sorted array
				break;
			case 2:
				System.out.println("You have chosen MTool.");
				client = new MTool();
				client.performSort();
				//print the sorted array
				break;
			case 3: 
				System.out.println("You have chosen MyMath.");
				client = new MyMath();
				client.performSort();
				//print the sorted array
				break;
		}
		System.out.println("Great! Now let's try sorting with insertion sort.");
		System.out.println("Here the unsorted array:");
		System.out.println("{5, 23, 17, 2, 8, 20, 52, 31}");
		client.setSortMethod(new iSort());
		System.out.println("And the sorted array!");
		client.performSort();
	}

}
