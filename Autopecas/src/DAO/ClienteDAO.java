/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author radjunior
 */
public class ClienteDAO {
    PreparedStatement stmt;
    String sql;
    ResultSet rs;
    
    public void salvarPf(Cliente cliente) throws SQLException{
        sql = "INSERT INTO autopecas VALUES(?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        //stmt.setString(2, cliente.);
        
        stmt.execute();
        stmt.close();    
    }
    public void salvarPj(Cliente cliente) throws SQLException{
        sql = "INSERT INTO autopecas VALUES(?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        //stmt.setString(2, cliente.);
        
        stmt.execute();
        stmt.close();    
    }
}
  /*private String cpfCliente;
    private String cnpjCliente;
    private String rgCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private String cidadeCliente;
    private String bairroCliente;
    private String cepCliente;
    private String telefoneCliente;
    private String celularCliente;
    private String emailCliente;
    private float limiteCreditoCliente;*/