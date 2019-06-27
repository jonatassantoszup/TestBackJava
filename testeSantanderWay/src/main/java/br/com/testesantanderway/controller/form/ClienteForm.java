package br.com.testesantanderway.controller.form;

import br.com.testesantanderway.modelo.Cliente;


public class ClienteForm {
    private String email;
    private String senha;

    public ClienteForm(Cliente cliente){
        this.email = cliente.getEmail();
        this.senha = cliente.getSenha();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente converter() {
        return new Cliente(email, senha);
    }
}