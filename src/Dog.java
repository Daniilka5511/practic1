public class Dog {
        private int year;
        private String name;
        private String poroda;
        private int height;


        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getPoroda() {
                return poroda;
        }

        public void setPoroda(String poroda) {
                this.poroda = poroda;
        }

        public int getHeight() {
                return height;
        }

        public void setHeight(int height) {
                this.height = height;
        }

        public Dog(int year, String name, String poroda, int height) {
                this.year = year;
                this.name = name;
                this.poroda = poroda;
                this.height = height;
        }

        @Override
        public String toString() {
                return "Dog{" +
                        "year=" + year +
                        ", name='" + name + '\'' +
                        ", poroda='" + poroda + '\'' +
                        ", height=" + height +
                        '}';
        }
        public void intoHumanAge() {
                System.out.println(name + "'s age in human years is " + year * 7 + " years");
        }
}