package Aula_5.Tarefas;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentual;
    
    public Vendedor(int codigo, String nome) {
        
    }
    
    public Vendedor(int codigo, String nome, double percentual) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentual = percentual;  
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * percentual / 100;
    }
    
    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        double result = calcularPagamentoComissao(valorVenda) - desconto;
        if (result < 0) result = 0;
        
        return result;
    }
    
    public String imprimir(double valorVenda) {
        return "\n============================"
                +"Codigo: "+codigo
                +"\nNome: "+nome
                +"\nValor venda: "+valorVenda
                +"\n% Comissao: "+percentual
                +"\nValor a pagar: "+calcularPagamentoComissao(valorVenda)
                +"\n============================";
    }
    
    public String imprimir(double valorVenda, double desconto) {
        return "\n============================"
                +"\nCodigo: "+codigo
                +"\nNome: "+nome
                +"\nValor venda: "+valorVenda
                +"\n% Comissao: "+percentual
                +"\nDesconto: "+desconto
                +"\nValor a pagar: "+calcularPagamentoComissao(valorVenda, desconto)
                +"\n============================";
    }
}
