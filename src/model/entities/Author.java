package model.entities;

public class Author {

    private String name;
    private String email;
    private String cpf;


    public void showDetails(){
        String message = "Mostrando detalhes do autor";
        System.out.println("Name: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("--");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
