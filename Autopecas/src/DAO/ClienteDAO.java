package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDAO {

    PreparedStatement stmt;
    String sql;
    ResultSet rs;

    public void salvarPJ(Cliente cliente) throws SQLException {
        sql = "INSERT INTO juridica VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, cliente.getCnpjCliente());
        stmt.setString(3, cliente.getNomeCliente());
        stmt.setString(4, cliente.getEnderecoCliente());
        stmt.setString(5, cliente.getCidadeCliente());
        stmt.setString(6, cliente.getBairroCliente());
        stmt.setString(7, cliente.getCepCliente());
        stmt.setString(8, cliente.getTelefoneCliente());
        stmt.setString(9, cliente.getCelularCliente());
        stmt.setString(10, cliente.getEmailCliente());
        stmt.setFloat(11, cliente.getLimiteCreditoCliente());
        stmt.execute();
        stmt.close();
    }
    public void salvarPF(Cliente cliente) throws SQLException {
        sql = "INSERT INTO Fisica VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, cliente.getCpfCliente());
        stmt.setString(3, cliente.getRgCliente());
        stmt.setString(4, cliente.getNomeCliente());
        stmt.setString(5, cliente.getEnderecoCliente());
        stmt.setString(6, cliente.getCidadeCliente());
        stmt.setString(7, cliente.getBairroCliente());
        stmt.setString(8, cliente.getCepCliente());
        stmt.setString(9, cliente.getTelefoneCliente());
        stmt.setString(10, cliente.getCelularCliente());
        stmt.setString(11, cliente.getEmailCliente());
        stmt.setFloat(12, cliente.getLimiteCreditoCliente());
        stmt.execute();
        stmt.close();
    }

    public List<Cliente> pesquisarTabelaPF(String desc) {
        Connection con = Conexao.getInstance();
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM fisica WHERE Nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("idFisica"));
                cli.setCpfCliente(rs.getString("CPF"));
                cli.setRgCliente(rs.getString("RG"));
                cli.setNomeCliente(rs.getString("Nome"));
                cli.setEnderecoCliente(rs.getString("Endereco"));
                cli.setCepCliente(rs.getString("CEP"));
                cli.setCidadeCliente(rs.getString("Cidade"));
                cli.setTelefoneCliente(rs.getString("Telefone"));
                cli.setLimiteCreditoCliente(rs.getFloat("LimiteDeCredito"));
                cli.setBairroCliente(rs.getString("Bairro"));
                cli.setCelularCliente(rs.getString("Celular"));
                cli.setEmailCliente(rs.getString("Email"));
                lista.add(cli);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Cliente> pesquisarTabelaPJ(String desc) {
        Connection con = Conexao.getInstance();
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM juridica WHERE Nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("idJuridica"));
                cli.setCnpjCliente(rs.getString("CNPJ"));
                cli.setNomeCliente(rs.getString("Nome"));
                cli.setEnderecoCliente(rs.getString("Endereco"));
                cli.setCepCliente(rs.getString("CEP"));
                cli.setCidadeCliente(rs.getString("Cidade"));
                cli.setTelefoneCliente(rs.getString("Telefone"));
                cli.setLimiteCreditoCliente(rs.getFloat("LimiteDeCredito"));
                cli.setBairroCliente(rs.getString("Bairro"));
                cli.setCelularCliente(rs.getString("Celular"));
                cli.setEmailCliente(rs.getString("Email"));
                lista.add(cli);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Cliente> verificarCPFClientePF(String desc) {
        Connection con = Conexao.getInstance();
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM fisica WHERE CPF LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("idFisica"));
                cli.setCpfCliente(rs.getString("CPF"));
                cli.setNomeCliente(rs.getString("Nome"));
                lista.add(cli);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Cliente> verificarCNPJClientePJ(String desc) {
        Connection con = Conexao.getInstance();
        List<Cliente> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM juridica WHERE CNPJ LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("idJuridica"));
                cli.setCnpjCliente(rs.getString("CNPJ"));
                cli.setNomeCliente(rs.getString("Nome"));
                lista.add(cli);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public void alterarClientePJ(Cliente cli) throws SQLException {
        sql = "UPDATE juridica SET "
                + "CNPJ = ?,"
                + "Nome = ?,"
                + "Endereco = ?,"
                + "Cidade = ?,"
                + "Bairro = ?,"
                + "CEP = ?,"
                + "Telefone = ?,"
                + "Celular = ?,"
                + "Email = ?,"
                + "LimiteDeCredito = ?"
                + "WHERE idJuridica = ?;";
        
            stmt = Conexao.getInstance().prepareStatement(sql);
            stmt.setString(1, cli.getCnpjCliente());
            stmt.setString(2, cli.getNomeCliente());
            stmt.setString(3, cli.getEnderecoCliente());
            stmt.setString(4, cli.getCidadeCliente());
            stmt.setString(5, cli.getBairroCliente());
            stmt.setString(6, cli.getCepCliente());
            stmt.setString(7, cli.getTelefoneCliente());
            stmt.setString(8, cli.getCelularCliente());
            stmt.setString(9, cli.getEmailCliente());
            stmt.setFloat(10, cli.getLimiteCreditoCliente());
            stmt.setInt(11, cli.getId());
            stmt.executeUpdate();
    }
    public void alterarClientePF(Cliente cli) {
        sql = "UPDATE fisica SET "
                + "CPF = ?,"
                + "RG = ?,"
                + "Nome = ?,"
                + "Endereco = ?,"
                + "Cidade = ?,"
                + "Bairro = ?,"
                + "CEP = ?,"
                + "Telefone = ?,"
                + "Celular = ?,"
                + "Email = ?,"
                + "LimiteDeCredito = ?"
                + "WHERE idFisica = ?;";
        try {
            stmt = Conexao.getInstance().prepareStatement(sql);
            stmt.setString(1, cli.getCpfCliente());
            stmt.setString(2, cli.getRgCliente());
            stmt.setString(3, cli.getNomeCliente());
            stmt.setString(4, cli.getEnderecoCliente());
            stmt.setString(5, cli.getCidadeCliente());
            stmt.setString(6, cli.getBairroCliente());
            stmt.setString(7, cli.getCepCliente());
            stmt.setString(8, cli.getTelefoneCliente());
            stmt.setString(9, cli.getCelularCliente());
            stmt.setString(10, cli.getEmailCliente());
            stmt.setFloat(11, cli.getLimiteCreditoCliente());
            stmt.setInt(12, cli.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
    }

    public void excluirRegistroPF(Cliente cli) throws SQLException {
        sql = "DELETE FROM fisica WHERE idFisica = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, cli.getId());
        stmt.execute();
        stmt.close();
    }
    
    public void excluirRegistroPJ(Cliente cli) throws SQLException {
        sql = "DELETE FROM juridica WHERE idJuridica = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, cli.getId());
        stmt.execute();
        stmt.close();
    }
}
