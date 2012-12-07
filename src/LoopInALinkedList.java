import java.util.LinkedList;
import java.util.List;

public class LoopInALinkedList {
	
	public boolean isALoop(MyLinkedList<Node> nodes) {
		
		boolean result = false;
		if(findLoop(nodes, result)){
			result = true;
		}
		return result;
	}

	private boolean findLoop(MyLinkedList<Node> nodes, boolean result) {
		Node node = nodes.get(0);
		while(node.next != null){	
			if (node.checked) {
				result = true;
				break;
			} else {
				node.checked = true;
				node = node.next;
			}
		}
		return result;
	}
	
	class MyLinkedList<Node> extends LinkedList<Node> implements List<Node>{
		
		/***/
		private static final long serialVersionUID = 1L;
		
		public LoopInALinkedList.Node next(int index, List<Node> nodes){
			return ((LoopInALinkedList.Node) nodes.get(index)).getNext();
		}
		
	}
	
	class Node {
		int data;
		Node next = null;
		boolean checked = false;
		
		public Node(boolean checked, int data) {
			this.checked = false;
			this.data = data;
		}
		
		public Node getNext(){
			return this.next;
		}
		
		public void setNext(int data){
			Node next = new Node(false,data);
			Node n = this;
			while(n.next != null) {n = n.next;}
			n.next = next;
		}
		
		public Node deleteNode(Node head, int d){
			Node n = head;
			if(n.data == d) {return head.next;}
			while(n.next != null) {
				if(n.next.data == d){
					n.next = n.next.next;
					return head;
				}
				n = n.next;
			}
		}
		
		void setNext2(int data){
			Node end = new Node(data);
			Node n = this;
			while(n.next != null) {n = n.next;}
			n.next = end;
		}
		
	}
	
}
