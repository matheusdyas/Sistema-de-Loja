package Classes;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Produto {
           
    private int codigo;

    public static final String PROP_CODIGO = "codigo";

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        int oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

        private double precoVenda;

    public static final String PROP_PRECOVENDA = "precoVenda";

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        double oldPrecoVenda = this.precoVenda;
        this.precoVenda = precoVenda;
        propertyChangeSupport.firePropertyChange(PROP_PRECOVENDA, oldPrecoVenda, precoVenda);
    }

        private double precoCusto;

    public static final String PROP_PRECOCUSTO = "precoCusto";

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        double oldPrecoCusto = this.precoCusto;
        this.precoCusto = precoCusto;
        propertyChangeSupport.firePropertyChange(PROP_PRECOCUSTO, oldPrecoCusto, precoCusto);
    }
    
        private String nome;

    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }
    
        private String descricao;

    public static final String PROP_DESCRICAO = "descricao";

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        propertyChangeSupport.firePropertyChange(PROP_DESCRICAO, oldDescricao, descricao);
    }

    public Produto(int codigo, String nome, String descricao, double precoVenda, double precoCusto) {
        this.codigo = codigo;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.nome = nome;
        this.descricao = descricao;
    }
        
    public String mostraDados(){
        String dados = "Código: "+this.codigo+".\nNome: "+this.nome+".\nPreço de custo: "+this.precoCusto+".\n"
                + "Preço de venda: "+this.precoVenda;
        
        return dados;
    }
}
