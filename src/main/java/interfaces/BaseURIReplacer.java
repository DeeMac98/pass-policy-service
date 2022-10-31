package interfaces;

public interface BaseURIReplacer {
	
	// void return type must be changed to multi-value return containing String & Boolean
	// (String input, Boolean didReplace)
	public void PublicWithPrivate(String input);
	public void PrivateWithPublic(String input);

}
