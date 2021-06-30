import java.awt.Color;

public abstract class State {

	public abstract void handlePush(Context c);
	public abstract void handlePull(Context b);
	public abstract Color getColor();
}
