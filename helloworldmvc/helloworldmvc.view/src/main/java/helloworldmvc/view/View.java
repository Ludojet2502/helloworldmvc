package helloworldmvc.view;

import helloworldmvc.Contract.IView;

public class View implements IView {
	View(){
		
	}
	
	public void displayMessage(String message) {
		System.out.println(message);
	}
	
	
	

}
