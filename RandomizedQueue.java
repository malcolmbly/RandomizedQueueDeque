package a02;

public class RandomizedQueue<Item> implements Iterable<Item> {
	   public RandomizedQueue()                 // construct an empty randomized queue
	   public boolean isEmpty()                 // is the queue empty?
	   public int size()                        // return the number of items on the queue
	   public void enqueue(Item item)           // add the item
	   public Item dequeue()                    // delete and return a random item
	   public Item sample()                     // return (but do not delete) a random item
	   public Iterator<Item> iterator()         // return an independent iterator over items in random order
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
