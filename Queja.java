package Modelo;

public class Queja {
  private String numeroCampo;
    private String resena;
    private String usuario;

    public Queja (String numeroCampo, String resena, String usuario) {
        this.numeroCampo = numeroCampo;
        this.resena = resena;
        this.usuario = usuario;
    }

    public String getNumeroCampo() {
        return numeroCampo;
    }

    public void setNumeroCampo(String numeroCampo) {
        this.numeroCampo = numeroCampo;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
