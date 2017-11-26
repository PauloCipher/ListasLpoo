package exercicios;

public class DispositivoTelefonia {

    public String Cor;
    public String formato;

    public DispositivoTelefonia(String cor, String formato) {
        this.Cor = cor;
        this.formato = formato;
    }

    public DispositivoTelefonia() {
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}
