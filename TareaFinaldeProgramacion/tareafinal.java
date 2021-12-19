package TareaFinaldeProgramacion;

import java.util.Scanner;

public class tareafinal {
    static Scanner sc = new Scanner(System.in);
    public static void ejercicio06(){
        int i=0;
        Object matriZ06[][] = new Object[5][5];
    
        for (int y=0; y < matriZ06.length; y++){
            for (int m = 0; m <= y; m++) {
                matriZ06[y][m]=i;
                i++;
                
            }
            
        }
        System.out.println("Ejercicio 6:\n");
        imprimirMatriz(matriZ06);   
    }

    public static void ejercicio09(){
        Object matriZ09 [][] =new Object[5][5];
    
        int i = 0;
    
        for (int k = 0; k < matriZ09.length; k++) {
            for (int t = ((matriZ09[0].length)-1)-k; t <=(matriZ09[0].length)-1 ; t++) {
                matriZ09[k][t]=i;
                i++;
                
            }
            
        }
        System.out.println("Ejercicio 9:\n");
        imprimirMatriz(matriZ09);
    
    
    
    }

    public static void ejercicionumero11(){
        Object matrizes11 [][] = new Object[5][5];
        int i=0;
    
        for (int k = 0; k < matrizes11.length; k++){
            for (int o = ((matrizes11[0].length)-1)-k; o >=0 ; o--){
                matrizes11[k][o]=i;
                i++;
                
            }
            
        }
        System.out.println("Ejercicio 11:\n");
        imprimirMatriz(matrizes11);
    
    }
    public static void ejercicionumero12(){
        Object matrizes12 [][] =new Object[5][5];
    
        int i = 0;
    
        for (int k = 0; k < matrizes12.length; k++) {
            for (int o = (matrizes12[0].length)-1; o >= k ; o--) {
                matrizes12[k][o]=i;
                i++;
                
            }
            
        }
        System.out.println("ejercicio 12 es:\n");
        imprimirMatriz(matrizes12);
    
    }
    public static void ejercicionumero13(){
        Object matrizes13 [][] =new Object[5][5];
        int i =0;
    
        for (int o = 0; o < matrizes13[0].length; o++){
            for (int k = 0; k < (matrizes13.length)-o; k++){
                matrizes13[k][o]=i;
                i++;
                
            }
                
            
        }
        System.out.println("Ejercicio 13 es:\n");
        imprimirMatriz(matrizes13);
        
    }
    public static void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               if(matriz[i][j]!=null){
                System.out.print("|"+matriz[i][j]+"|"+"\t");
                
               }else{
                System.out.print("\t");
               }                               
            }
            System.out.println("");
        }
        
    }
    public static void TareaEjercicios(){        
        int opcionesA=0;
        System.out.println("-----------------------Bienvenido a la Tarea Final --------------------");
        System.out.println("\nEliga una Opcion"+ 
        "\n1=Mostrar ejercicio06"+
        "\n2=Mostrar ejercicio09"+
        "\n3=Mostrar ejercicionumero11"+
        "\n4=Mostrar ejercicionumero12"+
        "\n5=Mostrar ejercicionumero13"+
        "\n");
        opcionesA = sc.nextInt();  
        
        while(opcionesA!=0){
            switch(opcionesA) {

              case 1:ejercicio06();break;

              case 2:ejercicio09();;break;
              
              case 3:ejercicionumero11();;break;

              case 4:ejercicionumero12();;break;
              
              case 5:ejercicionumero13();;break;

              case 6:;break;
              
              case 7:;break;
              default: System.out.println("La opcion ingresada no existe!");
            }   
          System.out.println("----------------------------------------------------------------"); //15.511.210.043.330.985.984.000.000        
          System.out.println("-----------------------Bienvenido a la Tarea Final --------------------");
        System.out.println("\nEliga una Opcion"+ 
        "\n1=Mostrar ejercicio06"+
        "\n2=Mostrar ejercicio09"+
        "\n3=Mostrar ejercicionumero11"+
        "\n4=Mostrar ejercicionumero12"+
        "\n5=Mostrar ejercicionumero13"+
        "\n");
        opcionesA = sc.nextInt();    
        }        
    }
    
    public static void main(String [] args){
        TareaEjercicios();
    }
    
}
