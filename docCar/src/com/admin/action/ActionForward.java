package com.admin.action;

public class ActionForward {
	private boolean isRedirect;
	private String path;
	
	public ActionForward() {
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
