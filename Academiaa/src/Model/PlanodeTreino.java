/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 181910174
 */
public class PlanodeTreino {
    private String carga;
    private String repeticoes;
    private String series;
        
    public PlanodeTreino() {
    }
    
    public PlanodeTreino(String carga, String repeticoes, String series) {
        this.carga = carga;
        this.repeticoes = repeticoes;
        this.series = series;
    }

    public String getCarga() {
        return carga;
    }

    public String getRepeticoes() {
        return repeticoes;
    }

    public String getSeries() {
        return series;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public void setRepeticoes(String repeticoes) {
        this.repeticoes = repeticoes;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "PlanodeTreino{" + "carga=" + carga + ", repeticoes=" + repeticoes + ", series=" + series + '}';
    }
    
    
}
