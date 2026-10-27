class Students{
    String name;
    int id;

    Students(String n , int i){
        name=n;
        id=i;
    }
}
public class oops{
    public static void main(String [] args){
        Students s1 = new Students("ali",10947);
        System.out.println(s1.name);
        System.out.println(s1.id);

        Students s2 = new Students("mubashir",11111);
        System.out.println(s2.name);
        System.out.println(s2.id);
    }

}