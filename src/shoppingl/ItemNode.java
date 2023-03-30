package shoppingl;

public class ItemNode {
	   private String item;
	   private ItemNode nextNodeRef; // Reference to the next node                                        

	   public ItemNode() {
	      item = "";
	      nextNodeRef = null;
	   }

	   // Constructor                                                                                     
	   public ItemNode(String itemInit) {
	      this.item = itemInit;
	      this.nextNodeRef = null;
	   }

	   // Constructor                                                                                     
	   public ItemNode(String itemInit, ItemNode nextLoc) {
	      this.item = itemInit;
	      this.nextNodeRef = nextLoc;
	   }

	   // Insert node after this node.                                                                   
	   public void insertAfter(ItemNode nodeLoc) {
	      ItemNode tmpNext;

	      tmpNext = this.nextNodeRef;
	      this.nextNodeRef = nodeLoc;
	      nodeLoc.nextNodeRef = tmpNext;
	   }

	   // TODO: Define insertAtEnd() method that inserts a node
	   //       to the end of the linked list  
	   public void insertAtEnd(ItemNode head, ItemNode curr) {
	      String x = curr.getItem();
		   if  (head == null) {
	    	  ItemNode headNew = new ItemNode(x, null);
		      }
		   while (curr.getNext() != null) {
			   ItemNode itemNew = new ItemNode(x, null);
		   }
	      }
	    public void insertAtEnd(ItemNode head, ItemNode x) {
	        ItemNode ret = head;
	        String itemStr = x.getItem();
	        
	        if (head.getNext() == null) {

	           ItemNode newNode = new ItemNode(itemStr, null);
	             head.setNext(newNode);  
	         }
	         else
	         {
	             ItemNode currNode = head;
	             while (currNode.getNext() != null) {
	                 currNode = currNode.getNext();
	                 }
	             ItemNode newNode = new ItemNode(itemStr, null);
	             currNode.setNext(newNode);
	             
	         }
	        }
	   // Get location pointed by nextNodeRef                                                             
	   public ItemNode getNext() {
	      return this.nextNodeRef;
	   }
	   public void setNext(ItemNode loc) {
	      this.nextNodeRef = loc;
	      }
	   public String getItem() {
	      return this.item;
	      }
	   public void printNodeData() {
	      System.out.println(this.item);
	   }
	}
