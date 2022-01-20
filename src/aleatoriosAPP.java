import javax.swing.JOptionPane;
public class aleatoriosAPP {
 
    public static void main(String[] args) {
 
    	//Indicamos el tamaño del array
        String texto=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(texto)];
 
        int ultimoDigito;
        do{
            texto=JOptionPane.showInputDialog("Introduce numero entre 0 y 9");
            ultimoDigito=Integer.parseInt(texto);
        }while(!(ultimoDigito>=0 && ultimoDigito<=9));
 
        //Rellenamos el array
        rellenarNumAleatorioArray(num, 1, 300);
 
        //Array con los numeros terminados en el numero introducido
        int terminadosEn[]=numTerminadosEn(num, ultimoDigito);
 
        //Mostramos el resultado, mira el metodo de mostrarArrays
        mostrarArrayTerminadosEn(terminadosEn);
 
    }
    public static void rellenarNumAleatorioArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            //Generamos un número entre los parametros pasados
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrarArrayTerminadosEn(int lista[]){
        for(int i=0;i<lista.length;i++){
            //No incluimos las posiciones que tengan un 0
            if(lista[i]!=0){
                System.out.println("El numero "+lista[i]+" acaba en el numero deseado");
            }
        }
    }
 
    public static int[] numTerminadosEn (int num[], int ultimo_numero){
 
        //Array que almacenara los numeros terminados en el numero pedido
        int terminadosEn[]=new int[num.length];
 
        int numeroFinal=0;
 
        for (int i=0;i<terminadosEn.length;i++){
 
            //Restamos el numero por el mismo numero sin unidades.
            numeroFinal=num[i]-(num[i]/10*10);
 
            //Si el numero obtenido es el buscado, lo añadimos
            if (numeroFinal==ultimo_numero){
                terminadosEn[i]=num[i];
            }
        }
 
        return terminadosEn;
    }
 
}