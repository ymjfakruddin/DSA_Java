class Main {
	public static void main(String args[]) {
		// Your code goes here
		
		Node <Integer> adil = new Node<Integer>(10);
		Node <Integer> mohsin = new Node<Integer>(20);
		// Node <Integer> c = new Node<Integer>(30);
		
		adil.next=mohsin;
		
		
		
		//b.next=c;
		Node <Integer> head = adil;
		
		// System.out.println(head.data);
		// head=head.next;
		// System.out.println(head.data);
		// head=head.next;
		// System.out.print(head.next);
		
		while(head != null){
			//System.out.print(d.data +" ");
			head.data++;
			System.out.print(head.data+" "  );
			head=head.next;
		}
		
	}
}

class Node<T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
	}
}
