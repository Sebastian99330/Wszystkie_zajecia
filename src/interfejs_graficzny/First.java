package interfejs_graficzny;
import java.awt.*;

public class First extends Frame {
	First (){
		Button b=new Button (" click me");
		b. setBounds (30 ,100 ,80 ,30);
		add (b );
		setSize (300 ,300);
		setLayout ( null );
		setVisible ( true );
	}

	}

	class First2 {
		First2 (){
		Frame f= new Frame ();
		Button b=new Button (" click me");
		b. setBounds (30 ,50 ,80 ,30);
		f. add (b );
		f. setSize (300 ,300);
		f. setLayout ( null );
		f. setVisible ( true );
	}

}