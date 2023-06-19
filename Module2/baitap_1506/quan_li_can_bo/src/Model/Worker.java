package Model;

public class Worker extends Cadres {
        private int grades;

        public int getGrades() {
                return grades;
        }

        public void setGrades(int grades) {
                this.grades = grades;
        }

        public Worker(int grades) {
                this.grades = grades;
        }

        public Worker(String name, int age, String gender, String address, int grades) {
                super(name, age, gender, address);
                this.grades = grades;
        }

        @Override
        public String toString() {
                return "Worker{" +
                        "grades=" + grades +
                        '}';
        }
}
