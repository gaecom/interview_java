import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class LoopInALinkedListTest {

	@Test
	public void test_123(){
		LoopInALinkedList loopInALinkedList = new LoopInALinkedList();
		LoopInALinkedList.Node harom = loopInALinkedList.new Node(false, 3);
		harom.setNext(null);
		LoopInALinkedList.Node ketto = loopInALinkedList.new Node(false, 2);
		ketto.setNext(harom);
		LoopInALinkedList.Node egy = loopInALinkedList.new Node(false, 1);
		egy.setNext(ketto);
		
		LoopInALinkedList.MyLinkedList<LoopInALinkedList.Node> linkedList = loopInALinkedList.new MyLinkedList<LoopInALinkedList.Node>();
		linkedList.add(egy);
		linkedList.add(ketto);
		linkedList.add(harom);
		
		assertFalse(loopInALinkedList.isALoop(linkedList));
		
	} 
	
	@Test
	public void test_123123(){
		LoopInALinkedList loopInALinkedList = new LoopInALinkedList();
		LoopInALinkedList.Node harom = loopInALinkedList.new Node(false, 3);
		LoopInALinkedList.Node ketto = loopInALinkedList.new Node(false, 2);
		LoopInALinkedList.Node egy = loopInALinkedList.new Node(false, 1);
		ketto.setNext(harom);
		harom.setNext(egy);
		egy.setNext(ketto);
		
		LoopInALinkedList.MyLinkedList<LoopInALinkedList.Node> linkedList = loopInALinkedList.new MyLinkedList<LoopInALinkedList.Node>();
		linkedList.add(egy);
		linkedList.add(ketto);
		linkedList.add(harom);
		
		assertTrue(loopInALinkedList.isALoop(linkedList));
		
	} 
	
	@Test
	public void test_12323(){
		LoopInALinkedList loopInALinkedList = new LoopInALinkedList();
		LoopInALinkedList.Node harom = loopInALinkedList.new Node(false, 3);
		LoopInALinkedList.Node ketto = loopInALinkedList.new Node(false, 2);
		LoopInALinkedList.Node egy = loopInALinkedList.new Node(false, 1);
		ketto.setNext(harom);
		harom.setNext(ketto);
		egy.setNext(ketto);
		
		LoopInALinkedList.MyLinkedList<LoopInALinkedList.Node> linkedList = loopInALinkedList.new MyLinkedList<LoopInALinkedList.Node>();
		linkedList.add(egy);
		linkedList.add(ketto);
		linkedList.add(harom);
		
		assertTrue(loopInALinkedList.isALoop(linkedList));
		
	} 
	
	@Test
	public void test_1234234(){
		LoopInALinkedList loopInALinkedList = new LoopInALinkedList();
		LoopInALinkedList.Node harom = loopInALinkedList.new Node(false, 3);
		LoopInALinkedList.Node negy = loopInALinkedList.new Node(false, 4);
		LoopInALinkedList.Node ketto = loopInALinkedList.new Node(false, 2);
		LoopInALinkedList.Node egy = loopInALinkedList.new Node(false, 1);
		negy.setNext(ketto);
		harom.setNext(negy);
		ketto.setNext(harom);
		egy.setNext(ketto);
		
		LoopInALinkedList.MyLinkedList<LoopInALinkedList.Node> linkedList = loopInALinkedList.new MyLinkedList<LoopInALinkedList.Node>();
		
		
		linkedList.add(egy);
		linkedList.add(ketto);
		linkedList.add(harom);
		linkedList.add(negy);
		
		assertTrue(loopInALinkedList.isALoop(linkedList));
		
	} 
	
	@Test
	public void test_1212(){
		LoopInALinkedList loopInALinkedList = new LoopInALinkedList();
		LoopInALinkedList.Node ketto = loopInALinkedList.new Node(false, 2);
		LoopInALinkedList.Node egy = loopInALinkedList.new Node(false, 1);
		ketto.setNext(egy);
		egy.setNext(ketto);
		
		LoopInALinkedList.MyLinkedList<LoopInALinkedList.Node> linkedList = loopInALinkedList.new MyLinkedList<LoopInALinkedList.Node>();
		
		linkedList.add(egy);
		linkedList.add(ketto);
		
		assertTrue(loopInALinkedList.isALoop(linkedList));
		
	} 
	
	@Test
	public void test_1222(){
		LoopInALinkedList loopInALinkedList = new LoopInALinkedList();
		LoopInALinkedList.Node ketto = loopInALinkedList.new Node(false, 2);
		LoopInALinkedList.Node egy = loopInALinkedList.new Node(false, 1);
		ketto.setNext(ketto);
		egy.setNext(ketto);
		
		LoopInALinkedList.MyLinkedList<LoopInALinkedList.Node> linkedList = loopInALinkedList.new MyLinkedList<LoopInALinkedList.Node>();
		
		linkedList.add(egy);
		linkedList.add(ketto);
		
		assertTrue(loopInALinkedList.isALoop(linkedList));
		
	} 
	
	@Test
	public void test_111(){
		LoopInALinkedList loopInALinkedList = new LoopInALinkedList();
		LoopInALinkedList.Node egy = loopInALinkedList.new Node(false, 1);
		egy.setNext(egy);
		
		LoopInALinkedList.MyLinkedList<LoopInALinkedList.Node> linkedList = loopInALinkedList.new MyLinkedList<LoopInALinkedList.Node>();
		linkedList.add(egy);
		
		assertTrue(loopInALinkedList.isALoop(linkedList));
		
	} 
	
	
}
