package com.company;

import java.util.ArrayList;
import java.util.List;

public class Elevador {
    private int terreo = 0;
    private int total_andares = 0;
    private int capacidade_elevador = 0;
    private int pessoal_presentes = 0;
    private int andar_atual = 0;



    public Elevador(int terreo, int total_andares, int capacidade_elevador, int pessoal_presentes) {
        this.terreo = 0;
        this.total_andares = total_andares;
        this.capacidade_elevador = capacidade_elevador;
        this.pessoal_presentes = pessoal_presentes;
    }

    public int getTerreo() {
        return terreo;
    }
    public void setTerreo(int terreo) {
        this.terreo = terreo;
    }
    public int getTotal_andares() {
        return total_andares;
    }
    public void setTotal_andares(int total_andares) {
        this.total_andares = total_andares;
    }
    public int getCapacidade_elevador() {
        return capacidade_elevador;
    }
    public void setCapacidade_elevador(int capacidade_elevador) {
        this.capacidade_elevador = capacidade_elevador;
    }
    public int getPessoal_presentes() {
        return pessoal_presentes;
    }
    public void setPessoal_presentes(int pessoal_presentes) {
        this.pessoal_presentes = pessoal_presentes;
    }

    public int getAndar_atual() {
        return andar_atual;
    }
    public void setAndar_atual(int andar_atual) {
        this.andar_atual = andar_atual;
    }


    /*
     * Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se
        ainda houver espaço);
     */
    public void Entra() {
        int total_pessoas = getPessoal_presentes() + 1;
        if(total_pessoas <= getCapacidade_elevador()) {
            setPessoal_presentes(total_pessoas);
            System.out.println("Entrou!");
        }else {
            System.out.println("Capacidade máxima do elevador atingida!");
        }
    }
    /*
     * Sai : para remover uma pessoa do elevador (só deve remover se houver
        alguém dentro dele);
     */
    public void Sai() {
        if(getPessoal_presentes() != 0 ) {
            setPessoal_presentes(getPessoal_presentes() - 1);
            System.out.println("Saiu!");
        }else
            System.out.println("Elevador vazio!");
    }
    /* Sobe : para subir um andar (não deve subir se já estiver no último andar);
     */
    public void Sobe() {
        if(getAndar_atual() != getTotal_andares()) {
            setAndar_atual(getAndar_atual() + 1);
            System.out.println("Subiu!");
        }else
            System.out.println("Elevador já está no ultimo andar");
    }
    /*
     * Desce : para descer um andar (não deve descer se já estiver no térreo);
     */
    public void Desce() {
        if(getAndar_atual() != 0) {
            setAndar_atual(getAndar_atual() - 1);
            System.out.println("Desceu!");
        }else
            System.out.println("Elevador já está no primeiro andar!");
    }
}
