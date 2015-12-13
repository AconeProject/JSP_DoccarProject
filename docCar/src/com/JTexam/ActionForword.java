package com.JTexam;

public class ActionForword {
	private boolean isRedirect;
	private String path;
	
	public ActionForword() {
		this.isRedirect = false;
	}

	
	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
