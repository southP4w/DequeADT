public class Main
{
	public static void main(String[] args) {
		DeQue<Integer> ds = new DeQue<>();
		System.out.print("addLast(5) \t\t\t| --- | \t");
		ds.addLast(5);
		System.out.println(ds);
		System.out.print("addFirst(3) \t\t| --- | \t");
		ds.addFirst(3);
		System.out.println(ds);
		System.out.print("addFirst(7) \t\t| --- | \t");
		ds.addFirst(7);
		System.out.println(ds);
		System.out.print("first() \t\t\t| " + ds.first() + " | \t\t");
		System.out.println(ds);
		System.out.print("removeLast() \t\t| " + ds.removeLast() + " | \t\t");
		System.out.println(ds);
		System.out.print("size() \t\t\t\t| " + ds.size() + " | \t\t");
		System.out.println(ds);
		System.out.print("removeLast() \t\t| " + ds.removeLast() + " | \t\t");
		System.out.println(ds);
		System.out.print("removeFirst() \t\t| " + ds.removeFirst() + " | \t\t");
		System.out.println(ds);
		System.out.print("addFirst(6) \t\t| --- | \t");
		ds.addFirst(6);
		System.out.println(ds);
		System.out.print("last() \t\t\t\t| " + ds.last() + " | \t\t");
		System.out.println(ds);
		System.out.print("addFirst(8) \t\t| --- | \t");
		ds.addFirst(8);
		System.out.println(ds);
		System.out.print("isEmpty() \t\t\t| " + ds.isEmpty() + " | \t");
		System.out.println(ds);
		System.out.print("last() \t\t\t\t| " + ds.last() + " | \t\t");
		System.out.println(ds);
	}
}