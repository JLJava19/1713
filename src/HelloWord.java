import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroPresa;
import com.ipartek.formacion.Person;
import java.util.*;

public class HelloWord {

	public static void main(String[] args) throws Exception {
		
		
		/*
		ArrayList a = new ArrayList();
		a.add(89);
		a.add("mmmd");
		System.out.println("numero" +a.size());
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println("probando " +a.get(i).toString());
		}
		*/
		
		String nombre = "Ander";
		ArrayList<Perro> pr = new ArrayList<Perro>();

		System.out.println("   Hello Word   " + nombre);

		Person p1 = new Person();
		// p1.setNombre("Manolo");
		p1.setNombre("MAnolo");
		System.out.println(p1.getNombre());

		// Crear perros
		Perro dog1 = new Perro();
		dog1.setNombre("Perro 1");
		dog1.setRaza("Pitbull");
		dog1.setEdad(-7);
		dog1.setVacunado(true);
		
		System.out.println(dog1.toString());
		
		Perro dog2 = new Perro();
		dog2.setNombre("Perro 2");
		dog2.setRaza("Terrier");
		dog2.setEdad(10);
		dog2.setVacunado(false);
		
		PerroPresa buba = new PerroPresa(); 
		buba.setNombre("buba");
		buba.setRaza("Pitbull");
		buba.atacar();
		
		pr.add(dog1);
		pr.add(dog2);
		
		/*
		 * 
		 * @Override
			public String toString() {
				return "Perro [Nombre=" + Nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
		 */
		for (int i = 0; i < pr.size(); i++) {
			
			
			System.out.println("Nombre " + pr.get(i).getNombre() + " de raza " + pr.get(i).getRaza() + " tiene " + pr.get(i).getEdad() );
			
			}		

	}

}
