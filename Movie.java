import java.util.Scanner;

public class Movie {
    static class Node {
        String title, director;
        int year;
        double rating;
        Node next, prev;
        Node(String t, String d, int y, double r) {
            title=t; director=d; year=y; rating=r; next=null; prev=null;
        }
    }
    static Node head=null, tail=null;

    static void add(int pos, String title, String director, int year, double rating) {
        Node x = new Node(title,director,year,rating);
        if (head == null) { head=tail=x; return; }
        if (pos <= 1) { x.next=head; head.prev=x; head=x; return; }
        Node temp=head;
        for(int i=1;i<pos-1 && temp.next!=null;i++) temp=temp.next;
        x.next=temp.next; x.prev=temp;
        if(temp.next!=null) temp.next.prev=x; else tail=x;
        temp.next=x;
    }

    static void delete(String title) {
        Node temp=head;
        while(temp!=null && !temp.title.equalsIgnoreCase(title)) temp=temp.next;
        if(temp==null) { System.out.println("Movie not found"); return; }
        if(temp.prev!=null) temp.prev.next=temp.next; else head=temp.next;
        if(temp.next!=null) temp.next.prev=temp.prev; else tail=temp.prev;
        System.out.println("Movie deleted");
    }

    static void search(String value) {
        Node temp=head; boolean found=false;
        while(temp!=null) {
            if(temp.director.equalsIgnoreCase(value) || String.valueOf(temp.rating).equals(value)) {
                print(temp); found=true;
            }
            temp=temp.next;
        }
        if(!found) System.out.println("Movie not found");
    }

    static void update(String title,double rating) {
        Node temp=head;
        while(temp!=null) {
            if(temp.title.equalsIgnoreCase(title)) { temp.rating=rating; System.out.println("Updated"); return; }
            temp=temp.next;
        }
        System.out.println("Movie not found");
    }

    static void print(Node t) {
        System.out.println(t.title+" "+t.director+" "+t.year+" Rating: "+t.rating);
    }
    static void forward() { Node t=head; while(t!=null){print(t);t=t.next;} }
    static void reverse() { Node t=tail; while(t!=null){print(t);t=t.prev;} }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int ch;
        do {
            System.out.println("\n1 Add 2 Delete 3 Search director/rating 4 Forward 5 Reverse 6 Update rating 0 Exit");
            ch=sc.nextInt(); sc.nextLine();
            if(ch==1) {
                System.out.print("Title: "); String t=sc.nextLine();
                System.out.print("Director: "); String d=sc.nextLine();
                System.out.print("Year: "); int y=sc.nextInt();
                System.out.print("Rating: "); double r=sc.nextDouble();
                System.out.print("Position: "); int p=sc.nextInt(); sc.nextLine();
                add(p,t,d,y,r);
            } else if(ch==2) { System.out.print("Title: "); delete(sc.nextLine()); }
            else if(ch==3) { System.out.print("Director or rating: "); search(sc.nextLine()); }
            else if(ch==4) forward();
            else if(ch==5) reverse();
            else if(ch==6) { System.out.print("Title: "); String t=sc.nextLine(); System.out.print("New rating: "); update(t,sc.nextDouble()); }
        } while(ch!=0);
        sc.close();
    }
}