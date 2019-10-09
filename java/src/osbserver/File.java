package osbserver;

public class File {

	public File(String path) {
		this.path = path;
		this.name = path.substring(path.lastIndexOf("/"));
		this.path = path.substring(0, path.lastIndexOf("/"));
		this.open = true;
	}
	public boolean open;
	public String name;
	public String path;
}
