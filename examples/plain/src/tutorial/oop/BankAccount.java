package tutorial.oop;

public class BankAccount {
    private final String id;
    private long balanceCents;

    public BankAccount(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id must not be blank");
        }
        this.id = id;
        this.balanceCents = 0;
    }

    public void deposit(long cents) {
        if (cents <= 0) throw new IllegalArgumentException("cents must be positive");
        balanceCents += cents;
    }

    public void withdraw(long cents) {
        if (cents <= 0) throw new IllegalArgumentException("cents must be positive");
        if (cents > balanceCents) throw new IllegalStateException("insufficient funds");
        balanceCents -= cents;
    }

    public void transferTo(BankAccount other, long cents) {
        if (other == null) throw new IllegalArgumentException("other must not be null");
        this.withdraw(cents);
        other.deposit(cents);
    }

    public long getBalanceCents() {
        return balanceCents;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "id='" + id + '\'' + ", balanceCents=" + balanceCents + '}';
    }
}
