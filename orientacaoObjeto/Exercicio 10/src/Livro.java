public class Livro {
    private String titulo;
    private boolean emprestado;

    public Livro(String titulo, boolean emprestado) {
        setTitulo(titulo);
        this.emprestado = emprestado;
    }
    public void emprestar (){
        if(emprestado){
            throw new IllegalArgumentException("Livro já emprestado.");
        }
        emprestado = true;
    }
    public void devolver(){
        if(! emprestado){
            throw new IllegalArgumentException("Está disponível.");
        }
        emprestado = true;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException("Título não encontrado.");
        }
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "O Livro" + " de titulo = " + titulo + '\'' +
                ", emprestado=" + emprestado +
                '}';
    }
}
