import java.util.Scanner;

public class Ticket {
    static class Node {
        int id,seat;String customer,movie,time;Node next;
        Node(int i,String c,String m,int s,String t){id=i;customer=c;movie=m;seat=s;time=t;}
    }
    static Node head=null,tail=null;
    static int count=0;
    static void add(int id,String customer,String movie,int seat,String time){
        Node x=new Node(id,customer,movie,seat,time);
        if(head==null){head=tail=x;x.next=head;}
        else{tail.next=x;tail=x;tail.next=head;}
        count++;System.out.println("Ticket booked");
    }
    static void delete(int id){
        if(head==null){System.out.println("No tickets");return;}
        Node temp=head,prev=tail;
        do{
            if(temp.id==id){
                if(head==tail){head=tail=null;}
                else{prev.next=temp.next;if(temp==head)head=temp.next;if(temp==tail)tail=prev;tail.next=head;}
                count--;System.out.println("Ticket cancelled");return;
            }
            prev=temp;temp=temp.next;
        }while(temp!=head);
        System.out.println("Ticket not found");
    }
    static void display(){
        if(head==null){System.out.println("No tickets");return;}
        Node temp=head;
        do{System.out.println(temp.id+" "+temp.customer+" "+temp.movie+" Seat:"+temp.seat+" Time:"+temp.time);temp=temp.next;}while(temp!=head);
    }
    static void search(String key){
        if(head==null){System.out.println("No tickets");return;}
        Node temp=head;boolean found=false;
        do{
            if(temp.customer.equalsIgnoreCase(key)||temp.movie.equalsIgnoreCase(key)){
                System.out.println(temp.id+" "+temp.customer+" "+temp.movie+" Seat:"+temp.seat);found=true;
            }
            temp=temp.next;
        }while(temp!=head);
        if(!found)System.out.println("Ticket not found");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int ch;
        do{
            System.out.println("\n1 Book ticket 2 Cancel ticket 3 Display 4 Search customer/movie 5 Count tickets 0 Exit");
            ch=sc.nextInt();sc.nextLine();
            if(ch==1){
                System.out.print("Ticket ID: ");int id=sc.nextInt();sc.nextLine();
                System.out.print("Customer: ");String c=sc.nextLine();
                System.out.print("Movie: ");String m=sc.nextLine();
                System.out.print("Seat: ");int s=sc.nextInt();sc.nextLine();
                System.out.print("Booking time: ");add(id,c,m,s,sc.nextLine());
            }else if(ch==2){System.out.print("Ticket ID: ");delete(sc.nextInt());}
            else if(ch==3)display();
            else if(ch==4){System.out.print("Customer or movie: ");search(sc.nextLine());}
            else if(ch==5)System.out.println("Total tickets: "+count);
        }while(ch!=0);
        sc.close();
    }
}