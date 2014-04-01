package com.example.earthdawnrevisedmobile;

import java.io.File;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import android.util.Log;

/**
 * 
 * @author Robin
 *
 */
public class XmlHandler
{
	private Serializer serializer;
	private Resources rResources;
	//private File fiNamegiversFile;
	private File fiDisciplinesFile;
	
	/**
	 * Constructor
	 */
	public XmlHandler(Resources rResources)
	{	    
		serializer = new Persister();
		this.rResources = rResources;
		//File sdcardFile = new File("/sdcard/levelout.xml");
		fiDisciplinesFile = new File("disciplines.xml");
	}
		
	
	//Reading methods
	
	/**
	 * The readNamegiversXml method
	 * 
	 * @return: a Namegivers object
	 */
	public Namegivers readNamegiversXml()
	{	
		Namegivers naNamegivers = null;
		
        try {
    		naNamegivers = serializer.read(Namegivers.class, rResources.openRawResource(R.raw.namegivers));
   
    		
    		/*if(naNamegivers != null) {
	    		for(Race raRace : naNamegivers.getNamegivers()) {
	    		    Log.i("In the file"," "+raRace.toString());	
	    		}
    		}*/   
    		
		} catch (NotFoundException e) {
			Log.i("Not found","Sucks");
			e.printStackTrace();
		} catch (Exception e) {
			Log.i("Exception","Huh");
			e.printStackTrace();
		}
        
		return naNamegivers;
	}
	
	/**
	 * The readDisciplinesXml method
	 * 
	 * @return: a Disciplines object
	 */
	public Disciplines readDisciplinesXml()
	{	
		Disciplines diDisciplines = null;
		
        try {
        	diDisciplines = serializer.read(Disciplines.class, fiDisciplinesFile);
        	
    		if(diDisciplines != null) {
	    		for(Discipline diDiscipline : diDisciplines.getDisciplines()) {
	    		    System.out.println(diDiscipline.toString());	
	    		}
    		} 
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
        
		return diDisciplines;
	}	
	
	
	//Writing methods
	
	/**
	 * The writeNamegiversXml method
	 * 
	 * @param: a Namegivers object
	 *
	public void writeNamegiversXml(Namegivers naNamegivers, Resources rResources)
	{			
		if(naNamegivers != null) {
	        try {
	    		serializer.write(naNamegivers, rResources.openRawResource(R.raw.namegivers));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		 
	}*/		
	
}