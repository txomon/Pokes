package com.txomon.domain;

import java.util.Date;

public class Contact {
    private final int userId;
    private String userName;
    private String email;
    private Date pokeSent;
    private Date pokeReceived;

    public Contact(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getPokeSent() {
        return pokeSent;
    }

    public void setPokeSent(Date pokeSent) {
        this.pokeSent = pokeSent;
    }

    public Date getPokeReceived() {
        return pokeReceived;
    }

    public void setPokeReceived(Date pokeReceived) {
        this.pokeReceived = pokeReceived;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("***** User Details *****\n");
        stringBuilder.append("id=" + this.getUserId() + "\n");
        stringBuilder.append("email=" + this.getEmail() + "\n");
        stringBuilder.append("fullname=" + this.getUserName() + "\n");
        stringBuilder.append("poke received=" + this.getPokeReceived() + "\n");
        stringBuilder.append("poke sent=" + this.getPokeSent() + "\n");
        stringBuilder.append("*******************************");

        return stringBuilder.toString();
    }
}
