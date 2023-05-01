package main;

import sp.fateczl.lucas.listaInt.Lista;

public class Principal {

    public static void main(String[] args) throws Exception {
        Lista listaL = new Lista();
        listaL.addFirst(3);
        listaL.addLast(5);
        listaL.addLast(18);
        listaL.addLast(12);
        listaL.addLast(9);
        listaL.addLast(7);
        listaL.addLast(6);
        listaL.addLast(2);
        listaL.addLast(13);
        listaL.addLast(4);
        listaL.addLast(16);
        
        Lista listaL2 = new Lista();
        for (int i = listaL.size() - 1; i >= 0; i--) {
            listaL2.addLast(listaL.get(i));
        }


        System.out.println("Lista original: " + listaL);
        System.out.println("Lista invertida: " + listaL2);
    } 
}


