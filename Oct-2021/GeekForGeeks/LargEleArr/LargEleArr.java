package LargEleArr;


class LargEleArr{

    //method to get middel alement


    int getMiddle(Node head)
    {
        Node temp = head;
        Node mid = head;
        int count =0;
        while (temp.next!=null) {

            if(count % 2 == 0){
                mid = mid.next;
            }

            temp = temp.next;
            count ++;
        }   

        return mid.data;
        
         // Your code here.
    }
}
class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }