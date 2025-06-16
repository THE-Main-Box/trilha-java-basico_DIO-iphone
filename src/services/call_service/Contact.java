package services.call_service;

public class Contact {
    private String number;
    private String name;

    private boolean onCall;

    public Contact(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public void deceiveCall(){
        onCall = false;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
    }
}
