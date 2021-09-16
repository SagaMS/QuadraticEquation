public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public void explanation() {
        System.out.println(" Квадратное уравнение это уравнения вида ax^2+bx+c = 0, пожалуйста введите аргументы в порядке a, b, c");
        System.out.println("Эта програма по умолчанию решает квадратное уравнение, \n " +
                "но также рассматривает случай, когда первый аргумент равен 0, что \n " +
                "преобразует уравнение из квадратного в линейное.");
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double[] findUnknown() {

        if (a == 0) {
            double[] linearSolutions = new double[1];
            linearSolutions[0] = (-1 * c) / b;
            return linearSolutions;
        } else {
            double D = findDiscriminant(a, b, c);

            if (D == 0) {
                double[] oneSolution = new double[1];
                oneSolution[0] = - b/ (2 * a);
                return oneSolution;


            } else if (D > 0) {
                double[] twoSolution = new double[2];
                twoSolution[0] = (-b - Math.sqrt(D))/(2 * a);
                twoSolution[1] = (-b + Math.sqrt(D))/(2 * a);
               return  twoSolution;
            } else {
                double[] error = new double[0];
                System.out.println("В этом уравнении корней нет");
                return error;
            }

        }

    }

    protected double findDiscriminant(double a, double b, double c) {
        double D = Math.pow(b, 2) - (4 * a * c);
        return D;

    }

    public void printEd(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Solution is "+ arr[i]);
        }
    }

}
