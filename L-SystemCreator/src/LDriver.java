
public class LDriver {
    public static void main(String[] args){

        Constants fractal = new Constants();
        StringGenerator test1 = new StringGenerator(fractal.frac[0], fractal.frac[1], fractal.frac[2], fractal.frac[3]);

        String str = test1.generate(fractal.iters, fractal.frac[2][0]);

        System.out.println("\\*this is not\n a comment*\\");
        //System.out.println(str); //iteration number needs to be adjusted
        test1.createFractal(str, fractal.frac[4], fractal.moveTo, fractal.angle);  // based on fractal
        //createFractal("F[F+F+F[+F]F]FFF", brackTest, brackTest2, 60);

    }

}





