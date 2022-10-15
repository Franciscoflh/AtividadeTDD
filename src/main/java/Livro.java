import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String autor;
    private String titulo;
    private boolean emprestado;
    private boolean reservado;
    private List<Emprestimo> historico;

    public Livro(String autor, String titulo, boolean reservado) {
        this.autor = autor;
        this.titulo = titulo;
        this.reservado = reservado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public List<Emprestimo> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Emprestimo> historico) {
        this.historico = historico;
    }

    public boolean emprestar(){
        if(this.isReservado()){
            this.setEmprestado(false);
            System.out.println("Livro está reservado.");
        } else {
            this.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso.");
        }
        return this.isEmprestado();
    }

    public List<Emprestimo> consultarEmprestimosPorUsuario(Usuario usuario) {
        List<Emprestimo>emprestimosPorUsuario =new ArrayList<Emprestimo>
                ();
        for (Emprestimo emprestimoUsuario: emprestimosPorUsuario){
            if(emprestimoUsuario.getUsuario().equals(usuario))
            {
                emprestimosPorUsuario.add(emprestimoUsuario);
            }
        }
        return emprestimosPorUsuario;
    }

}
