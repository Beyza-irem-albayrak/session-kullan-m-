	package CoreServlets;
	/** A specialization of the CatalogPage servlet that
	* displays a page selling three famous kids-book series.
	* Orders are sent to the OrderPage servlet.
	*/
	public class KidsBooksPage extends CatalogPage {
	public void init() {
	String[] ids = { "lewis001", "alexander001", "rowling001" };
	setItems(ids);
	setTitle("All-Time Best Children's Fantasy Books");
	}
	}
