package Statistics;
import Statistics.LinkedList;

import Statistics.List;


public class LinkedList<E> implements List<E>{
	//private static class Node<E> {
		private int noItems;
		private Node dummy;
		private class Node {
			E data;
			Node next;
			Node prev;
			public Node(LinkedList<E>.Node prev, E data, LinkedList<E>.Node next) {
				super();
				this.prev=prev;
				this.data=data;
				this.next=next;
			}
		}
		@Override
		public void addItem(E item) throws IllegalArgumentException {
			if (dummy == null) {
				dummy = new Node(null, item, null);
			} else {
				Node ptr = dummy;
				while (ptr.next != null) {
					ptr=ptr.next;
				}
				ptr.next = new Node(ptr, item, null);
			}
			noItems++;
		}
		/**
		 * Return number of items currently in the list.
		 * @return the number of items in the list
		 */
		@Override
		public int getNoItems() throws IllegalArgumentException {
			return noItems;
		}
		/**
		 * Return item at specified index.
		 * @param index
		 * @return specified item
		 */
		@Override
		public E getItem(int index) throws IllegalArgumentException {
			Node ptr = getNode(index);
			return ptr.data;
		}
		/**
		 * Get Node pointer.
		 * @param index
		 * @return pointer
		 */
		private Node getNode(int index) {
			Node ptr = dummy;
			while (index-- > 0) {
				ptr = ptr.next;
			}
			return ptr;
		}
		/**
		 * Insert item at specified location.
		 * @param item
		 * @param index
		 */
		@Override
		public void insertItem(E item, int index) throws IllegalArgumentException {
			if (index == 0) {
				dummy = new Node(null, item, null);
			} else {
				Node ptr = getNode(index - 1);
				ptr.next = new Node(ptr, item, null);
			}
			noItems++;
		}
		/**
		 * Remove item at specified index
		 * @param index
		 * @return removed item
		 */
		@Override
		public E removeItem(int index) throws IllegalArgumentException {
			if (index == 0) {
				E data = dummy.data;
				dummy=dummy.next;
				noItems--;
				return data;
			} else {
				Node ptr = getNode(index -1);
				E data = ptr.next.data;
				ptr.next=ptr.next.next;
				return data;
			}
		}

	}

//}
