public class BallTest {
    public static void main(String[] args) {
        Ball d1 = new Ball(1, "adidas", "football", 2);
        Ball d2 = new Ball(3, "adidas", "football", 2);
        Ball d3 = new Ball(5, "adidas", "football", 2);
        d3.setSize(1);
        System.out.println(d1);
        d1.TestSize();
        d2.TestSize();
        d3.TestSize();
    }
}
