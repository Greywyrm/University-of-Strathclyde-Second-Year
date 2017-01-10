public class BinarySearchTree 
{ 
      private BSTNode root; 
 
      public BinarySearchTree() 
      { 
            root = null; 
      } 

      public boolean search(int value) 
      { 
            if (root == null) 
                  return false; 
            else 
                  return root.search(value); 
      }

      public boolean add(int value) 
      { 
            if (root == null) 
            { 
                  root = new BSTNode(value); 
                  return true; 
            } 
            else 
                  return root.add(value); 
      } 

      public boolean remove(int value) 
      { 
        if (root == null) 
           return false; 
        else 
        { 
           if (root.getValue() == value) 
           { 
               BSTNode auxRoot = new BSTNode(0); 
               auxRoot.setLeftChild(root); 
               boolean result = root.remove(value, auxRoot); 
               root = auxRoot.getLeftChild(); 
               return result; 
           } 
           else 
           { 
               return root.remove(value, null); 
           } 
         } 
      }
      
      
      
      public BSTNode getRoot() 
      {
		return root;
	  }


	public void displayInOrder(BSTNode root)
      {
    	  if(root.getLeftChild() != null)
    	  {
    		  displayInOrder(root.getLeftChild());
    	  }
    	  
    	  System.out.println(root.getValue());
    	  
    	  if(root.getRightChild() != null)
    	  {
    		  displayInOrder(root.getRightChild());
    	  }
      }
      
      
      
}