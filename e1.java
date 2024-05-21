package Java_practice2.Encapsulation;

public class e1 {
    public static void main(String[] args) {
        login l1 = new login("Admin","1234Admin");
       // l1.username = "Admin";
        // l1.password = "1234Admin"; we can not access the data
        //System.out.println(l1.password);
        String username = l1.getUsername();
        String password = l1.getPassword(false);
        System.out.println(password);
    }

}
class login{
    private String username;

    public String getPassword(boolean isValid) {     // We can also secure the password that is in setPassword.
        if(isValid){
            return password;
        }
        else{
            return "Not Allowed";
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    public login(String u1, String p1){
        this.password = p1;
        this.username = u1;
    }
}
