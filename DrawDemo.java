import java.awt.Color;
import java.util.Random;

/**
 * Class DrawDemo - provides some short demonstrations showing how to use the 
 * Pen class to create various drawings.
 *
 * @author Michael KÃ¶lling and David J. Barnes
 * @version 2011.07.31
 */

public class DrawDemo
{
    private Canvas myCanvas;
    private Random random;

    /**
     * Prepare the drawing demo. Create a fresh canvas and make it visible.
     */
    public DrawDemo()
    {
        myCanvas = new Canvas("Drawing Demo", 700, 600);  
        myCanvas.erase();
        random = new Random();
    }

    /**
     * Draw a square on the screen.
     */
    public void drawSquare()
    {
        Pen pen = new Pen(320, 260, myCanvas);
        pen.setColor(Color.BLUE);

        square(pen);
    }

    /**
     * Draw a wheel made of many squares.
     */
    public void drawWheel()
    {
        Pen pen = new Pen(250, 200, myCanvas);
        pen.setColor(Color.RED);

        for (int i=0; i<36; i++) {
            square(pen);
            pen.turn(10);
        }
    }

    /**
     * Draw a square in the pen's color at the pen's location.
     */
    private void square(Pen pen)
    {
        for (int i=0; i<4; i++) {
            pen.move(100);
            pen.turn(90);
        }
    }

    /**
     * Draw some random squiggles on the screen, in random colors.
     */
    public void colorScribble()
    {
        Pen pen = new Pen(250, 200, myCanvas);

        for (int i=0; i<10; i++) {
            // pick a random color
            int red = random.nextInt(256);
            int green = random.nextInt(256);
            int blue = random.nextInt(256);
            pen.setColor(new Color(red, green, blue));

            pen.randomSquiggle();
        }
    }

    /**
     * Clear the screen.
     */
    public void clear()
    {
        myCanvas.erase();
    } 

    /**
     * metodo para dibujar un triangulo
     * 
     * @param xPosicion en pixeles
     * @param yPosicion en pixeles
     */

    public void triangulo(int xPosicion, int yPosicion){
        // creamos un objeto lapiz Pen
        Pen pen = new Pen(xPosicion,yPosicion, myCanvas);
        pen.setColor(Color.GREEN);
        //movemos el lapiz 300 px a la derecha
        pen.move(300);
        // giramos el lapiz 120º para luego hacer otra linea de 300 px
        pen.turn(120);
        pen.move(300);
        pen.turn(120);
        pen.move(300);
        //alternativa eficiente con un bucle for
        // for(int i = 0 ; i < 3 ; i++){
        // pen.turn(120);
        // pen.move(300);
        // }
    }

    /**
     * metodo para dibujar un pentagono
     */
    public void dibujarPentagono(){
        Pen pen = new Pen(250,100,myCanvas);
        pen.setColor(Color.GREEN);

        // creamos la alternativa eficiente con bucle

        for(int i = 0 ; i< 5 ; i++){

            pen.move(150); 
            pen.turn(72);

        }
    }

    /**
     * metodo para dibujar un poligono regular  de n lados 
     */
    public void dibujarPoligonoNLados(int numeroDeLados){

        Pen pen = new Pen(250,100,myCanvas);
        pen.setColor(Color.GREEN);
        if (numeroDeLados<3){
            System.out.println("Un poligono tiene mas de 2 lados");}
        else{
            for(int i = 0 ; i< numeroDeLados ; i++){

                pen.move(50); 
                pen.turn(360/numeroDeLados);

            }
        }

    }
    /**
     * metodo para dibujar 
     */
}
