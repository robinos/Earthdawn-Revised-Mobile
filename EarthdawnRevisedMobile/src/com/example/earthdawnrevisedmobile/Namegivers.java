package com.example.earthdawnrevisedmobile;


import java.util.ArrayList;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.ElementList;

/**
 * 
 * @author Robin
 *
 */
@Root
public class Namegivers
{
	@ElementList(name="namegivers")
    private ArrayList<Race> alNamegivers;    
    
    /**
     * 
     * @return
     */
    public ArrayList<Race> getNamegivers()
    {
    	if(alNamegivers == null) alNamegivers = new ArrayList<Race>();
    	return alNamegivers;
    }     
    
    /**
     * 
     * @param alNamegivers
     */
    public void setNamegivers(ArrayList<Race> alNamegivers)
    {
    	this.alNamegivers = alNamegivers;
    }
    
    /**
     * 
     * @param raRace
     * @param bAdd
     */
    public void adjustNamegivers(Race raRace, boolean bAdd)
    {
    	if(alNamegivers == null) alNamegivers = new ArrayList<Race>();
    	if(bAdd) alNamegivers.add(raRace);
    	else {
    		if(alNamegivers.contains(raRace)) alNamegivers.remove(raRace);
    	}
    }
    
    /**
     * 
     */
	public String toString()
	{
		StringBuffer sbBuffer = new StringBuffer(100);
		
		sbBuffer.append("Namegivers: ");
		
		if(alNamegivers != null) {
		    for(Race raRace : alNamegivers) {			    	
				sbBuffer.append(raRace.toString() + " ");			
		    }
		}
		else {
			sbBuffer.append("Empty.");
		}
		return sbBuffer.toString();
	}
}
