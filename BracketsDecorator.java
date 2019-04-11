public class BracketsDecorator extends TextDecorator{

	public BracketsDecorator(Text component){
		super(component);
	}

	public String get(){
		return "{"+this.component.get()+"}";
	}

}