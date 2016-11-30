
package boletin7_1;

public class Libros {
    String titulo;
    String autor;
    int nExem;
    int nExemP;

public Libros(){
    
}     
public Libros(String titulo, String autor, int nExem, int nExemP) {
    this.titulo = titulo;
    this.autor = autor;
    this.nExem = nExem;
    this.nExemP = nExemP;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public int getnExem() {
    return nExem;
}

public void setnExem(int nExem) {
    this.nExem = nExem;
}

public int getnExemP() {
    return nExemP;
}

public void setnExemP(int nExemP) {
    this.nExemP = nExemP;
}

public boolean prestamo(){
    if(nExem > 0){
        nExemP += 1;
        nExem -= 1;
        return true;
    }
    else
        return false;  
}

public boolean devolucion(){
    if(nExemP > 0){
       nExemP -= 1;
       nExem += 1;
       return true; 
    }
    else
        return false;   
}

public String toString(){
    String mens = "Titulo: " + titulo + " Autor: " + autor + " Nº de libros disponibles: " + nExem + " Nº de libros prestados: " + nExemP;
    return mens;
}


}