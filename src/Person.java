
public class Person implements IAggregable<Person,Integer>, IDeeplyCloneable<Person>
{
    private int age;
    public Person(int age) {
        this.age = age;
    }
    
    

    // method returns the sum of accum
    // and age of 'this' person
    public Integer aggregate(Integer accum) {
        if (accum == null) {
            return age;
        }
        return age + accum;
    }

    public Person makeDeepCopy() {
      
        return new Person(age);
    }



    public int getAge() {
        return age;
    }



}

