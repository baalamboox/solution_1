//package www;
import java.util.ArrayList; //Se manda a importar la clase llamada "ArrayList".
import java.util.Iterator; //Se manda a importar la clase llamada "Iterator".
//Se crea una clase (class) de tipo publica (public) llamada "Solution"
public class Solution {
	public static int original[]={3,3,9,5,9,7,7};
	public static ArrayList<Integer> lista = new ArrayList<>();
	public static int clon[]= new int[original.length];
	public static void comparar(int a[]) {
		for(int i = 0; i < a.length ; i++) {
			for (int j = 0; j < a.length ; j++) {
				if(i==j) {
					// System.out.println("i:"+i+" j:"+j +" Saltando por ser iguales");
					continue;
				}
				//System.out.println("i:"+i+" j:"+j+ " valor[i]:"+a[i]+" valor[j]:"+a[j]);
				if(a[i]==a[j]) {
					//System.out.println("Valores identicos encontrados");
					//System.out.println("Comprobando las posiciones i:" + i + " j:"+j);
					if(verificando_existencia(i)== -1) {
						lista.add(i);
					}
					if(verificando_existencia(j)== -1) {
						lista.add(j);
					}
				} 
			}
			//System.out.println("------------------");
		}
	}
	public static int verificando_existencia(int index) {
		return lista.indexOf(index);
	}
	public static void imp_arrayList() {
		System.out.println("---ArrayList---");
		Iterator it = lista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void rellena_clon() {
		Iterator it = lista.iterator();
		while(it.hasNext()) {
			clon[(int)it.next()]=1;
		}
	}
	public static void imp_clon() {
		System.out.println("************");
		System.out.println("Valores de clon");
		for(int i = 0; i < clon.length ; i++) {
			System.out.println("Posicion: "+i+" Valor:"+clon[i]);
		}
	}
	public static int encuentra_atipico() {
		//System.out.println("************");
		//System.out.println("Encontrado valor atipico...");
		for(int i = 0; i < clon.length ; i++) {
			if(clon[i]==0) {
				//System.out.println("\n\nEncontrado: \n\n");
				//System.out.println("Posicion:"+i+" Valor:"+original[i]);
				return original[i];
			}
		}
		return 0;
	}
	public static int solution(int[]A) {
		comparar(A);
		rellena_clon();
		return encuentra_atipico();
	}
	public static void main(String[] args) {
		System.out.println(solution(original));
	}
}
/*
	public -> Ademas de ser una palabra reservada (keyword), es un modificador de acceso, esto quiere decir que la clase, metodo o field que lo contenga se va poder acceder dentro y fuera de la clase o desde otra entidad programatica.
	class -> Tambien es una palabra reservada (keyword), define un espacio de trabajo donde estaran metodos y variables (locales y fields).
	static -> Es un modificador de ambito, tambien es una palabra reservda (keyword) y sirve para hacer uso de quien lo contenga (fields y metodos) si necesidad de crar un objeto de la clase y sin hacer referencia a ningun otro.
	int -> Representa que es un valor primitivo de tipo entero, se trabaja en la memoria llamda "stack".
	= -> Es conocido como operador de asignacion, sirve para asignar lo que contenga a su lado derecho.
	; -> Se utiliza para identificar hasta a donde termina cada intrucion, conocido como fin de instruccion.
	for -> Es una estructura de iteracion y va repetir lo que contenga dentro de ella siempre y cuando en su apartado de condicion sea verdadera.
	<= -> Operador relacional, sirve para comparar entre dos valores numericos, si uno es menor o igual que otro.
	>= -> Operador relacional, sirve para comparar entre dos valores numericos, si uno es mayor o igual que otro.
	+ -> Operador aritmetico, tiene dos funciones, sirve tanto para realizar la operacion de suma o tambien es usado para realizar concatenaciones.
	- -> Operador aritmetico, tiene la funcion de realizar la operacion de resta.
	++ -> Operador incremental, esto sirve para ir incrementando en una unidad una variable numerica, es lo mismo que tener: (x = x + 1).
	-- -> Operador decremental, esto srive para ir decrementado en una unidad una variable numerica, es lo mismo que tener: (x = x - 1).
	[] -> Definen un objeto llamda arreglo (array).
	length -> Obtiene la longitud de un array de devuelve un valor de tipo entero (int).
	void -> Se utiliza para referirse que un metodo no devolvera ningun valor despues de concluir.
	main -> Es una palabra reservada (keyword) y denota que es el metodo principal, donde empezara la ejecución de todo el programa.
	String[] -> Denota un arreglo (array) de tipo String, al tratarse de un objeto se trabaja en la memoria "heap" y solo se almacena en la memoria "stack" la ruta en hexdecimal de la direccion de memoria heap donde se encuentre ese objeto.
	{ -> Identifica donde empieza cada bloque de codigo ya sea de una clase o un metodo (apertura de implemetacion).
	} -> Identifica donde finaliza cada bloque de codigo.
	, -> Separa una grupacion del mismo tipo.
	() -> Ya sea que se usen para denotar que es un metodo y dentro de ellas van su paramentros o para agrupar (agrupacion) operaciones aritmenticas para darle jerarquia de quien se empezara a resolver primero.
	"" -> Se usan para cadenas de texto.
	println -> Es un metodo para imprimir en pantalla, este metodo le pertenece a la field "out" que a su ves esta contiene un metodo de la clase "printStrem" y que a la vez la varible "out" pertenece a la clase "System".
	System -> Es una clase donde contiene diferentes fields y metodos que van a permitir interactuar con el sistema.
*/