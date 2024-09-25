package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}

	public void printOnlyBooks() {
		PrintBooksOnlyVisitor printBooksVisitor = new PrintBooksOnlyVisitor();
		for (Item item : items) {
			item.accept(printBooksVisitor);
		}
	}

	public void printOnlyCDs() {
		PrintCDsOnlyVisitor printCDsVisitor = new PrintCDsOnlyVisitor();
		for (Item item : items) {
			item.accept(printCDsVisitor);
		}
	}

}
