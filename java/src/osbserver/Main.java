package osbserver;

public class Main {

	public static void main(String[] args) {
		EventManager eventMan = new EventManager();
		Editor editor = new Editor(eventMan);
		LogListener logLis = new LogListener(eventMan);
		editor.openFile("C:/users/elias/desktop/notes.txt");
		editor.openFile("C:/users/elias/desktop/notes.txt");		
		EventSubscriber emaiLis = new EmailListener(eventMan);
		editor.saveFile("C:/users/elias/desktop/notes.txt");
		editor.saveFile("C:/users/elias/desktop/notes.txt");
		eventMan.unsubscribe(logLis, "open");
		editor.openFile("C:/users/elias/desktop/notes.txt"); // should only show file opened 2 times

	}
}
