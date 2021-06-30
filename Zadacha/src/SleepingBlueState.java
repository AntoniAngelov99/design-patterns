import java.awt.Color;

public class SleepingBlueState extends State {

	@Override
	public void handleChangeHorseState(ContextHorse c) {
		c.setState(new IdleGreenState());
	}

	@Override
	public Color getColor() {
		return (Color.blue);
	}

	@Override
	public void handleChangeCowState(ContextCow b) {
		b.setState(new IdleGreenState());
	}
}
