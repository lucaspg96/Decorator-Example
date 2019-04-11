public class ParentesisDecorator extends TextDecorator{

	public ParentesisDecorator(Text component){
		super(component);
	}

	public String get(){
		return "("+this.component.get()+")";
	}

}