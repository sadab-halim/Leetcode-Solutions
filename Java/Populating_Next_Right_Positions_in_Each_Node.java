if(root==null) return root;
     
        Node prev=root;//used to get evry child node
        Node prevStart=root;//starting node of every level
        root.next=null;
        Node cur=root.left;
        boolean b=true;// if left child then true else false
      while(cur!=null)
      { 
          if(b){
               
          cur.next=prev.right;
          b=false;
          }
          else{
              
              if(prev.next!=null){
                  prev=prev.next;
                   cur.next=prev.left;
              }
             
              else cur.next=null;
              b=true;
          }
          if(cur.next!=null){
              cur=cur.next;
             
          }
          
          else {
             prev=prevStart.left;  
             prevStart=prevStart.left;
            cur=prev.left;
             
          }         
          
      }
        return root;
    }