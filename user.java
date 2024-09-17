public abstract class user{
    protected String username;
    protected String password;

    user(String username,String password){
        this.username = username;
        this.password = password;
    }

    abstract void display();

    public boolean check_credentials(String username,String password){
        return this.username.equals(username) && this.password.equals(password);
    }
}