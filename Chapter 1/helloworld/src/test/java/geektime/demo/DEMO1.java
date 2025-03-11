package geektime.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootTest
public class DEMO1 {
    @Test
     public void main() {
        Long n=new Long(1234);
        Long n1=n;
        if (n==n1) {
            System.out.println("n==n1");
        } else {
            System.out.println("n!=n1");
        }
        n++;
        if (n==n1) {
            System.out.println("n==n1");
        } else {
            System.out.println("n!=n1");
        }
}
@Test
public void main1(){
    Supplier<String> i = () -> "Car";
    Consumer<String> c = x -> System.out.print(x.toLowerCase());
    Consumer<String> d = x -> System.out.print(x.toUpperCase());
    c.andThen(d).accept(i.get());
    System.out.println();
}
    public static void main(String[] args) {

        Storage s1 = new Storage(2, 4);
        Storage s2 = new Storage(6, 8);
        System.out.println(s1.data1 + ", " + s1.data2);
        System.out.println(s2.data1 + ", " + s2.data2);
        s1.modify(s1::getData1);
        s2.modify(s1::getData1);
        System.out.println(s1.data1 + ", " + s1.data2);
        System.out.println(s2.data1 + ", " + s2.data2);
        int modifier = 2;
        s1.modify(modifier);
        s2.modify(modifier);
        System.out.println(s1.data1 + ", " + s1.data2);
        System.out.println(s2.data1 + ", " + s2.data2);
    }

}
class Storage {
    int data1;
    float data2;
    Storage(int data1, float data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
    Integer getData1() { return data1; }
    void modify(Supplier<Integer> i) {
        int value = i.get();
        this.data1 = this.data1 / value;
        this.data2 = this.data2 / value;
        value = value + 2;
    }
    void modify(int value) {
        this.data1 = this.data1 / value;
        this.data2 = this.data2 / value;
        value = value + 2;
    }}