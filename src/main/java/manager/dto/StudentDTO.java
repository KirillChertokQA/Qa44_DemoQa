package manager.dto;

import manager.enums.Gender;

public class StudentDTO {
    private String name;
    private String lastName;
    private String email;
    private Gender gender;
    private String mobile;
    private String dateOfBirth;
    private String subject;
    private String hobbies;
    private String pictures;
    private String currentAddress;
    private String state;
    private String city;


    public String getName() {
        return name;
    }

    public void setName(String name) {   //with=set
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
