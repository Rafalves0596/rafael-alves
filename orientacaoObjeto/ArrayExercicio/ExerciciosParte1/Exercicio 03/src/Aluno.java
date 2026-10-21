public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private String curso;
    private double media;

    public Aluno(String nome, int idade, String matricula, String curso, double media) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setCurso(curso);
        setMedia(media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome inválido.");

        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 5){
            throw new IllegalArgumentException("Idade inválida");
        }
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if(matricula == null || matricula.isBlank()){
            throw new IllegalArgumentException("Número de Matrícula inválido.");

        }
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if(curso == null || curso.isBlank()){
            throw new IllegalArgumentException("Curso inválido.");
        }
        this.curso = curso;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        if(media < 0){
            throw new IllegalArgumentException("Média inválido.");
        }
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", media=" + media +
                '}';
    }
}