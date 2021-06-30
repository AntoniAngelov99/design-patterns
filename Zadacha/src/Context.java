import java.awt.Color;

public class Context {
	private State state = null;
	
	public Context (State state) {
		this.state= state;
	}
	public Context () {
		this(new IdleGreenState());
		
}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state= state;
	}
	
	public void push () {
		state.handlePush(this);
	}
	
	public void pull() {
		state.handlePull(this);
	}
}

