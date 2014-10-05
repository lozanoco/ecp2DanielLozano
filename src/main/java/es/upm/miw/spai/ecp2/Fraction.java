package es.upm.miw.spai.ecp2;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de
 * la primera por denominador de la segunda) es igual al producto de medios
 * (denominador de la primera por el numerador de la segunda)
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre s��
 * 
 * Reducir varias fracciones a com��n denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a com��n
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicaci��n: La multiplicaci��n de dos fracciones es otra fracci��n que
 * tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La divisi��n de dos fracciones es otra fracci��n que tiene: Por numerador el
 * producto de los extremos. Por denominador el producto de los medios. Invertir
 * fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }
    
    public boolean isMayor(Fraction fraction) {     
        return this.decimal() > fraction.decimal();
    }
    
    public boolean isPropia() {
        return this.numerator < this.denominator;
    }
    
    public double suma (Fraction fr1, Fraction fr2){
    	int numerador = (fr1.getNumerator()*fr2.getDenominator() + fr1.getDenominator()*fr2.getNumerator());
    	int denominador = fr1.getDenominator()*fr2.getDenominator();    			
    	return (double) numerador / denominador;  
    }
    
}
