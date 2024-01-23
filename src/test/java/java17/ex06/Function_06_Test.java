package java17.ex06;


import java.util.function.Supplier;

import org.junit.Test;

import java17.data.Person;

/**
 * Exercice 06 - java.util.function.Supplier
 */
public class Function_06_Test {


    // tag::formatAge[]
    // TODO compléter la méthode
    // TODO la méthode retourne une chaîne de caractères de la forme [age=<AGE>] (exemple : [age=12])
    String formatAge(Supplier<Person> supplier) {
    	int age = supplier.get().getAge();
        return String.format("[age=%d]", age);
    }
    // end::formatAge[]


    @Test
    public void test_supplier_formatAge() throws Exception {
        // TODO compléter le test unitaire pour qu'il soit passant
    	String result = formatAge(() -> new Person("John", "Weak", 35, "password"));

        assert result.equals("[age=35]");
    }

}
