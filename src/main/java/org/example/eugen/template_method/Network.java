package org.example.eugen.template_method;

public abstract class Network {
    private String username;
    private String password;

    public Network() {
    }

    public boolean post(String message) {
        if(login(this.username,this.password)) {
            boolean res = sendData(message.getBytes());
            logout();
            return res;
        }
        return false;
    }

    protected abstract void logout();

    protected abstract boolean sendData(byte[] data);

    public abstract boolean login(String username, String password);
}
