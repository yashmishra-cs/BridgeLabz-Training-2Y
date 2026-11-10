import java.util.Scanner;

public class UndoRedo {
    static class Node {
        String text;Node next,prev;
        Node(String s){text=s;}
    }
    static Node head=null,current=null,tail=null;
    static int count=0;
    static void addText(String text){
        Node x=new Node(text);
        if(current==null){head=tail=current=x;}
        else{
            current.next=null;tail=current;
            x.prev=current;current.next=x;current=x;tail=x;
        }
        count++;
        if(count>10){head=head.next;head.prev=null;count--;}
    }
    static void undo(){
        if(current!=null&&current.prev!=null)current=current.prev;
        else System.out.println("Cannot undo");
    }
    static void redo(){
        if(current!=null&&current.next!=null)current=current.next;
        else System.out.println("Cannot redo");
    }
    static void show(){if(current==null)System.out.println("Text is empty");else System.out.println("Current text: "+current.text);}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int ch;
        do{
            System.out.println("\n1 Enter text 2 Undo 3 Redo 4 Show text 5 Show history 0 Exit");
            ch=sc.nextInt();sc.nextLine();
            if(ch==1){System.out.print("Enter text: ");addText(sc.nextLine());}
            else if(ch==2){undo();show();}
            else if(ch==3){redo();show();}
            else if(ch==4)show();
            else if(ch==5){Node t=head;while(t!=null){if(t==current)System.out.print("-> ");System.out.println(t.text);t=t.next;}}
        }while(ch!=0);
        sc.close();
    }
}