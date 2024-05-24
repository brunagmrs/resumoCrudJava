public class Objeto {
    
    private int id; //atributo id para utilização de chave primária no banco de dados
    private String atributo1; //primeiro atributo do tipo String (caracteres)
    private int atributo2; //segundo atributo do tipo int (inteiro)
    private double atributo3; //terceiro atributo do tipo double (decimal)

    public Objeto() { //construtor quando não há parâmetros em sua instanciação, aqui os atributos serão inicializados sem valores significativos
        this.setAtributo1(""); //incia com atributo1 vazio
        this.setAtributo2(0); //inicia com atributo2 zerado
        this.setAtributo3(0.0); //inicia com atributo3 zerado
    }

    public Objeto(String parametroAtributo1, int parametroAtributo2, double parametroAtributo3) { //construtor quando o usuário insere parâmetros em sua instanciação
        this.setAtributo1(parametroAtributo1); //atribui o valor que o usuário iseriu no primeiro parâmetro
        this.setAtributo2(parametroAtributo2); //atribui o valor que o usuário iseriu no segundo parâmetro
        this.setAtributo3(parametroAtributo3); //atribui o valor que o usuário iseriu no terceiro parâmetro
    } 

    
    
    //Getters e Setters dos atributos 
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the atributo1
     */
    public String getAtributo1() {
        return atributo1;
    }

    /**
     * @param atributo1 the atributo1 to set
     */
    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    /**
     * @return the atributo2
     */
    public int getAtributo2() {
        return atributo2;
    }

    /**
     * @param atributo2 the atributo2 to set
     */
    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    /**
     * @return the atributo3
     */
    public double getAtributo3() {
        return atributo3;
    }

    /**
     * @param atributo3 the atributo3 to set
     */
    public void setAtributo3(double atributo3) {
        this.atributo3 = atributo3;
    }

    //emissão de valores no terminal quando chamado o Objeto
    @Override
    public String toString() {
        return "Atributo1: " + this.atributo1 + 
            "\nAtributo2: " + this.atributo2 +
            "\nAtributo3: " + this.atributo3;
    }
    
    
}
