public abstract class TextDecorator extends Text{
	protected Text component;

	public TextDecorator(Text component){
		this.component = component;
	}
}