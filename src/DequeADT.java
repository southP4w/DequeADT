import java.util.ArrayList;
import java.util.List;

public class DequeADT<E> implements Deque<E>
{
	private final List<E> list;

	public DequeADT() {
		list = new ArrayList<>();
	}

	public void addFirst(E item) {
		list.add(0, item);
	}

	public void addLast(E item) {
		list.add(item);
	}

	public E removeFirst() {
		if (!list.isEmpty())
			return list.remove(0);
		return null;
	}

	public E removeLast() {
		if (!list.isEmpty())
			return list.remove(list.size() - 1);
		return null;
	}

	public E first() {
		return list.get(0);
	}

	public E last() {
		return list.get(list.size() - 1);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return list.toString();
	}
}