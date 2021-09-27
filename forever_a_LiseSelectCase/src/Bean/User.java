package Bean;

public class User {
    private int id;
    private String username;
    private String gender;
    private int age;
    private String adress;
    private String qq;
    private String eamil;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", qq='" + qq + '\'' +
                ", eamil='" + eamil + '\'' +
                '}';
    }
}
