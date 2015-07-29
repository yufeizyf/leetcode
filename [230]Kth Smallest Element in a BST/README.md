##Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.  
Note:   
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.  
Follow up:  
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?  
  
    
    
`My Solution:`  
`Travesal a binary search tree with inorder will get a sequence that from smallest to biggest.`  
`So, the Kth Node in Inorder Travesal sequence is the Kth smallest element in BST`  
`O(n) time, O(n) sapce`  

###Do you have better solutions?
