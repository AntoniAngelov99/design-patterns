import java.awt.Color;

public class IdleGreenState extends State {

	@Override
	public void handlePush(Context c) {
		c.setState(new EatingRedState());
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return (Color.green);
	}

	@Override
	public void handlePull(Context b) {
		b.setState(new EatingRedState());
	}
}
