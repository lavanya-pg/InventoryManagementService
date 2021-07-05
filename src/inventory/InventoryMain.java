package inventory;

import java.util.Scanner;

public class InventoryMain 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		InventoryManagement inventoryManagement = new InventoryManagementImpl();
		
		System.out.println("Welcome to inventory data management system !");
		
		boolean isExit = false;
		while(!isExit)
		{	
			System.out.println("Enter a number  :\n1 - Enter items in inventory."
					+ "\n2 - Print details of specific item.\n3 - Print total value of inventory.\n4 - Display all items.\n5 - Exit.");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1 :
				{
					System.out.print("How many number of items you want to store in inventory : ");
					int numberOfItmes = sc.nextInt();
					
					//User input for items which will be stored inside inventory.
					for(int itemCount = 1; itemCount <= numberOfItmes; itemCount++)
					{	
						Items itemsObject = new Items();
						System.out.print("Enter Item Name : ");
						itemsObject.setItemName(sc.next());
						System.out.print("Enter Total Weight : ");
						itemsObject.setItemTotalWeight(sc.nextDouble());
						System.out.print("Enter Price Per Kg : ");
						itemsObject.setItemPricePerKg(sc.nextDouble());
						inventoryManagement.addInventoryItems(itemsObject);
					}
					System.out.println("\n" + "All the items inserted sucessfully !" + "\n");
					break;
				}
				case 2 :
				{
					//Printing Only items names for selection.
					inventoryManagement.printItemNames();
					
					System.out.print( "\n" + "Enter any one of the above item name to display its details : ");
					String userItemName = sc.next();
					inventoryManagement.printSelectedItemDetails(userItemName);
					break;
				}
				case 3 :
				{
					//Calculating value of inventory.
					inventoryManagement.calculateValueOfInventory();
					break;
				}
				case 4 :
				{
					//Displaying all items present in inventory.
					inventoryManagement.printAllItemsDetails();
					break;
				}
				case 5 :
				{
					isExit = true;
				}
			}
		}
		sc.close();
	}
}


