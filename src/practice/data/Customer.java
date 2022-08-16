package practice.data;

public class Customer {

    private String name;
    private String address;
    private String email;
    private long phone;
    private boolean isPremiumMember;

    public void setIsPremiumMember(boolean premiumMember) {
        isPremiumMember = premiumMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public boolean isPremiumMember() {
        return isPremiumMember;
    }


}
