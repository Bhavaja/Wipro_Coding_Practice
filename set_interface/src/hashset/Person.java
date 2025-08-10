package hashset;

import java.util.Objects;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    // Override hashCode() and equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Combines both fields
    }
 
   @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return age == p.age && Objects.equals(name, p.name);
    }
 
    

   @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


	

