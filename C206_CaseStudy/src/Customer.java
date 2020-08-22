//Timorthy
public class Customer {

  private String name;
    private String role;
    private String email;
    private String password;
    private String status;
    private String town;
    private boolean blocked;
    private int attempts;

    public Customer(String name, String role, String email, String password, String status,String town) {
        this.name = name;
        this.role = role;
        this.email = email;
        this.password = password;
        this.status = status;
        this.town=town;
        blocked=true;
        attempts=0;
    }

    public int getAttempts() {
    return attempts;
  }

  public void setAttempts(int attempts) {
    this.attempts = attempts;
  }

  public boolean isBlocked() {
    return blocked;
  }

  public void setBlocked(boolean blocked) {
    this.blocked = blocked;
  }

  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}