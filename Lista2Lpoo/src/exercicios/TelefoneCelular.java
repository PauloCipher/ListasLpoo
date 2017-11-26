package exercicios;

public class TelefoneCelular extends DispositivoTelefonia {

    public TelefoneCelular(String cor, String formato) {
        super(cor, formato);
    }

    protected int bateria;
    protected String frequencia;

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String getCor() {
        return Cor;
    }

    @Override
    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    @Override
    public String getFormato() {
        return formato;
    }

    @Override
    public void setFormato(String formato) {
        this.formato = formato;
    }

}
