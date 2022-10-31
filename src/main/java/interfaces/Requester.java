package interfaces;

import javax.servlet.http.HttpServletRequest;

public interface Requester {
	
	// void return type should be multi-value return
	// (http.response, error)
	public void Do(HttpServletRequest request);

}
