package com.example.earthdawnrevisedmobile;


import java.util.ArrayList;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/**
 * The Race class.
 * 
 * @author  : Robin Osborne
 * @version : 2013-06-28, v0.2
 */
@Root
public class Race
{
	//Instance variables
	@Element(name="raceName")
    private String sRName = "";
	@Element(name="dex")
    private int iDex = 10;
	@Element(name="str")
    private int iStr = 10;
	@Element(name="tou")
    private int iTou = 10;
	@Element(name="per")
    private int iPer = 10;
	@Element(name="wil")
    private int iWil = 10;
	@Element(name="cha")
    private int iCha = 10;
	@Element(name="karmaModifier")
    private int iKMod = 4;
	@Element(name="karmaStep")
    private int iKStep = 4;
	@Element(name="groundMovementRate")
    private int iGMRate = 10;
	@Element(name="flyingMovementRate", required=false)
    private int iFMRate = 0;
	@Element(name="averageWeight")
    private int iAvgWeight = 100;
	@Element(name="averageHeight")
    private float fAvgHeight = 5.0f;
	@Element(name="averageLifespan")
    private int iAvgLifespan = 75;
	@Element(name="ageOfMaturity")
    private int iAgeOfMaturity = 15;
	@Element(name="skinDescription")
    private String sSkinDesc = "";
	@Element(name="hairDescription")
    private String sHairDesc = "";
	@Element(name="eyeDescription")
    private String sEyeDesc = "";
	@Element(name="miscDescription")
    private String sMiscDesc = "";
	@Element(name="racialInfo")
    private String sRInfo = "";
	@ElementList(name="racialAbilities")
    private ArrayList<Ability> alRAbilities;
    
	/**
	 * Constructor
	 */
	public Race() {
		super();
	}
    
	
    //Accesor methods
	
    /**
     * 
     * @return
     */
    public String getRaceName()
    {
    	return sRName;
    }
    
    /**
     * 
     * @return
     */
    public int getDex()
    {
    	return iDex;
    }
    
    /**
     * 
     * @return
     */
    public int getStr()
    {
    	return iStr;
    } 
    
    /**
     * 
     * @return
     */
    public int getTou()
    {
    	return iTou;
    }
    
    public int getPer()
    {
    	return iPer;
    }
    
    /**
     * 
     * @return
     */
    public int getWil()
    {
    	return iWil;
    }    
    
    public int getCha()
    {
    	return iCha;
    }
    
    /**
     * 
     * @return
     */
    public int getKarmaModifier()
    {
    	return iKMod;
    }     
    
    /**
     * 
     * @return
     */
    public int getKarmaStep()
    {
    	return iKStep;
    }
    
    /**
     * 
     * @return
     */
    public int getGroundMovementRate()
    {
    	return iGMRate;
    }
    
    /**
     * 
     * @return
     */
    public int getFlyingMovementRate()
    {
    	return iFMRate;
    }
    
    /**
     * 
     * @return
     */
    public int getAverageWeight()
    {
    	return iAvgWeight;
    }
    
    /**
     * 
     * @return
     */
    public float getAverageHeight()
    {
    	return fAvgHeight;
    }
    
    /**
     * 
     * @return
     */
    public int getAverageLifespan()
    {
    	return iAvgLifespan;
    }
    
    /**
     * 
     * @return
     */
    public int getAgeOfMaturity()
    {
    	return iAgeOfMaturity;
    }
    
    /**
     * 
     * @return
     */
    public String getSkinDescription()
    {
    	return sSkinDesc;
    }
    
    /**
     * 
     * @return
     */
    public String getHairDescription()
    {
    	return sHairDesc;
    }
    
    /**
     * 
     * @return
     */
    public String getEyeDescription()
    {
    	return sEyeDesc;
    }
    
    /**
     * 
     * @return
     */
    public String getMiscDescription()
    {
    	return sMiscDesc;
    } 
    
    /**
     * 
     * @return
     */
    public String getRacialInfo()
    {
    	return sRInfo;
    }
    
    /**
     * 
     * @return
     */
    public ArrayList<Ability> getRacialAbilities()
    {
    	if(alRAbilities == null) alRAbilities = new ArrayList<Ability>();
    	return alRAbilities;
    }    
    
    
    //Manipulator methods
    
    /**
     * 
     * @param sRName
     */
    public void setRaceName(String sRName)
    {
    	this.sRName = sRName;
    }
    
    /**
     * 
     * @param iDex
     */
    public void setDex(int iDex)
    {
    	this.iDex = iDex;
    }
    
	/**
	 * 
	 * @param iStr
	 */
    public void setStr(int iStr)
    {
    	this.iStr = iStr;
    } 
    
	/**
	 * 
	 * @param iTou
	 */
    public void setTou(int iTou)
    {
        this.iTou = iTou;
    }
    
	/**
	 * 
	 * @param iPer
	 */
    public void setPer(int iPer)
    {
    	this.iPer = iPer;
    }
    
	/**
	 * 
	 * @param iWil
	 */
    public void setWil(int iWil)
    {
    	this.iWil = iWil;
    }    
    
	/**
	 * 
	 * @param iCha
	 */
    public void setCha(int iCha)
    {
    	this.iCha = iCha;
    }
    
    /**
     * 
     * @param iKMod
     */
    public void setKarmaModifier(int iKMod)
    {
    	this.iKMod = iKMod;
    }     
    
	/**
	 * 
	 * @param iKStep
	 */
    public void setKarmaStep(int iKStep)
    {
    	this.iKStep = iKStep;
    }
    
	/**
	 * 
	 * @param iGMRate
	 */
    public void setGroundMovementRate(int iGMRate)
    {
    	this.iGMRate = iGMRate;
    }
    
	/**
	 * 
	 * @param iFMRate
	 */
    public void setFlyingMovementRate(int iFMRate)
    {
    	this.iFMRate = iFMRate;
    }
    
	/**
	 * 
	 * @param iAvgWeight
	 */
    public void setAverageWeight(int iAvgWeight)
    {
    	this.iAvgWeight = iAvgWeight;
    }
    
	/**
	 * 
	 * @param fAvgHeight
	 */
    public void setAverageHeight(float fAvgHeight)
    {
    	this.fAvgHeight = fAvgHeight;
    }
    
	/**
	 * 
	 * @param iAvgLifespan
	 */
    public void setAverageLifespan(int iAvgLifespan)
    {
    	this.iAvgLifespan = iAvgLifespan;
    }
    
	/**
	 * 
	 * @param iAgeOfMaturity
	 */
    public void setAgeOfMaturity(int iAgeOfMaturity)
    {
    	this.iAgeOfMaturity = iAgeOfMaturity;
    }
    
	/**
	 * 
	 * @param sSkinDesc
	 */
    public void setSkinDescription(String sSkinDesc)
    {
    	this.sSkinDesc = sSkinDesc;
    }
    
	/**
	 * 
	 * @param sHairDesc
	 */
    public void setHairDescription(String sHairDesc)
    {
    	this.sHairDesc = sHairDesc;
    }
    
	/**
	 * 
	 * @param sEyeDesc
	 */
    public void setEyeDescription(String sEyeDesc)
    {
    	this.sEyeDesc = sEyeDesc;
    }
    
	/**
	 * 
	 * @param sMiscDesc
	 */
    public void setMiscDescription(String sMiscDesc)
    {
    	this.sMiscDesc = sMiscDesc;
    } 
    
	/**
	 * 
	 * @param sRInfo
	 */
    public void setRacialInfo(String sRInfo)
    {
    	this.sRInfo = sRInfo;
    }
    
	/**
	 * 
	 * @param alRAbility
	 */
    public void setRacialAbilities(ArrayList<Ability> alRAbilities)
    {
    	this.alRAbilities = alRAbilities;
    }
	
    /**
     * 
     * @param abAbility
     * @param bAdd
     */
    public void adjustRacialAbilities(Ability taTalent, boolean bAdd)
    {
    	if(alRAbilities == null) alRAbilities = new ArrayList<Ability>();
    	if(bAdd) alRAbilities.add(taTalent);
    	else {
    		if(alRAbilities.contains(taTalent)) alRAbilities.remove(taTalent);
    	}
    }	
	
    /**
     * 
     * @return
     */
	public Spanned toHtmlString()
	{
		SpannableStringBuilder sbBuilder = new SpannableStringBuilder();
		
		sbBuilder.append(Html.fromHtml("<h4><b><u>Race: " + sRName
				+ "</b></u></h4><br />Dex: " + iDex + "<br />Str: " + iStr
				+ "<br />Tou: " + iTou + "<br />Per: " + iPer + "<br />Wil: " + iWil + "<br />Cha: "
				+ iCha + "<br /><br />Karma Mod: " + iKMod + "<br />Karma Step: " + iKStep
				+ "<br /><br />Ground Movement (yrds): " + iGMRate + "<br />Flying Movement (yrds): "
				+ iFMRate + "<br /><br />Average Weight: " + iAvgWeight + "<br />Average Height: " + fAvgHeight				
				+ "<br />Average Lifespan: " + iAvgLifespan + "<br />Age of Maturity: " + iAgeOfMaturity
				+ "<br /><br /><b>Skin: </b>"+sSkinDesc+"<br />" + "<br /><b>Hair: </b>"+sHairDesc+"<br />"
				+ "<br /><b>Eyes: </b>"+sEyeDesc+"<br />" + "<br /><b>Misc: </b>"+sMiscDesc
				+ "<br /><br /><b>Racial Abilities:</b><br /><br />"));
		
		for(Ability abAbility : alRAbilities) {
			sbBuilder.append(abAbility.toHtmlString());
		}		
		
		return sbBuilder;
	}
    
	public String toString()
	{
		StringBuffer sbBuffer = new StringBuffer(100);	
		
		sbBuffer.append("Race: " + sRName + "\nDex: " + iDex + "\nStr: " + iStr
				+ "\nTou: " + iTou + "\nPer: " + iPer + "\nWil: " + iWil + "\nCha: "
				+ iCha + "\n\nKarma Mod: " + iKMod + "\nKarma Step: " + iKStep
				+ "\n\nGround Movement (yrds): " + iGMRate + "\nFlying Movement (yrds): "
				+ iFMRate + "\n\nAverage Weight: " + iAvgWeight + "\nAverage Height: " + fAvgHeight				
				+ "\nAverage Lifespan: " + iAvgLifespan + "\nAge of Maturity: " + iAgeOfMaturity
				+ "\n\n\nRacial Abilities:\n");
		
		for(Ability abAbility : alRAbilities) {
			sbBuffer.append(abAbility.toString());
		}
		
		return sbBuffer.toString();
	}
        
}
