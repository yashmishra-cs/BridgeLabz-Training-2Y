import java.util.ArrayList;
import java.util.Scanner;

public class Friends {
    static class User {
        int id,age;String name;
        ArrayList<Integer> friends=new ArrayList<>();
        User(int i,String n,int a){id=i;name=n;age=a;}
    }
    static ArrayList<User> users=new ArrayList<>();
    static User find(int id){for(User u:users)if(u.id==id)return u;return null;}
    static void addUser(int id,String name,int age){users.add(new User(id,name,age));}
    static void addFriend(int a,int b){
        User u=find(a),v=find(b);
        if(u==null||v==null){System.out.println("User not found");return;}
        if(!u.friends.contains(b))u.friends.add(b);
        if(!v.friends.contains(a))v.friends.add(a);
        System.out.println("Friend added");
    }
    static void removeFriend(int a,int b){
        User u=find(a),v=find(b);
        if(u!=null)u.friends.remove(Integer.valueOf(b));
        if(v!=null)v.friends.remove(Integer.valueOf(a));
        System.out.println("Friend removed if connection existed");
    }
    static void displayFriends(int id){
        User u=find(id);if(u==null){System.out.println("User not found");return;}
        for(int friendId:u.friends){User f=find(friendId);if(f!=null)System.out.println(f.id+" "+f.name);}
    }
    static void mutual(int a,int b){
        User u=find(a),v=find(b);if(u==null||v==null){System.out.println("User not found");return;}
        boolean found=false;
        for(int id:u.friends)if(v.friends.contains(id)){User f=find(id);System.out.println(f.name);found=true;}
        if(!found)System.out.println("No mutual friends");
    }
    static void search(String key){
        for(User u:users)if(u.name.equalsIgnoreCase(key)||String.valueOf(u.id).equals(key)){
            System.out.println(u.id+" "+u.name+" Age:"+u.age);return;
        }
        System.out.println("User not found");
    }
    static void countFriends(){for(User u:users)System.out.println(u.name+" has "+u.friends.size()+" friends");}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int ch;
        do{
            System.out.println("\n1 Add user 2 Add friend 3 Remove friend 4 Mutual friends 5 Display friends 6 Search user 7 Count friends 0 Exit");
            ch=sc.nextInt();sc.nextLine();
            if(ch==1){System.out.print("ID: ");int id=sc.nextInt();sc.nextLine();System.out.print("Name: ");String n=sc.nextLine();System.out.print("Age: ");addUser(id,n,sc.nextInt());}
            else if(ch==2){System.out.print("Two IDs: ");addFriend(sc.nextInt(),sc.nextInt());}
            else if(ch==3){System.out.print("Two IDs: ");removeFriend(sc.nextInt(),sc.nextInt());}
            else if(ch==4){System.out.print("Two IDs: ");mutual(sc.nextInt(),sc.nextInt());}
            else if(ch==5){System.out.print("User ID: ");displayFriends(sc.nextInt());}
            else if(ch==6){System.out.print("Name or ID: ");search(sc.nextLine());}
            else if(ch==7)countFriends();
        }while(ch!=0);
        sc.close();
    }
}