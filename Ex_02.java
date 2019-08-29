package exercicios.lista.pkg5;

public class Ex_02 {

    private int ini, fim;

    public int getIni() {
        return ini;
    }

    public void setIni(int ini) {
        if (ini > 0) {
            toString();
        }
        this.ini = ini;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        if (fim > 0) {
            this.fim = fim;
        }
    }

    private boolean inverte() {
        if (ini > fim) {
            int aux = fim;
            fim = ini;
            ini = aux;
            return true;
        } else {
            return false;
        }

    }
}
