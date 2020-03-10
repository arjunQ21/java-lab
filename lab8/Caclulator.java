import java.awt.* ;
import java.awt.event.* ;
class Calculator extends Frame implements ActionListener{
    Button buttons[];
    TextField tf ;
    String input = "" ;
    Calculator(){
        buttons = new Button[16];
        String buttonTexts = "123+456-789x0./=";
        int i = 0 ;
        tf = new TextField() ;
        tf.setText("Click Buttons");
        add(tf);
        for(i = 0 ; i< 3; i++) add(new TextField());
        i = 0 ;
        for(Button b: buttons){
            b = new Button(buttonTexts.charAt(i++)+"");
            b.addActionListener(this);
            add(b);
        }
        setLayout(new GridLayout(5, 4));
        setVisible(true);
        setSize(400, 400);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText(((Button)e.getSource()).getLabel());
    }
    public static void main(String[] args){
        new Calculator() ;
    }
}
