public class ReplaceDecorator extends TextDecorator{

	private String replaced, placeholder;

	public ReplaceDecorator(Text component, String replaced, String placeholder){
		super(component);
		this.replaced = replaced;
		this.placeholder = placeholder;

	}

	public ReplaceDecorator(Text component, String replaced){
		this(component, replaced, "");

	}

	public String get(){
		return this.component.get()
			.replace(replaced, placeholder);
	}
}