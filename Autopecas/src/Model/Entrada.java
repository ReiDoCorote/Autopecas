package Model;

public class Entrada {
    private int idProduto;
    private int idFornecedor;
    private int idNota;
    private String chaveReceita;
    private String dataEmissao;
    private String dataCadastro;
    private int qtdeTotal;
    private float valorTotal;

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getChaveReceita() {
        return chaveReceita;
    }

    public void setChaveReceita(String chaveReceita) {
        this.chaveReceita = chaveReceita;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getQtdeTotal() {
        return qtdeTotal;
    }

    public void setQtdeTotal(int qtdeTotal) {
        this.qtdeTotal = qtdeTotal;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
