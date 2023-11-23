package Array;

public class Produtos {
    String nome;
    String descricao;
    float valores;

    public Produtos(){

    }

    public String getName(){
        return nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public float getValores(){
        return valores;
    }

    public void setValores(float valores){
        this.valores = valores;
    }

    public String toString(){
        return "Name: " + nome + ", Descricao: " + descricao + ", Valores: " + valores; 
    }
}
