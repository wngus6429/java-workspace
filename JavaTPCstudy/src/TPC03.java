import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Book b;
        b = new Book();
        b.title = "자바임";
        b.price = 1000;
        b.company = "회사";
        b.page = 700;

        System.out.print(b.title+"\t");
        System.out.print(b.price+"\t");
        System.out.print(b.company+"\t");
        System.out.println(b.page+"\t");

        PersonVO p;
        p = new PersonVO();
        p.name = "주현";
        p.age = 40;
        p.weight = 68.4f;
        p.height = 175.7f;

        System.out.print(p.name+"\t");
        System.out.print(p.age+"\t");
        System.out.print(p.weight+"\t");
        System.out.print(p.height+"\t");
    }
}
