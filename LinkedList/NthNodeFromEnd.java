import java.util.*;
public class NthNodeFromEnd{

    static class LinkedList{
            class Node{
                    int data;
                    Node next;

                    Node(int val){
                            this.data = val;
                            this.next = null;
                    }
            }

                    Node head = null;

                    public void insert(int value){
                            Node newNode = new Node(value);

                            if (head == null){
                                    head = newNode;
                            }
                            else{
                                    Node cur = head;

                                    while (cur.next != null){
                                            cur = cur.next;
                                    }

                                    cur.next = newNode;
                            }

                    }

                    public void display(){
                            if (head == null){
                                    System.out.println("List is empty");
                            }
                            else{
                                    Node cur = head;

                                    while (cur != null){
                                            System.out.print(cur.data + " ");
                                            cur = cur.next;
                                    }
                            }
                    
                    }

                    public void findNthNodefromEnd(int n){
                        Node cur = head;
                        int len = 1;

                        while(cur != null){
                            cur = cur.next;
                            len++;
                        }

                        int cnt = 1;
                        cur = head;

                        while(cur != null){
                            if(cnt == len-n){
                                System.out.println(cur.data + " is the nth node element in the list");
                                break;
                            }
                            cur = cur.next;
                            cnt++;
                        }
                      
                      if(n>len){
                      System.out.println("There is no nth node in the list");
                      }
                    }
            }
    
    public static void main(String[] args){
            LinkedList list = new LinkedList();
			
      		Scanner sc = new Scanner(System.in);
      
      		while(true){
            	int temp = sc.nextInt();
              	if(temp<0){break;}
              	list.insert(temp);
            }
      		System.out.println("Enter the nth node:");
      		int n = sc.nextInt();
      	
      		list.findNthNodefromEnd(n);

            sc.close();
    }
}
