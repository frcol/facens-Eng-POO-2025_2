package Aula_3.Tarefa;

class Pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    // Getters e Setters
    public void setCPF(String cpf) {
        if (cpf != null && cpf.length()==11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. Deve conter 11 dígitos numéricos.");
        }
    }

    public String getCPF() {
        return cpf;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido. Não pode ser vazio.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F' || sexo == 'O') {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo inválido. Use 'M', 'F' ou 'O'.");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida. Deve ser >= 0.");
        }
    }

    public int getIdade() {
        return idade;
    }

    // Método imprimir
    public String imprimir() {
        return "Pessoa:\n" +
               "CPF: " + cpf + "\n" +
               "Nome: " + nome + "\n" +
               "Sexo: " + sexo + "\n" +
               "Idade: " + idade + " anos";
    }
}
