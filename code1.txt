import java.util.HashSet;

public class Username {
    public HashSet<String> usernames;

    public Username() {
        usernames = new HashSet<>();
    }

 
    public boolean addUsername(String username) {
        return usernames.add(username); 
    }

    
    public boolean removeUsername(String username) {
        return usernames.remove(username); 

    public boolean usernameExists(String username) {
        return usernames.contains(username);
    }


    public void displayUsernames() {
        System.out.println("Usernames: " + usernames);
    }

    public static void main(String[] args) {
        Username u= new Username();
        
        
    u.addUsername("user1");
        u.addUsername("user2");
        u.addUsername("user3");

        
        u.displayUsernames();

     
        System.out.println("Does user1 exist? " + u.usernameExists("user1"));
        System.out.println("Does user4 exist? " + u.usernameExists("user4"));

 
        u.removeUsername("user2");
        u.displayUsernames();
    }
}
