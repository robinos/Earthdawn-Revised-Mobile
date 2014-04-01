package com.example.earthdawnrevisedmobile;
import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * 
 * @author Robin
 *
 */
@Root
public class ListByCircle
{
	@Element(name="circle", required=false)
    private int iCircle;
	@ElementList(name="abilityNames", required=false)	
    private ArrayList<String> alAbilities;
    
	//Accessor methods
    /**
     * 
     * @return
     */
    public int getCircle()
    {
    	return iCircle;
    }
    
    /**
     * 
     * @return
     */
    public ArrayList<String> getAbilityNames()
    {
    	if(alAbilities == null) alAbilities = new ArrayList<String>();    	
    	return alAbilities;
    }
    
    /**
     * 
     * @return
     */  
    public void setCircle(int iCircle)
    {
    	this.iCircle = iCircle;
    }    
    
    /**
     * 
     * @return
     */  
    public void setAbilityNames(ArrayList<String> alAbilities)
    {
    	this.alAbilities = alAbilities;
    }
    
    /**
     * 
     */
	public String toString()
	{
		StringBuffer sbBuffer = new StringBuffer(100);
		
		sbBuffer.append("By circle: "+iCircle+": ");
		
		if(alAbilities != null) {			
		    for(String sAbility : alAbilities) {			    	
				sbBuffer.append(sAbility.toString() + ", ");			
		    }
		}
		else {
			sbBuffer.append("Empty. ");
		}
		return sbBuffer.toString();
	}    
}
