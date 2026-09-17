package br.edu.uemg.simplepaint;

import android.graphics.Color;
import android.graphics.Paint;

public class Estilo {

    public static Paint getEstilosParaLinha(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.MAGENTA);
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(10f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }

    public static Paint getEstilosParaLinhaVerde(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.GREEN);
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(10f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }

    public static Paint getEstilosParaLinhaAzul(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.BLUE);
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(10f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }

    public static Paint getEstilosParaLinhaVermelha(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.RED);
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(10f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }

    public static Paint getEstilosParaLinhaBranca(){
        Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.WHITE);
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(10f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
    }

}
