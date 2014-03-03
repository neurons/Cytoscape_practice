package org.cytoscape.sample;

import org.cytoscape.app.AbstractCyApp;
import org.cytoscape.app.CyAppAdapter;

public class HelloWorldApp extends AbstractCyApp{
	public HelloWorldApp(CyAppAdapter adapter){
		super(adapter);
		
		System.out.println("Hello Cytoscape 3!");
	}
}
