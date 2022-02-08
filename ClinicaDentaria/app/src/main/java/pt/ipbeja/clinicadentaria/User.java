package pt.ipbeja.clinicadentaria;

public class User {

private long id;

private String full_name;

private String username;

private String password;

private String email;

private String phone;

private String NIF;

private String seguro;

private String tipo;

private String user_type;

    public User(long id, String full_name, String username, String password, String email, String phone, String NIF, String seguro, String tipo, String user_type) {
        this.id = id;
        this.full_name = full_name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.NIF = NIF;
        this.seguro = seguro;
        this.tipo = tipo;
        this.user_type = user_type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
}
