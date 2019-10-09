package osbserver;

public class Editor {
	
	private EventManager eventMan;
	private File file;
	
	public Editor(EventManager eventMan) {
		this.eventMan = eventMan;
	}
	
	public void openFile(String path) {
		this.file = new File(path);
		this.eventMan.notify("open", path);
	}
	
	public void saveFile(String path) {
		this.eventMan.notify("save", path);
	}

}
