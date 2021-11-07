package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Cliente;

public class ClienteDAO {
    PreparedStatement pst;
    String sql;
    
    public void salvar(Cliente cliente) throws SQLException{
    sql = "insert into cliente values(?,?,?,?,?,?)";
    pst = Conexao.getInstance().prepareStatement(sql);
    pst.setInt(1, 0);
    pst.setString(2, cliente.getRgCliente());
    pst.setString(3, cliente.getNomeCliente());
    pst.setString(4, cliente.getEnderecoCliente());
    pst.setString(5, cliente.getCidadeCliente());
    pst.setString(6, cliente.getBairroCliente());
    pst.setString(7, cliente.getCepCliente());
    pst.setString(8, cliente.getTelefoneCliente());
    pst.setString(9, cliente.getCelularCliente());
    pst.setString(10, cliente.getEmailCliente());
    pst.setString(11, cliente.getLimiteCreditoCliente());
    pst.execute();
    pst.close();
    }
}
