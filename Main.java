public class Main{
	public static void main(String[] args) {
		Text text = new SimpleText("SHAZAM!");

		System.out.println(text.get());

		Text decoratedText = 
			new ParentesisDecorator(text);

		System.out.println(decoratedText.get());

		Text moreDecoratedText = 
			new ParentesisDecorator(decoratedText);

		System.out.println(moreDecoratedText.get());

		Text evenMoreDecoratedText = 
			new BracketsDecorator(moreDecoratedText);

		System.out.println(evenMoreDecoratedText.get());

		Text ultimateDecoratedText = 
			new ReplaceDecorator(evenMoreDecoratedText,"A");

		System.out.println(ultimateDecoratedText.get());
	}
}