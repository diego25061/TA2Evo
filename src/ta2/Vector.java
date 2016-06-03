/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta2;

/**
 *
 * @author diego
 */

public class Vector {
	private float anguloR;
	private float modulo;
	private float compX, compY;
	
	public boolean equals(Vector v){
		return (
				anguloR == v.anguloR &&
				modulo == v.modulo &&
				compX == v.compX &&
				compY == v.compY
				);
	}
	
	public Vector(){
	}
	
	public Vector(Vector vectorACopiar){
		this.setComponentes(vectorACopiar.x(), vectorACopiar.y());
	}
	
	public void setComponentes(float compX, float compY){
		this.compX=compX;
		this.compY=compY;
		anguloR=(float) Math.atan2( compY, compX);
		modulo= (float) Math.sqrt((float) Math.pow(compX, 2)+ (float) Math.pow(compY, 2));
	}
	
	public Vector( float x , float y){
		this.setComponentes(x, y);
	}
	
	public void sumar(float x , float y){
		this.compX+=x;
		this.compY+=y;
		anguloR=(float) Math.atan2( compY, compX);
		modulo= (float) Math.sqrt((float) Math.pow(compX, 2)+ (float) Math.pow(compY, 2));
	}
	
	public float x(){
		compX=modulo*(float)Math.cos(anguloR);
		return compX;
	}
	
	public float y(){
		compY=modulo*(float)Math.sin(anguloR);
		return compY;
	}
	
	public void setAngulo(float anguloRadianes){
		this.anguloR=anguloRadianes;
	}
	
	public void setAnguloGrados(float anguloGrados){
		this.anguloR=(float) Math.toRadians(anguloGrados);
	}
	
	public float getAngulo(){
		return anguloR;
	}
	
	public float getModulo(){
		return modulo;
	}
	
	public float getAnguloGrados(){
		return (float) Math.toDegrees(anguloR);
	}
	
	public void setModulo(float modulo){
		this.modulo=modulo;
		x();y();
	}
	
	public Vector copiar(){
		return new Vector(x(),y());
	}
	
	public Vector cambiarMod(float mod){
		Vector v = new Vector(x(), y());
		v.setModulo(mod);
		return v;
	}
	
	public float[] coords(){
		float[] f = {compX,compY};
		return f;
	}
}