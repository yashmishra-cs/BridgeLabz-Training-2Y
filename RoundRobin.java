import java.util.Scanner;

public class RoundRobin {
    static class Node {
        int id, burst, remaining;
        Node next;
        Node(int i,int b){id=i;burst=b;remaining=b;}
    }
    static Node head=null,tail=null;
    static void add(int id,int burst){
        Node x=new Node(id,burst);
        if(head==null){head=tail=x;x.next=head;}
        else{tail.next=x;tail=x;tail.next=head;}
    }
    static void display(){
        if(head==null){System.out.println("No processes");return;}
        Node t=head;do{System.out.print("P"+t.id+"("+t.remaining+") ");t=t.next;}while(t!=head);
        System.out.println();
    }
    static void run(int quantum){
        if(head==null||quantum<=0){System.out.println("Add processes and enter a valid quantum");return;}
        int count=0;Node t=head;do{count++;t=t.next;}while(t!=head);
        int[] id=new int[count],burst=new int[count],waiting=new int[count],turnaround=new int[count];
        t=head;for(int i=0;i<count;i++){id[i]=t.id;burst[i]=t.burst;t=t.next;}
        int time=0;
        while(head!=null){
            Node p=head;
            int used=Math.min(quantum,p.remaining);
            p.remaining-=used;time+=used;
            System.out.println("P"+p.id+" runs for "+used);
            if(p.remaining==0){
                for(int i=0;i<count;i++)if(id[i]==p.id){turnaround[i]=time;waiting[i]=time-burst[i];}
                if(head==tail){head=tail=null;}
                else{head=head.next;tail.next=head;}
            }else if(head!=tail){
                head=head.next;tail.next=p;tail=p;tail.next=head;
            }
            display();
        }
        double w=0,tat=0;
        for(int i=0;i<count;i++){w+=waiting[i];tat+=turnaround[i];}
        System.out.println("Average waiting time: "+w/count);
        System.out.println("Average turn-around time: "+tat/count);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int ch;
        do{
            System.out.println("\n1 Add process 2 Display 3 Run scheduling 0 Exit");ch=sc.nextInt();
            if(ch==1){System.out.print("Process ID: ");int id=sc.nextInt();System.out.print("Burst time: ");add(id,sc.nextInt());}
            else if(ch==2)display();
            else if(ch==3){System.out.print("Time quantum: ");run(sc.nextInt());}
        }while(ch!=0);
        sc.close();
    }
}