/*
 * Copyright (C) 2017 SPQRDev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package algoritmos;

/**
 *
 * @author Alberto I. Pico
 */
public class ElevarMatriz extends Thread{
    
    private double [][] matriz;
    private double [][] potencia;
    private int n;
    
    /**
     * 
     * @param matriz
     * @param n
     */
    public ElevarMatriz(double [][] matriz, int n){
        
        this.matriz = matriz;
        this.n = n;
        potencia = new double [n][n];
        
    }
    
    public void elevarMatriz(){
        
        int x = 0;
        while(x < n){
            
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    
                }
            }
            
        }
        
    }
    
    @Override
    public void run(){
        elevarMatriz();
    }
    
    public double[][] getPotencia(){
        return potencia;
    }
    
    
}
