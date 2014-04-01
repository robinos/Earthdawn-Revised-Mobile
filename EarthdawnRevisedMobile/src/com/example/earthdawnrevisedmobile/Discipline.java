package com.example.earthdawnrevisedmobile;


import java.util.ArrayList;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Element;

/**
 * 
 * @author Robin
 *
 */
@Root
public class Discipline
{
	@Element(name="disciplineName")
	private String sDisciplineName;
	@Element(name="disciplineDescription")
	private String sDisciplineDescription;	
	@Element(name="karmaRitual")
	private String sKarmaRitual;
	@Element(name="halfMagic")
	private String sHalfMagic;
	@Element(name="importantAttributes")
	private String sImportantAttributes;
	@Element(name="commonArtisanSkills")
	private String sCommonArtisanSkills;
	@ElementList(name="disciplineTalents", required=false)
    private ArrayList<ListByCircle> alDisciplineTalents;
	@ElementList(name="optionalTalents", required=false)
    private ArrayList<ListByCircle> alOptionalTalents;	
	@ElementList(name="abilities", required=false)
	private ArrayList<ListByCircle> alAbilities;
	@ElementList(name="spells", required=false)
	private ArrayList<ListByCircle> alSpells;	  
	
	//Accessor methods
    /**
     * 
     * @return
     */
    public String getDisciplineName()
    {
    	return sDisciplineName;
    }	

    /**
     * 
     * @return
     */
    public String getDisciplineDescription()
    {
    	return sDisciplineDescription;
    }    
    
    /**
     * 
     * @return
     */
    public String getKarmaRitual()
    {
    	return sKarmaRitual;
    }    
 
    /**
     * 
     * @return
     */
    public String getHalfMagic()
    {
    	return sHalfMagic;
    }    
    
    /**
     * 
     * @return
     */
    public String getImportantAttributes()
    {
    	return sImportantAttributes;
    }     
 
    /**
     * 
     * @return
     */
    public String getCommonArtisanSkills()
    {
    	return sCommonArtisanSkills;
    }        
    
    /**
     * 
     * @return
     */
    public ArrayList<ListByCircle> getDisciplineTalents()
    {
    	if(alDisciplineTalents == null) alDisciplineTalents = new ArrayList<ListByCircle>();
    	return alDisciplineTalents;
    }
    
    /**
     * 
     * @return
     */
    public ArrayList<ListByCircle> getOptionalTalents()
    {
    	if(alOptionalTalents == null) alOptionalTalents = new ArrayList<ListByCircle>();
    	return alOptionalTalents;
    }
    
    /**
     * 
     * @return
     */
    public ArrayList<ListByCircle> getAbilities()
    {
    	if(alAbilities == null) alAbilities = new ArrayList<ListByCircle>();
    	return alAbilities;
    }        
    
	//Manipulator methods    
    /**
     * 
     * @return
     */   
    public void setDisciplineName(String sDisciplineName)
    {
    	this.sDisciplineName = sDisciplineName;
    }	

    /**
     * 
     * @return
     */    
    public void setDisciplineDescription(String sDisciplineDescription)
    {
    	this.sDisciplineDescription = sDisciplineDescription;
    }    
    
    /**
     * 
     * @return
     */    
    public void setKarmaRitual(String sKarmaRitual)
    {
    	this.sKarmaRitual = sKarmaRitual;
    }    
 
    /**
     * 
     * @return
     */    
    public void setHalfMagic(String sHalfMagic)
    {
    	this.sHalfMagic = sHalfMagic;
    }    
    
    /**
     * 
     * @return
     */    
    public void setImportantAttributes(String sImportantAttributes)
    {
    	this.sImportantAttributes = sImportantAttributes;
    }     
 
    /**
     * 
     * @return
     */    
    public void setCommonArtisanSkills(String sCommonArtisanSkills)
    {
    	this.sCommonArtisanSkills = sCommonArtisanSkills;
    }    
       
    /**
     * 
     * @return
     */   
    public void setDisciplineTalents(ArrayList<ListByCircle> alDisciplineTalents)
    {
    	this.alDisciplineTalents = alDisciplineTalents;
    	
    	if(alDisciplineTalents == null) alDisciplineTalents = new ArrayList<ListByCircle>();    	
    }
    
    /**
     * 
     * @return
     */    
    public void setOptionalTalents(ArrayList<ListByCircle> alOptionalTalents)
    {
    	this.alOptionalTalents = alOptionalTalents;
    	
    	if(alOptionalTalents == null) alOptionalTalents = new ArrayList<ListByCircle>(); 
    }
    
    /**
     * 
     * @return
     */    
    public void setAbilities(ArrayList<ListByCircle> alAbilities)
    {
    	this.alAbilities = alAbilities;
    	
    	if(alAbilities == null) alAbilities = new ArrayList<ListByCircle>();   	
    }
    
    /**
     * 
     * @return
     */   
    public void setSpells(ArrayList<ListByCircle> alSpells)
    {
    	this.alSpells = alSpells;
    	
    	if(alSpells == null) alSpells = new ArrayList<ListByCircle>();       	
    }        
    
    /**
     * 
     */
	public String toString()
	{
		StringBuffer sbBuffer = new StringBuffer(100);
		
		sbBuffer.append(sDisciplineName+": ");			
		sbBuffer.append(sDisciplineDescription+", ");	

		sbBuffer.append(sImportantAttributes + ", " + sCommonArtisanSkills + ", ");
		sbBuffer.append(sKarmaRitual + ", " + sHalfMagic + ", ");	
			
		sbBuffer.append(" Discipline Talents: ");		

		if(alDisciplineTalents != null) {
			
		    for(ListByCircle alCircle : alDisciplineTalents) 
		    {			    	
		    	sbBuffer.append("Circle: "+ alCircle.getCircle() + " ");
		    	ArrayList<String> alTalents = alCircle.getAbilityNames();
		    	
		    	if(alTalents != null) {
				    for(String sAbilities : alTalents) {
				    	sbBuffer.append(sAbilities + ", ");			    	
				    }
		    	}
			}
	    }
		else {
		    sbBuffer.append(" None ");
		}		

		
		sbBuffer.append(" Optional Talents: ");		
		
		if(alOptionalTalents != null) {
			
		    for(ListByCircle alCircle : alOptionalTalents) 
		    {			    	
		    	sbBuffer.append("Circle: "+ alCircle.getCircle() + " ");
		    	ArrayList<String> alTalents = alCircle.getAbilityNames();
		    	
		    	if(alTalents != null) {
				    for(String sAbilities : alTalents) {
				    	sbBuffer.append(sAbilities + ", ");			    	
				    }
		    	}
			}
	    }
		else {
		    sbBuffer.append(" None ");
		}   

		sbBuffer.append(" Abilities: ");			
		
		if(alAbilities != null) {
			
		    for(ListByCircle alCircle : alAbilities) 
		    {			    	
		    	sbBuffer.append("Circle: "+ alCircle.getCircle() + " ");
		    	ArrayList<String> alTalents = alCircle.getAbilityNames();
		    	
		    	if(alTalents != null) {
				    for(String sAbilities : alTalents) {
				    	sbBuffer.append(sAbilities + ", ");			    	
				    }
		    	}
			}
	    }
		else {
		    sbBuffer.append(" None ");
		}
		
		
		sbBuffer.append(" Spells: ");	
		
		if(alSpells != null) {
			
		    for(ListByCircle alCircle : alSpells) 
		    {			    	
		    	sbBuffer.append("Circle: "+ alCircle.getCircle() + " ");
		    	ArrayList<String> alTalents = alCircle.getAbilityNames();
		    	
		    	if(alTalents != null) {
				    for(String sAbilities : alTalents) {
				    	sbBuffer.append(sAbilities + ", ");			    	
				    }
		    	}
			}
	    }
		else {
		    sbBuffer.append(" None ");
		}				
		
		return sbBuffer.toString();
	}    
}
