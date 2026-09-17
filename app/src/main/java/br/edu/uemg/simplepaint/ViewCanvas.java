package br.edu.uemg.simplepaint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import androidx.annotation.Nullable;

public class ViewCanvas extends View {

    private Path path;
    private Bitmap bitmap;
    private Canvas canvas;
    private float fixoX, fixoY, eixoX, eixoY;
    private int TOLERANCIA_MOVIMENTO = 5;
    private Linha linha;
    private ArrayList<Linha> linhas = new ArrayList<>();
    public ViewCanvas(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inicializaObjetos();
    }

    public void inicializaObjetos(){
        path = new Path();
        Paint paint = Estilo.getEstilosParaLinhaBranca();
        linha = new Linha(getContext(), path, paint);
    }

    public void inicializarObjetosMagenta(){
        linhas.add(linha);
        path = new Path();
        Paint paint = Estilo.getEstilosParaLinha();
        linha = new Linha(getContext(), path, paint);
    }

    public void inicializarObjetosVerde(){
        linhas.add(linha);
        path = new Path();
        Paint paint = Estilo.getEstilosParaLinhaVerde();
        linha = new Linha(getContext(), path, paint);
    }

    public void inicializarObjetosAzul(){
        linhas.add(linha);
        path = new Path();
        Paint paint = Estilo.getEstilosParaLinhaAzul();
        linha = new Linha(getContext(), path, paint);
    }

    public void inicializarObjetosVermelha(){
        linhas.add(linha);
        path = new Path();
        Paint paint = Estilo.getEstilosParaLinhaVermelha();
        linha = new Linha(getContext(), path, paint);
    }

    public void inicializarObjetosBranca(){
        linhas.add(linha);
        path = new Path();
        Paint paint = Estilo.getEstilosParaLinhaBranca();
        linha = new Linha(getContext(), path, paint);
    }

    private void inicioToque(float x, float y){
        path.moveTo(x, y);
        eixoX = x;
        eixoY = y;
    }

    private void moveuDedoTela(float x, float y){
        float distanciaX = Math.abs(x - eixoX);
        float distanciaY = Math.abs(y - eixoY);

        if(distanciaX >= TOLERANCIA_MOVIMENTO ||
           distanciaY >= TOLERANCIA_MOVIMENTO
        ){
            path.quadTo(eixoX, eixoY, (x+eixoX) / 2 , (y + eixoY) /2);
        }
        eixoX = x;
        eixoY = y;
    }

    private void tirouDedoTela(){
        path.lineTo(eixoX, eixoY);
    }

    public void limparCanvas(){
        linhas.clear();
        path.reset();
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Linha l : linhas) {
            l.desenharLinha(canvas);
        }
        linha.desenharLinha(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                inicioToque(x,y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                moveuDedoTela(x, y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                tirouDedoTela();
                invalidate();
                break;
        }
        return true;
    }

















}
