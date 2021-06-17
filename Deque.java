package a02;

public class Deque<Item> implements Iterable<Item> {
	   public Deque()                           // construct an empty deque
	   public boolean isEmpty()                 // is the deque empty?
	   public int size()                        // return the number of items on the deque
	   public void addFirst(Item item)          // insert the item at the front
	   public void addLast(Item item)           // insert the item at the end
	   public Item removeFirst()                // delete and return the item at the front
	   public Item removeLast()                 // delete and return the item at the end
	   public Iterator<Item> iterator()         // return an iterator over items in order from front to end
	   public static void main(String[] args)   // unit testing
	}

/*
The order of two or more iterators to the same randomized queue must be mutually independent; 
each iterator must maintain its own random order. 
Throw a java.lang.NullPointerException if the client attempts to add a null item; 
throw a java.util.NoSuchElementException if the client attempts to sample or dequeue an item from an empty randomized queue;
throw a java.lang.UnsupportedOperationException if the client calls the remove() method in the iterator;
throw a java.util.NoSuchElementException if the client calls the next() method in the iterator and there are no more items to return.
*/