import java.util.Scanner;

public class Inventory {
    static class Node {
        String name; int id, quantity; double price; Node next;
        Node(String n,int i,int q,double p){name=n;id=i;quantity=q;price=p;}
    }
    static Node head=null;

    static void add(int pos,String name,int id,int qty,double price) {
        Node x=new Node(name,id,qty,price);
        if(head==null || pos<=1){x.next=head;head=x;return;}
        Node temp=head;
        for(int i=1;i<pos-1 && temp.next!=null;i++)temp=temp.next;
        x.next=temp.next;temp.next=x;
    }
    static void delete(int id) {
        if(head==null)return;
        if(head.id==id){head=head.next;System.out.println("Deleted");return;}
        Node temp=head;
        while(temp.next!=null && temp.next.id!=id)temp=temp.next;
        if(temp.next==null)System.out.println("Item not found");
        else{temp.next=temp.next.next;System.out.println("Deleted");}
    }
    static void update(int id,int qty) {
        Node temp=head;
        while(temp!=null){if(temp.id==id){temp.quantity=qty;System.out.println("Updated");return;}temp=temp.next;}
        System.out.println("Item not found");
    }
    static void search(String key) {
        Node temp=head;boolean found=false;
        while(temp!=null){
            if(temp.name.equalsIgnoreCase(key)||String.valueOf(temp.id).equals(key)){print(temp);found=true;}
            temp=temp.next;
        }
        if(!found)System.out.println("Item not found");
    }
    static void print(Node t){System.out.println(t.id+" "+t.name+" Qty:"+t.quantity+" Price:"+t.price);}
    static void display(){Node t=head;while(t!=null){print(t);t=t.next;}}
    static void total(){double sum=0;Node t=head;while(t!=null){sum=sum+t.price*t.quantity;t=t.next;}System.out.println("Total value: "+sum);}
    static void sortByName() {
        for(Node a=head;a!=null;a=a.next)for(Node b=a.next;b!=null;b=b.next)
            if(a.name.compareToIgnoreCase(b.name)>0){
                String n=a.name;a.name=b.name;b.name=n;
                int id=a.id;a.id=b.id;b.id=id;
                int q=a.quantity;a.quantity=b.quantity;b.quantity=q;
                double p=a.price;a.price=b.price;b.price=p;
            }
    }
    static void sortByPrice() {
        for(Node a=head;a!=null;a=a.next)for(Node b=a.next;b!=null;b=b.next)
            if(a.price>b.price){
                String n=a.name;a.name=b.name;b.name=n;
                int id=a.id;a.id=b.id;b.id=a.id;
                int q=a.quantity;a.quantity=b.quantity;b.quantity=q;
                double p=a.price;a.price=b.price;b.price=p;
            }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int ch;
        do {
            System.out.println("\n1 Add 2 Delete 3 Update quantity 4 Search 5 Display 6 Total value 7 Sort name ascending 8 Sort price ascending 0 Exit");
            ch=sc.nextInt();sc.nextLine();
            if(ch==1){
                System.out.print("Name: ");String n=sc.nextLine();System.out.print("ID: ");int id=sc.nextInt();
                System.out.print("Quantity: ");int q=sc.nextInt();System.out.print("Price: ");double p=sc.nextDouble();
                System.out.print("Position: ");add(sc.nextInt(),n,id,q,p);
            }else if(ch==2){System.out.print("ID: ");delete(sc.nextInt());}
            else if(ch==3){System.out.print("ID: ");int id=sc.nextInt();System.out.print("Quantity: ");update(id,sc.nextInt());}
            else if(ch==4){System.out.print("ID or name: ");search(sc.nextLine());}
            else if(ch==5)display();else if(ch==6)total();else if(ch==7){sortByName();display();}
            else if(ch==8){sortByPrice();display();}
        }while(ch!=0);
        sc.close();
    }
}