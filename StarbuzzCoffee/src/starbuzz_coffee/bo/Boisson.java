package starbuzz_coffee.bo;

/**
 * @author prohu
 *
 */
public abstract class Boisson {
	protected String description = "Boisson inconnue";
	
	public abstract double count();

	public String getDescription() {
		return description;
	}

}
