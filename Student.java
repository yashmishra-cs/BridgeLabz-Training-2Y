import java.util.Scanner;

public class Student {
    static class Node {
        int roll, age;
        String name, grade;
        Node next;
        Node(int r, String n, int a, String g) {
            roll = r; name = n; age = a; grade = g; next = null;
        }
    }
    static Node head = null;

    static void addAtEnd(int r, String n, int a, String g) {
        Node newNode = new Node(r, n, a, g);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    static void addAtBeginning(int r, String n, int a, String g) {
        Node newNode = new Node(r, n, a, g);
        newNode.next = head;
        head = newNode;
    }

    static void addAtPosition(int r, String n, int a, String g, int pos) {
        if (pos <= 1 || head == null) { addAtBeginning(r,n,a,g); return; }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        Node newNode = new Node(r,n,a,g);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    static void delete(int roll) {
        if (head == null) { System.out.println("List is empty"); return; }
        if (head.roll == roll) { head = head.next; System.out.println("Deleted"); return; }
        Node temp = head;
        while (temp.next != null && temp.next.roll != roll) temp = temp.next;
        if (temp.next == null) System.out.println("Student not found");
        else { temp.next = temp.next.next; System.out.println("Deleted"); }
    }

    static void search(int roll) {
        Node temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    static void updateGrade(int roll, String grade) {
        Node temp = head;
        while (temp != null) {
            if (temp.roll == roll) { temp.grade = grade; System.out.println("Grade updated"); return; }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    static void display() {
        Node temp = head;
        if (temp == null) System.out.println("No records");
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1 Add beginning 2 Add end 3 Add position 4 Delete 5 Search 6 Display 7 Update grade 0 Exit");
            choice = sc.nextInt(); sc.nextLine();
            if (choice >= 1 && choice <= 3) {
                System.out.print("Roll: "); int r = sc.nextInt(); sc.nextLine();
                System.out.print("Name: "); String n = sc.nextLine();
                System.out.print("Age: "); int a = sc.nextInt(); sc.nextLine();
                System.out.print("Grade: "); String g = sc.nextLine();
                if (choice == 1) addAtBeginning(r,n,a,g);
                else if (choice == 2) addAtEnd(r,n,a,g);
                else { System.out.print("Position: "); int p = sc.nextInt(); addAtPosition(r,n,a,g,p); }
            } else if (choice == 4) { System.out.print("Roll: "); delete(sc.nextInt()); }
            else if (choice == 5) { System.out.print("Roll: "); search(sc.nextInt()); }
            else if (choice == 6) display();
            else if (choice == 7) {
                System.out.print("Roll: "); int r = sc.nextInt(); sc.nextLine();
                System.out.print("New grade: "); updateGrade(r,sc.nextLine());
            }
        } while (choice != 0);
        sc.close();
    }
}