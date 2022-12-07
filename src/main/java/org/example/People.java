package org.example;


import javax.persistence.*;

@Entity
@Table(name = "peoplee")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "people_id")
    private int id;
    @Column(name = "people_first_name")
    private String firstName;
    @Column(name = "people_last_name")
    private String lastName;
    @Column(name = "people_nickname")
    private String nickName;
    @Column(name = "people_address")
    private String address;
    @Column(name = "people_zip")
    private int zip;
    @Column(name = "people_city")
    private String city;
    @Column(name = "people_country")
    private String country;
    @Column(name = "people_email")
    private String email;
    @Column(name = "people_staff")
    private boolean staff;

    public People() {
    }

    public People(int id, String firstName, String lastName, String nickName, String address, int zip, String city, String country, String email, boolean staff) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.address = address;
        this.zip = zip;
        this.city = city;
        this.country = country;
        this.email = email;
        this.staff = staff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStaff() {
        return staff;
    }

    public void setStaff(boolean staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", address='" + address + '\'' +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", staff=" + staff +
                '}';
    }
}
