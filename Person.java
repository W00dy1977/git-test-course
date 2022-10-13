
package fi.tuni.prog3.sisu;

abstract class Person {
    private String name;
    private int age;
    private String sotu; 
    
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
    return age;
    }  
}
