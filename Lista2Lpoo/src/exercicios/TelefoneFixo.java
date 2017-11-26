package exercicios;

public class TelefoneFixo extends DispositivoTelefonia {

    public TelefoneFixo(String cor, String formato) {
        super(cor, formato);
    }

    protected int comprimentoCabo;
    protected boolean fixaParede;

    public int getComprimentoCabo() {
        return comprimentoCabo;
    }

    public void setComprimentoCabo(int comprimentoCabo) {
        this.comprimentoCabo = comprimentoCabo;
    }

    public boolean isFixaParede() {
        return fixaParede;
    }

    public void setFixaParede(boolean fixaParede) {
        this.fixaParede = fixaParede;
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
