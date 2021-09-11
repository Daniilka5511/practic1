public class Ball {
    private int size;
    private String mark;
    private String type;
    private int weight;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Ball(int size, String mark, String type, int weight) {
        this.size = size;
        this.mark = mark;
        this.type = type;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "ball{" +
                "size=" + size +
                ", mark='" + mark + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void TestSize() {
        if (size == 1) {
            System.out.println("Так как размер меча 1 это Адидас");
        } else if (size >=2) {
            System.out.println("Любой другой размер Это найк");
        }
    }
}
