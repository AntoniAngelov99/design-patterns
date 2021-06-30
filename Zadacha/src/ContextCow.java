public class ContextCow  {
	private State stateCow = null;
	
	public ContextCow (State stateCow) {
		this.stateCow= stateCow;
	}
	public ContextCow () {
		this(new IdleGreenState());
		
}
	
	public State getState() {
		return stateCow;
	}
	
	public void setState(State stateCow) {
		this.stateCow= stateCow;
	}
	

	
	public void changeCowState() {
		stateCow.handleChangeCowState(this);
	}
}

