import java.awt.Color;

public class IdleGreenState extends State {

	@Override
	public void handleChangeHorseState(ContextHorse c) {
		c.setState(new EatingRedState());
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return (Color.green);
	}

	@Override
	public void handleChangeCowState(ContextCow b) {
		b.setState(new EatingRedState());
	}
}
