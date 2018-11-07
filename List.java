package Statistics;

public interface List<E> {
	public void addItem(E item);
	/**
	 * Insert item at specified location.
	 * @param item
	 * @param index
	 */
	public void insertItem(E item, int index);
	/**
	 * Return item at specified index.
	 * @param index
	 * @return specified item
	 */
	public E getItem(int index);
	/**
	 * Remove item at specified index
	 * @param index
	 * @return removed item
	 */
	public E removeItem(int index);
	/**
	 * Return number of items currently in the list.
	 * @return the number of items in the list
	 */
	public int getNoItems();
}