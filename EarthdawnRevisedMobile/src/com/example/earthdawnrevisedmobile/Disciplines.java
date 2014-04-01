package com.example.earthdawnrevisedmobile;


import java.util.ArrayList;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * 
 * @author Robin
 *
 */
@Root
public class Disciplines
{
	@ElementList(name="disciplines")
    private ArrayList<Discipline> alDisciplines;
    
    /**
     * 
     * @return
     */
    public ArrayList<Discipline> getDisciplines()
    {
    	if(alDisciplines == null) alDisciplines = new ArrayList<Discipline>();
    	return alDisciplines;
    }    
    
    /**
     * 
     * @param alDisciplines
     */
    public void setDisciplines(ArrayList<Discipline> alDisciplines)
    {
    	this.alDisciplines = alDisciplines;
    }
    
    /**
     * 
     * @param diDiscipline
     * @param bAdd
     */
    public void adjustDisciplines(Discipline diDiscipline, boolean bAdd)
    {
    	if(alDisciplines == null) alDisciplines = new ArrayList<Discipline>();
    	if(bAdd) alDisciplines.add(diDiscipline);
    	else {
    		if(alDisciplines.contains(diDiscipline)) alDisciplines.remove(diDiscipline);
    	}
    }
    
    /**
     * 
     */
	public String toString()
	{
		StringBuffer sbBuffer = new StringBuffer(100);
		
		sbBuffer.append("Disciplines: ");
		
		if(alDisciplines != null) {
		    for(Discipline diDiscipline : alDisciplines) {			    	
				sbBuffer.append(diDiscipline.toString() + " ");			
		    }
		}
		else {
			sbBuffer.append("Empty.");
		}
		return sbBuffer.toString();
	}
}
