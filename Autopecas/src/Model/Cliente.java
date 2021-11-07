/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author radjunior
 */
public class Cliente {
    private int idCliente;
    private String cpfcnpjCliente;
    private String rgCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private String cidadeCliente;
    private String bairroCliente;
    private String cepCliente;
    private String telefoneCliente;
    private String celularCliente;
    private String emailCliente;
    private String limiteCreditoCliente;
    

    public Cliente(int idCliente, String cpfcnpjCliente, String nomeCliente, String enderecoCliente, String cidadeCliente, String bairroCliente, String cepCliente, String telefoneCliente, String celularCliente, String emailCliente, String limiteCreditoCliente, String rgCliente) {
        this.idCliente = idCliente;
        this.cpfcnpjCliente = cpfcnpjCliente;
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.cidadeCliente = cidadeCliente;
        this.bairroCliente = bairroCliente;
        this.cepCliente = cepCliente;
        this.telefoneCliente = telefoneCliente;
        this.celularCliente = celularCliente;
        this.emailCliente = emailCliente;
        this.limiteCreditoCliente = limiteCreditoCliente;
        this.rgCliente = rgCliente;
    }

    public Cliente() {
    }
    
    public String getCpfcnpjCliente() {
        return cpfcnpjCliente;
    }

    public void setCpfcnpjCliente(String cpfcnpjCliente) {
        this.cpfcnpjCliente = cpfcnpjCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getLimiteCreditoCliente() {
        return limiteCreditoCliente;
    }

    public void setLimiteCreditoCliente(String limiteCreditoCliente) {
        this.limiteCreditoCliente = limiteCreditoCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}
