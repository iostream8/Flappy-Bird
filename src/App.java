
import javax.swing.JFrame;
public class App {
    public static void main(String[] args) throws Exception {
        int boardwidth =360;
        int boardheight=640;
       
        JFrame frame =new JFrame("Flappy Bird");
        frame.setSize(boardwidth,boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlappyBird Flappy =new FlappyBird();
        frame.add(Flappy);
        frame.pack();
        frame.setVisible(true);

    }
}
