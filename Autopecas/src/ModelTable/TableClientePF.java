package ModelTable;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableClientePF extends AbstractTableModel {

    private List<Cliente> dados = new ArrayList<>();
    private String[] colunas = {"ID:","Nome/RzSocial","Endereço","Cidade","CPF","RG","Limite de Crédito","CEP","Telefone","Celular","Email","Bairro"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getNomeCliente();
            case 2:
                return dados.get(linha).getEnderecoCliente();
            case 3:
                return dados.get(linha).getCidadeCliente();
            case 4:
                return dados.get(linha).getCpfCliente();
            case 5:
                return dados.get(linha).getRgCliente();
            case 6:
                return dados.get(linha).getLimiteCreditoCliente();
            case 7:
                return dados.get(linha).getCepCliente();
            case 8:
                return dados.get(linha).getTelefoneCliente();
            case 9:
                return dados.get(linha).getCelularCliente();
            case 10:
                return dados.get(linha).getEmailCliente();
            case 11:
                return dados.get(linha).getBairroCliente();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                dados.get(linha).setId(Integer.parseInt((String) valor));
            case 1:
                dados.get(linha).setNomeCliente((String) valor);
                break;
            case 2:
                dados.get(linha).setEnderecoCliente((String) valor);
                break;
            case 3:
                dados.get(linha).setCidadeCliente((String) valor);
                break;
            case 4:
                dados.get(linha).setCpfCliente((String) valor);
                break;
            case 5:
                dados.get(linha).setRgCliente((String) valor);
                break;
            case 6:
                dados.get(linha).setLimiteCreditoCliente((Float) valor);
                break;
            case 7:
                dados.get(linha).setCepCliente((String) valor);
                break;
            case 8:
                dados.get(linha).setTelefoneCliente((String) valor);
                break;
            case 9:
                dados.get(linha).setCelularCliente((String) valor);
                break;
            case 10:
                dados.get(linha).setEmailCliente((String) valor);
                break;
            case 11:
                dados.get(linha).setBairroCliente((String) valor);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void limpaTabela() {
        int size = getRowCount();
        this.dados.clear();
        fireTableRowsDeleted(0, size);
    }

    public void addRow(Cliente cli) {
        this.dados.add(cli);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

}
