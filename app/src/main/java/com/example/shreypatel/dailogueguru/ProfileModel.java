package com.example.shreypatel.dailogueguru;

public class ProfileModel {

  /*  private String username;

    private String country;*/

    private int profilePic;

    public ProfileModel(int profilePic) {
      /*  this.username = username;
        this.country = country;*/
        this.profilePic = profilePic;
    }

   /* public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }*/

    public int getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

}
