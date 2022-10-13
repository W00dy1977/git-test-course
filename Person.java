
package fi.tuni.prog3.sisu;

abstract class Person {
    private String name;
    private String age;
    
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getAge() {
    return age;
    }  
}
