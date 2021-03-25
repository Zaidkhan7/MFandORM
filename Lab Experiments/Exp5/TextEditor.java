package SpringZaid;

public class TextEditor {

	private SpellChecker sc;
	TextEditor(SpellChecker sc)
	{
		this.sc=sc;
	}
	public void show()
	{
		sc.display();
	}
}
