import java.awt.Color;

public class EatingRedState extends State {

	@Override
	public void handlePush(Context c) {
		c.setState(new SleepingBlueState());

	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return (Color.red);
	}

	@Override
	public void handlePull(Context b) {
		b.setState(new SleepingBlueState());
	}

}
