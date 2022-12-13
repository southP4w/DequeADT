public interface Deque<E>
{
	public void addFirst(E item);
	public void addLast(E item);
	public E removeFirst();
	public E removeLast();
	public E first();
	public E last();
	public int size();
	public boolean isEmpty();
}