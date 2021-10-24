package com.plan.punto3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Complejo extends Number {

    private Double valorReal;
    private Double valorImaginario;

    private DecimalFormat df;
    DecimalFormatSymbols dfs;

    public Complejo(Number valorReal, Number valorImaginario) {
        this.valorReal = valorReal.doubleValue();
        this.valorImaginario = valorImaginario.doubleValue();
        dfs = new DecimalFormatSymbols(Locale.getDefault());
        dfs.setDecimalSeparator('.');
        df = new DecimalFormat("0.#########################", dfs);
    }

    @Override
    public int intValue() {
        return valorReal.intValue();
    }

    @Override
    public long longValue() {
        return valorReal.longValue();
    }

    @Override
    public float floatValue() {
        return valorReal.floatValue();
    }

    @Override
    public double doubleValue() {
        return valorReal;
    }

    public Double getValorReal() {
        return valorReal;
    }

    public void setValorReal(Double valorReal) {
        this.valorReal = valorReal;
    }

    public Double getValorImaginario() {
        return valorImaginario;
    }

    public void setValorImaginario(Double valorImaginario) {
        this.valorImaginario = valorImaginario;
    }

    @Override
    public String toString() {
        return df.format(valorReal) + " + " + df.format(valorImaginario) + 'i';
    }

}
