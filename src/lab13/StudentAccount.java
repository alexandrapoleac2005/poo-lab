package lab13;

public class StudentAccount {



    private String username;
    private boolean active;
    private int credits;



    public StudentAccount(String username) {
        this.username = username;
        this.active = true;
        this.credits = 0;
    }



    public String getUsername() {
        return username;
    }



    public boolean isActive() {
        return active;
    }



    public int getCredits() {
        return credits;
    }



    public void deactivate() {
        active = false;
    }



    public void addCredits(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Credits must be positive");
        }
        credits += amount;
    }



    public void removeCredits(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Credits must be positive");
        }
        if (amount > credits) {
            throw new IllegalStateException("Not enough credits");
        }
        credits -= amount;
    }



    public String getStatus() {
        if (!active) {
            return "INACTIVE";
        }
        if (credits >= 30) {
            return "PREMIUM";
        }
        return "STANDARD";
    }
}


