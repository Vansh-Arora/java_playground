package overview; // package all small( seperated by dots )
public class NamingConvention{ // class camelcase starts with caps
    int rollNo; // variable camel case
    void show() // function camel case
    {
        System.out.println("Hello World");
    }
    int PI = 3; //constant all caps
    public static void main(String[] args) {
        NamingConvention var = new NamingConvention();
        var.show();
    }
}
