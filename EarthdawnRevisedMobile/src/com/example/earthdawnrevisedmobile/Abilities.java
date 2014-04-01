package com.example.earthdawnrevisedmobile;


import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * The Abilities class is a model for holding an ability type name and an array list of
 * Ability objects.
 * 
 * @author : Robin Osborne
 */
@Root
public class Abilities
{	
	@Element(name="abilityType")
	private String sAbilityType;
	@ElementList(name="abilities")
    private ArrayList<Ability> alAbilities;    
    
	/**
	 * Constructor.
	 */
	public Abilities() {
		super();
	}
	
    /**
     * 
     * @return
     */
    public String getAbilityType()
    {
    	return sAbilityType;
    }    
    
    /**
     * 
     * @return
     */
    public ArrayList<Ability> getAbilities()
    {
    	if(alAbilities == null) alAbilities = new ArrayList<Ability>();
    	return alAbilities;
    }      
    
    /**
     * 
     * @param sAbilityType
     */
    public void setAbilityType(String sAbilityType)
    {
    	this.sAbilityType = sAbilityType;
    }     
    
    /**
     * 
     * @param alAbilities
     */
    public void setAbilities(ArrayList<Ability> alAbilities)
    {
    	this.alAbilities = alAbilities;
    }    
    
    /**
     * 
     * @param abAbility
     * @param bAdd
     */
    public void adjustAbilities(Ability abAbility, boolean bAdd)
    {
    	if(alAbilities == null) alAbilities = new ArrayList<Ability>();
    	
    	if(abAbility != null) {
	    	if(bAdd) alAbilities.add(abAbility);
	    	else {
	    		if(alAbilities.contains(abAbility)) alAbilities.remove(abAbility);
	    	}
    	}
    }
    
    /**
     * 
     * @param abAbilities
     * @param bAdd
     */
    public void adjustAbilities(Abilities abAbilities, boolean bAdd)
    {
    	if(alAbilities == null) alAbilities = new ArrayList<Ability>();
    	
    	if(abAbilities != null) {    	
	    	if(bAdd) {
	    		alAbilities.addAll(abAbilities.getAbilities());
	    	}
	    	else {
	    		if(alAbilities.containsAll(abAbilities.getAbilities())) {
	    			alAbilities.removeAll(abAbilities.getAbilities());
	    		}
	    	}
    	}
    }        
    
    /**
     * 
     */
	public String toString()
	{
		StringBuffer sbBuffer = new StringBuffer(100);
		
		sbBuffer.append(sAbilityType+": ");
		
		if(alAbilities != null) {			
		    for(Ability abAbility : alAbilities) {			    	
				sbBuffer.append(abAbility.toString() + " ");			
		    }
		}
		else {
			sbBuffer.append("Empty. ");
		}
		return sbBuffer.toString();
	}
}
