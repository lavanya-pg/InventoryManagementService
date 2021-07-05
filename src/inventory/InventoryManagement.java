package inventory;

	public interface InventoryManagement
	{
		public void addInventoryItems(Items items);
		public void calculateValueOfInventory();
		public void printItemNames();
		public void printSelectedItemDetails(String userItemName);
		public void printAllItemsDetails();
	}


