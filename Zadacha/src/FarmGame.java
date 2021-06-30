import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FarmGame extends Frame implements ActionListener{

	private Button changeHorseButton = new Button ("Change Horse");
	private Button changeCowButton = new Button ("Change Cow");
	private Button exitButton = new Button("Exit");
	private Canvas canvas = new Canvas();
	private Canvas canvasCow = new Canvas();
	private Panel toolbox = new Panel();
	
	private ContextHorse contextHorse = null;
	private ContextCow  contextCow = null;
	public FarmGame() {
		super("Ферма");
		contextHorse = new ContextHorse();
		contextCow= new ContextCow();
		setupWindow();
		
	}	private void setupWindow() {
	
		setSize(600,600);
		
		setLayout(new BorderLayout());
		canvas.setSize(300,300);
		canvasCow.setSize(300,300);
		add(canvas,BorderLayout.EAST);
		add(canvasCow, BorderLayout.WEST);
		canvas.setBackground(contextHorse.getState().getColor());
		canvasCow.setBackground(contextCow.getState().getColor());
		toolbox.setLayout(new GridBagLayout());
		add(toolbox,BorderLayout.SOUTH);
		toolbox.add(changeHorseButton);
		toolbox.add(changeCowButton);
		toolbox.add(exitButton);
		
		changeCowButton.addActionListener(this);
		changeHorseButton.addActionListener(this);
		exitButton.addActionListener(this);
		}
	
@Override
        public void actionPerformed(ActionEvent e) {
	  Object src = e.getSource();
	  if(src == changeHorseButton) {
		  contextHorse.changeHorseState();
		  canvas.setBackground(contextHorse.getState().getColor());
		  if (contextHorse.getState().getColor() == Color.green) {
			  System.out.println("Horse has eaten");
		  }
	  }else if (src == changeCowButton) {
		  contextCow.changeCowState();
		  canvasCow.setBackground(contextCow.getState().getColor());
	  }
	  else if (src== exitButton ) {
		  System.exit(0);
	  }
}

	public static void main(String[] args) {
		FarmGame gui = new FarmGame();
		gui.setVisible(true);
}
}
