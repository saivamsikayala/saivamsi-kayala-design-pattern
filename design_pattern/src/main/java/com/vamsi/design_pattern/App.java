package com.vamsi.design_pattern;
import AdapterPattern.*;
import BridgePattern.*;
import CommandPattern.*;
import PrototypePattern.*;
import TemplatePattern.*;
import SingletonPattern.*;


public class App{
	@SuppressWarnings("unused")
	public static void main( String[] args ){
        DriverAdapter adapter_pat = new DriverAdapter();
        DriverBridge bridge_pat = new DriverBridge();
        DriverCommand command_pat = new DriverCommand();
        DriverPrototype protoype_pat = new DriverPrototype();
        DriverSingleton singleton_pat = new DriverSingleton();
        DriverTemplate template_pat = new DriverTemplate();
        
    }
}
