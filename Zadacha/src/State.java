import java.awt.Color;

public abstract class State {

	public abstract void handleChangeHorseState(ContextHorse c);
	public abstract void handleChangeCowState(ContextCow b);
	public abstract Color getColor();
}
