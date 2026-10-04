package br.com.poliveira;

import java.util.Scanner;

public class Conversor {
    private int num;
    private Integer wrapper;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Integer getWrapper() {
        return wrapper;
    }

    public void setWrapper(Integer wrapper) {
        this.wrapper = wrapper;
    }

    // Lê o valor numérico do console e converte
    public void lerEConverter(Scanner scanner) {
        System.out.println("Digite um valor numérico: ");
        setNum(scanner.nextInt());

        // Converte para o wrapper
        setWrapper(getNum());
    }

    @Override
    public String toString() {
        return "---------------------------------------" +
                "\nValor convertido para Wrapper (Integer): " + getWrapper() +
                "\nTipo da classe: " + getWrapper().getClass().getName() +
                "\n---------------------------------------";
    }
}
