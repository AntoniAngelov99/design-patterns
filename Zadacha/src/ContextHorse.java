import java.awt.Color;

public class ContextHorse  {
	private State state = null;
	
	public ContextHorse (State state) {
		this.state= state;
	}
	public ContextHorse () {
		this(new IdleGreenState());
		
}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state= state;
	}
	
	public void changeHorseState () {
		state.handleChangeHorseState(this);
	}
}
