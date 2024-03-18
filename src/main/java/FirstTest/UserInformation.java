package FirstTest;

public class UserInformation {

    String name;
    String currentAddress;
    String permanentAddress;
    String email;

    public UserInformation(String name, String currentAddress, String permanentAddress, String email) {
        this.name = name;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public String getEmail() {
        return email;
    }
}
