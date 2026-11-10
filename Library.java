import java.util.Scanner;

public class Library {
    static class Node {
        String title,author,genre;int id;boolean available;Node next,prev;
        Node(String t,String a,String g,int id,boolean av){title=t;author=a;genre=g;id=id;available=av;}
    }
    static Node head=null,tail=null;
    static void add(int pos,String t,String a,String g,int id,boolean av){
        Node x=new Node(t,a,g,id,av);
        if(head==null){head=tail=x;return;}
        if(pos<=1){x.next=head;head.prev=x;head=x;return;}
        Node temp=head;for(int i=1;i<pos-1&&temp.next!=null;i++)temp=temp.next;
        x.next=temp.next;x.prev=temp;
        if(temp.next!=null)temp.next.prev=x;else tail=x;
        temp.next=x;
    }
    static void delete(int id){
        Node temp=head;while(temp!=null&&temp.id!=id)temp=temp.next;
        if(temp==null){System.out.println("Book not found");return;}
        if(temp.prev!=null)temp.prev.next=temp.next;else head=temp.next;
        if(temp.next!=null)temp.next.prev=temp.prev;else tail=temp.prev;
        System.out.println("Deleted");
    }
    static void search(String key){
        Node temp=head;boolean found=false;
        while(temp!=null){
            if(temp.title.equalsIgnoreCase(key)||temp.author.equalsIgnoreCase(key)){print(temp);found=true;}
            temp=temp.next;
        }
        if(!found)System.out.println("Book not found");
    }
    static void update(int id,boolean status){
        Node temp=head;while(temp!=null){if(temp.id==id){temp.available=status;System.out.println("Updated");return;}temp=temp.next;}
        System.out.println("Book not found");
    }
    static void print(Node t){System.out.println(t.id+" "+t.title+" "+t.author+" "+t.genre+" "+(t.available?"Available":"Not available"));}
    static void forward(){Node t=head;while(t!=null){print(t);t=t.next;}}
    static void reverse(){Node t=tail;while(t!=null){print(t);t=t.prev;}}
    static void count(){int c=0;Node t=head;while(t!=null){c++;t=t.next;}System.out.println("Total books: "+c);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int ch;
        do{
            System.out.println("\n1 Add 2 Delete 3 Search 4 Update availability 5 Forward 6 Reverse 7 Count 0 Exit");
            ch=sc.nextInt();sc.nextLine();
            if(ch==1){
                System.out.print("Title: ");String t=sc.nextLine();System.out.print("Author: ");String a=sc.nextLine();
                System.out.print("Genre: ");String g=sc.nextLine();System.out.print("ID: ");int id=sc.nextInt();
                System.out.print("Available true/false: ");boolean av=sc.nextBoolean();System.out.print("Position: ");add(sc.nextInt(),t,a,g,id,av);
            }else if(ch==2){System.out.print("ID: ");delete(sc.nextInt());}
            else if(ch==3){System.out.print("Title or author: ");search(sc.nextLine());}
            else if(ch==4){System.out.print("ID: ");int id=sc.nextInt();System.out.print("Available true/false: ");update(id,sc.nextBoolean());}
            else if(ch==5)forward();else if(ch==6)reverse();else if(ch==7)count();
        }while(ch!=0);
        sc.close();
    }
}