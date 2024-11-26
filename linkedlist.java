class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Linkedlist{
      Node head;

      public void insertatbegin(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
      }

      public void insertatpos(int data,int pos){
        Node newnode=new Node(data);
        if(pos==0){
            insertatbegin(data);
            return;
        }
        Node temp=head;
        for(int i=1;i<pos && temp!=null;i++){
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
      }

      public void insertatend(int data){
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;

      }

      public void deleteatbeg(){
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        
        head=head.next;
      }

      public void deleteatdata(int data){
        Node temp=head;

        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }

        while(temp.next!=null && temp.next.data!=data){
           temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("DATA NOT FOUND");
            return;
        }
        else{
            temp.next=temp.next.next;
        }
      }

      public void deleteatend(){
        Node temp=head;
        if(head==null){
            System.out.println("LIST IS EMPTY");
            return;
        }
        if(head.next==null){
            head=null;
        }

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
      }


      public void reverse(){
        Node current=head;
        Node prev=null;
        Node next=null;


        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        head=prev;
        


      }


      public int middleElement(){
        if(head==null){
            System.out.println("EMPTY LIST");
            return -1;
        }

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;
      }

     public void printnode(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println();
     }
 



      public static void main(String[] args) {
          Linkedlist linkedlist=new Linkedlist();

          linkedlist.insertatbegin(5);
          linkedlist.printnode();

          linkedlist.insertatend(7);
          linkedlist.printnode();


          linkedlist.insertatpos(1,1);
          linkedlist.printnode();
 
          linkedlist.deleteatbeg();
          linkedlist.printnode();

          linkedlist.deleteatdata(1);
          linkedlist.printnode();

          linkedlist.insertatend(8);
          linkedlist.insertatend(8);

          linkedlist.deleteatend();
          linkedlist.printnode();

          linkedlist.reverse();
          linkedlist.printnode();

          

         linkedlist.deleteatbeg();
         linkedlist.deleteatbeg();

         linkedlist.insertatbegin(2);
         linkedlist.insertatbegin(3);
         linkedlist.insertatbegin(4);
         linkedlist.insertatbegin(5);
         linkedlist.printnode();

         int temp= linkedlist.middleElement();
         System.out.println(temp);


         
         

      }
}
