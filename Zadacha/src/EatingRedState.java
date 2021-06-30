import java.awt.Color;

public class EatingRedState extends State {

	@Override
	public void handleChangeHorseState(ContextHorse c) {
		c.setState(new SleepingBlueState());

	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return (Color.red);
	}

	@Override
	public void handleChangeCowState(ContextCow b) {
		b.setState(new SleepingBlueState());
	}

}
