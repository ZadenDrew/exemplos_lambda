package exemplo_tipos_lambda;

import java.util.function.Supplier;

/**
 *
 * @author acabezaslopez
 */
public class Persoa {

    private String nome;
    private String apelido;
    private String direccion;
    private Supplier<Persoa> per;

    public Persoa() {
    }

    public Persoa(String nome, String apelido, String direccion) {
        this.nome = nome;
        this.apelido = apelido;
        this.direccion = direccion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /* public Persoa crear() {
        Supplier<Persoa> per = () -> {
            return (new Persoa("Pepita", "Perez", "Urzaiz"));
        };
        return (Persoa) per;
//System.out.println(per.get()+"");
    }*/
    public void crear() {
        per = () -> {
            return (new Persoa("Pepita", "Perez", "Urzaiz"));
        };
    }

    public void ver() {
        System.out.println(per.get());
    }

    @Override
    public String toString() {
        return "Persoa{" + "nome=" + nome + ", apelido=" + apelido + ", direccion=" + direccion + '}';
    }

}
