package com.example.earthdawnrevisedmobile;


import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/**
 * 
 * @author Robin
 *
 */
@Root
public class Ability
{
	//Instance variables
	@Element(name="type")
    private String sType = "";
	
	@Element(name="name")
    private String sName = "";
	
	@Element(name="rank", required=false)
    private int iRank = 0;
	
	@Element(name="actionType", required=false)
    private String sAction = "Standard";
	
	@Element(name="duration", required=false)
    private int iDuration = 0;
	
	@Element(name="durationType", required=false)
    private String sDurationType = "other";
	
	@Element(name="range", required=false)
    private int iRange = 0;
	
	@Element(name="rangeType", required=false)
    private String sRangeType = "self";
	
	@Element(name="stepAttribute", required=false)
    private String sStepAttr = "Tou";
	
	@Element(name="effectStep", required=false)
    private int iEffectStep = 0;
	
	@Element(name="effect", required=false)
    private String sEffect = "";
	
	@Element(name="strain", required=false)
	private int iStrainCost = 0;
	
	@Element(name="defaultUse", required=false)
	private String sDefault = "no";	
	
	@Element(name="karma", required=false)
	private String sKarma = "no";
	
	@ElementList(name="languages", required=false)
	private ArrayList<String> sLanguages;
	
	@Element(name="threads", required=false)
	private int iThreads = 0;
	
	@Element(name="weaveDifficulty", required=false)
	private int iWeaveDiff = 0;
	
	@Element(name="reattuneDifficulty", required=false)
	private int iReattuneDiff = 0;
	
	@Element(name="castingDifficulty", required=false)
	private int iCastDiff = 0;
	
	@Element(name="subtype", required=false)
	private String sSubType = "None";	
	
	//Accessor methods
    /**
     * 
     * @return
     */
    public String getType()
    {
    	return sType;
    }	
	
    /**
     * 
     * @return
     */
    public String getName()
    {
    	return sName;
    }        
    
    /**
     * 
     * @return
     */
    public int getRank()
    {
    	return iRank;
    }    
    
    /**
     * 
     * @return
     */
    public String getActionType()
    {
    	return sAction;
    }
    
    /**
     * 
     * @return
     */
    public int getDuration()
    {
    	return iDuration;
    }
    
    /**
     * 
     * @return
     */
    public String getDurationType()
    {
    	return sDurationType;
    } 
    
    /**
     * 
     * @return
     */
    public int getRange()
    {
    	return iRange;
    }
    
    /**
     * 
     * @return
     */
    public String getRangeType()
    {
    	return sRangeType;
    }    
    
    /**
     * 
     * @return
     */
    public String getStepAttribute()
    {
    	return sStepAttr;
    }    
    
    /**
     * 
     * @return
     */
    public int getEffectStep()
    {
    	return iEffectStep;
    }     
    
    /**
     * 
     * @return
     */
    public String getEffect()
    {
    	return sEffect;
    }	
	
    /**
     * 
     * @return
     */
    public int getStrain()
    {
    	return iStrainCost;
    }
    
    /**
     * 
     * @return
     */
    public String getDefaultUse()
    {
    	return sDefault;
    }    
    
    /**
     * 
     * @return
     */
    public ArrayList<String> getLanguages()
    {
    	if(sLanguages == null) sLanguages = new ArrayList<String>();    	
    	return sLanguages;
    }    
    
    /**
     * 
     * @return
     */
    public String getKarma()
    {
    	return sKarma;
    }
    
    /**
     * 
     * @return
     */
    public int getThreads()
    {
    	return iThreads;
    } 	
	
    /**
     * 
     * @return
     */
    public int getWeaveDifficulty()
    {
    	return iWeaveDiff;
    }
    
    /**
     * 
     * @return
     */
    public int getReattuneDifficulty()
    {
    	return iReattuneDiff;
    }
    
    /**
     * 
     * @return
     */
    public int getCastingDifficulty()
    {
    	return iCastDiff;
    }    
    
    /**
     * 
     * @return
     */
    public String getSubtype()
    {
    	return sSubType;
    }    
    
    //Manipulator methods   
    /**
     * 
     * @param sType
     */
    public void setType(String sType)
    {
    	this.sType = sType;
    }    
    
    /**
     * 
     * @param sName
     */
    public void setName(String sName)
    {
    	this.sName = sName;
    }             
    
    /**
     * 
     * @param iAbilityRank
     */
    public void setRank(int iRank)
    {
    	this.iRank = iRank;
    }    
    
    /**
     * 
     * @param iAbilityAction
     */
    public void setActionType(String sAction)
    {
    	this.sAction = sAction;
    }
    
    /**
     * 
     * @param iDuration
     */
    public void setDuration(int iDuration)
    {
    	this.iDuration = iDuration;
    }
    
    /**
     * 
     * @param iDurationType
     */
    public void setDurationType(String sDurationType)
    {
    	this.sDurationType = sDurationType;
    } 
    
    /**
     * 
     * @param iRange
     */
    public void setRange(int iRange)
    {
    	this.iRange = iRange;
    }
    
    /**
     * 
     * @param sRangeType
     */
    public void setRangeType(String sRangeType)
    {
    	this.sRangeType = sRangeType;
    }    
    
    /**
     * 
     * @param sStepAttr
     */
    public void setStepAttribute(String sStepAttr)
    {
    	this.sStepAttr = sStepAttr;
    }     
    
    /**
     * 
     * @param iEffectStep
     */
    public void setEffectStep(int iEffectStep)
    {
    	this.iEffectStep = iEffectStep;
    }     
    
    /**
     * 
     * @param sEffect
     */
    public void setEffect(String sEffect)
    {
    	this.sEffect = sEffect;
    }  
    
    /**
     * 
     * @param iStrainCost
     */
    public void setStrain(int iStrainCost)
    {
    	this.iStrainCost = iStrainCost;
    }   
    
    /**
     * 
     * @param sDefault
     */
    public void setDefaultUse(String sDefault)
    {
    	this.sDefault = sDefault;
    }    
    
    /**
     * 
     * @param iAbilityRank
     */
    public void setLanguages(ArrayList<String> sLanguages)
    {
    	this.sLanguages = sLanguages;
    }    
    
    /**
     * 
     * @param iKarmaCost
     */
    public void setKarma(String sKarma)
    {
    	this.sKarma = sKarma;
    }
    
    /**
     * 
     * @param sLanguage
     * @param bAdd
     */
    public void adjustLanguages(String sLanguage, boolean bAdd)
    {
    	if(sLanguages == null) sLanguages = new ArrayList<String>();
    	if(bAdd) sLanguages.add(sLanguage);
    	else {
    		if(sLanguages.contains(sLanguage)) sLanguages.remove(sLanguage);
    	}
    }     
    
    /**
     * 
     * @param iThreads
     */
    public void setThreads(int iThreads)
    {
    	this.iThreads = iThreads;
    }    
   
    /**
     * 
     * @param iWeaveDiff
     */
    public void setWeaveDifficulty(int iWeaveDiff)
    {
    	this.iWeaveDiff = iWeaveDiff;
    }  
    
    /**
     * 
     * @param iReattuneDiff
     */
    public void setReattuneDifficulty(int iReattuneDiff)
    {
    	this.iReattuneDiff = iReattuneDiff;
    }  
    
    /**
     * 
     * @param iCastDiff
     */
    public void setCastingDifficulty(int iCastDiff)
    {
    	this.iCastDiff = iCastDiff;
    }      
    
    /**
     * 
     * @param sSubType
     */
    public void setSubtype(String sSubType)
    {
    	this.sSubType = sSubType;
    }    
    
    /**
     * 
     * @return
     */
	public Spanned toHtmlString()
	{
		SpannableStringBuilder sbBuilder = new SpannableStringBuilder();
		
		sbBuilder.append(Html.fromHtml("<h5><u>" + sName
				+ "</u></h5>Action: " + sAction + "<br />"));				
				
		if(sType.equals("Spell")) {
			sbBuilder.append(Html.fromHtml("Threads: "+iThreads+"<br />Weaving Difficulty: "
		            +iWeaveDiff+"<br />Reattuning Difficulty: "+iReattuneDiff
		            +"<br />Casting Difficulty: "+iCastDiff+"<br />Subtype: "
		            +sSubType+"<br /><br />"));			
		}
		else if (sType.equals("Skill") || sType.equals("Talent")) {
			sbBuilder.append(Html.fromHtml("Strain cost: "+iStrainCost+"<br />"));
			
			if(sType.equals("Skill")) {
				sbBuilder.append(Html.fromHtml("Default Use: "+sDefault+"<br /><br />")); 				
			}
			if(sType.equals("Talent")) {
				sbBuilder.append(Html.fromHtml("Karma: "+sKarma+"<br /><br />")); 
			}
					
			
			if(sLanguages != null) {
				sbBuilder.append(Html.fromHtml("<br />Languages:<br />"));				
			    for(String sLanguage : sLanguages) {			    	
			    	sbBuilder.append(Html.fromHtml(sLanguage.toString() + "<br />"));			
			    }
			}		
		}
		
		sbBuilder.append(Html.fromHtml("Duration: "));
		if(iDuration > 0) sbBuilder.append(Html.fromHtml(iDuration + " "));
		sbBuilder.append(Html.fromHtml(sDurationType + "<br />"));

		sbBuilder.append(Html.fromHtml("Range: "));		
		if(iRange > 0) sbBuilder.append(Html.fromHtml(iRange + " "));
		sbBuilder.append(Html.fromHtml(sRangeType + "<br /><br />"));
		
		sbBuilder.append(Html.fromHtml(sEffect + "<br /><br />"));	
		
		return sbBuilder;
	}    
    
	public String toString()
	{
		StringBuffer sbBuffer = new StringBuffer(100);
		
		//sbBuffer.append(sType+": ");			
		
		sbBuffer.append("\n" +sName + "\n\nAction: " + sAction + "\n");	
		
		if(sType.equals("Spell")) {
			sbBuffer.append("Threads: "+iThreads+"\nWeaving Difficulty: "+iWeaveDiff+
					"\nReattuning Difficulty: "+iReattuneDiff+"\nCasting Difficulty: "
					+iCastDiff+"\nSubtype: "+sSubType+"\n\n");			
		}
		else if (sType.equals("Skill") || sType.equals("Talent")) {
			sbBuffer.append("Strain cost: "+iStrainCost+"\n");
			
			if(sType.equals("Skill")) {
				sbBuffer.append("Default Use: "+sDefault+"\n\n"); 				
			}
			if(sType.equals("Talent")) {
				sbBuffer.append("Karma: "+sKarma+"\n\n"); 
			}
					
			
			if(sLanguages != null) {
				sbBuffer.append("\nLanguages:\n");				
			    for(String sLanguage : sLanguages) {			    	
					sbBuffer.append(sLanguage.toString() + "\n");			
			    }
			}
			//else {
			//	sbBuffer.append(" None \n");
			//}			
		}
		
		sbBuffer.append("Duration: ");
		if(iDuration > 0) sbBuffer.append(iDuration + " ");
		sbBuffer.append(sDurationType + "\n");

		sbBuffer.append("Range: ");		
		if(iRange > 0) sbBuffer.append(iRange + " ");
		sbBuffer.append(sRangeType + "\n\n");
		
		sbBuffer.append(sEffect + "\n\n");	
		
		return sbBuffer.toString();
	}	
}