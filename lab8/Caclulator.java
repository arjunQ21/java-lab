import java.awt.* ;
import java.awt.event.* ;
class Calculator extends Frame implements ActionListener{
	int lastResult ;
	String currentInput ;
	String operation  ;
    Button buttons[];
    TextField tf ;
    String input = "" ;
    Calculator(){
    	lastResult = 0 ;
    	currentInput = "" ;
    	operation = "+" ;
        buttons = new Button[17];
        String buttonTexts = "C123+456-789x0./E";
        int i = 0 ;
        tf = new TextField() ;
        tf.setText("Click Buttons");
        add(tf);
        for(i = 0 ; i< 2; i++) add(new TextField());
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
    	String clicked = ((Button)e.getSource()).getLabel() ;
    	switch(clicked){
    		case "0":
    		case "1":
    		case "2":
    		case "3":
    		case "4":
    		case "5":
    		case "6":
    		case "7":
    		case "8":
    		case "9":
    		case ".":
    			currentInput += number ; 
    			show(currentInput) ;
    			break ;
    		case "+":
    		case "-":
    		case "*":
    		case "/":
    			calculate() ;
    			operation = clicked ;
    			break ;
    		case "E":
    			calculate() ;
    			break ;
    		case "C":
    			lastResult = 0 ;
    			operation = "+" ;
    			show(currentInput = "") ;
    			break ;
    	}

    }
    public void calculate(){
    	int first = lastResult ;
    	int second = Integer.parseInt(currentInput) ;
    	int finalResult = lastResult ;
    	switch(operation){
    		case "+":
    			finalResult = first + second ;
    			break ;
    		case "-":
    			finalResult = first - second ;
    			break ;
    		case "*":
    			finalResult = first * second ;
    			break ;
    		case "/":
    			if(second == 0){
    				System.out.println("Cant divide when denominator is 0.") ;
    			}else{
    				finalResult = first / second ;	
    			}
    			break ;
    	}
    	lastResult = finalResult ;
    	show(lastResult) ;
    	currentInput = "" ;
    }
    public void show(int no){
    	show(Integer.toString(no)) ;
    }
    public void show(String str){
    	tf.setText(str) ;
    }
    public static void main(String[] args){
        new Calculator() ;
    }
}
