import java.util.Scanner;

public class Task {
    static class Node {
        int id, priority;
        String name, date;
        Node next;
        Node(int i,String n,int p,String d){id=i;name=n;priority=p;date=d;}
    }
    static Node head=null, current=null;

    static void add(int pos,int id,String name,int priority,String date) {
        Node x=new Node(id,name,priority,date);
        if(head==null){head=x;x.next=head;current=head;return;}
        if(pos<=1){
            Node last=head;while(last.next!=head)last=last.next;
            x.next=head;last.next=x;head=x;return;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp.next!=head;i++)temp=temp.next;
        x.next=temp.next;temp.next=x;
    }

    static void delete(int id) {
        if(head==null){System.out.println("List empty");return;}
        Node temp=head, prev=null;
        do {
            if(temp.id==id) {
                if(temp==head && temp.next==head){head=null;current=null;}
                else {
                    if(temp==head) {
                        Node last=head;while(last.next!=head)last=last.next;
                        head=head.next;last.next=head;
                    } else prev.next=temp.next;
                    if(current==temp)current=temp.next;
                }
                System.out.println("Task deleted");return;
            }
            prev=temp;temp=temp.next;
        } while(temp!=head);
        System.out.println("Task not found");
    }

    static void display() {
        if(head==null){System.out.println("No tasks");return;}
        Node temp=head;
        do {System.out.println(temp.id+" "+temp.name+" "+temp.priority+" "+temp.date);temp=temp.next;} while(temp!=head);
    }

    static void currentTask() {
        if(current==null)System.out.println("No current task");
        else System.out.println(current.id+" "+current.name+" "+current.priority+" "+current.date);
    }

    static void nextTask() { if(current!=null)current=current.next; currentTask(); }

    static void search(int p) {
        if(head==null)return;
        Node temp=head;boolean found=false;
        do {if(temp.priority==p){System.out.println(temp.id+" "+temp.name);found=true;}temp=temp.next;}while(temp!=head);
        if(!found)System.out.println("No task found");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);int ch;
        do {
            System.out.println("\n1 Add 2 Delete 3 Current task 4 Next task 5 Display 6 Search priority 0 Exit");
            ch=sc.nextInt();sc.nextLine();
            if(ch==1) {
                System.out.print("ID: ");int id=sc.nextInt();sc.nextLine();
                System.out.print("Name: ");String n=sc.nextLine();
                System.out.print("Priority: ");int p=sc.nextInt();sc.nextLine();
                System.out.print("Due date: ");String d=sc.nextLine();
                System.out.print("Position: ");add(sc.nextInt(),id,n,p,d);
            } else if(ch==2){System.out.print("ID: ");delete(sc.nextInt());}
            else if(ch==3)currentTask();
            else if(ch==4)nextTask();
            else if(ch==5)display();
            else if(ch==6){System.out.print("Priority: ");search(sc.nextInt());}
        }while(ch!=0);
        sc.close();
    }
}