import java.awt.Color;

public class SleepingBlueState extends State {

	@Override
	public void handlePush(Context c) {
		c.setState(new IdleGreenState());
	}

	@Override
	public Color getColor() {
		return (Color.blue);
	}

	@Override
	public void handlePull(Context b) {
		b.setState(new IdleGreenState());
	}
}
