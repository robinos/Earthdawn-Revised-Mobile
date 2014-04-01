package com.example.earthdawnrevisedmobile;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.res.Resources;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class NamegiverListContent {

	/**
	 * An array of sample (dummy) items.
	 */
	//public static List<NamegiverItem> NAMEGIVER_ITEMS = new ArrayList<NamegiverItem>();

	private static Namegivers naNamegivers = null;
	private static ArrayList<Race> alNamegivers = null;
	private static ArrayList<String> alRaceNames = null;
	private static HashMap<String, Race> hmNamegivers = null;
	
	/**
	 * A map of sample (dummy) items, by ID.
	 */
	//public static Map<String, NamegiverItem> NAMEGIVER_ITEM_MAP = new HashMap<String, NamegiverItem>();

	/*static {
		// Add sample items.
		addItem(new NamegiverItem("Dwarf", "Dwarf description"));
		addItem(new NamegiverItem("Elf", "Elf description"));
		addItem(new NamegiverItem("Human", "Human description"));
		addItem(new NamegiverItem("Obsidiman", "Obsidiman description"));
		addItem(new NamegiverItem("Ork", "Ork description"));
		addItem(new NamegiverItem("Troll", "Troll description"));
		addItem(new NamegiverItem("T'Skrang", "T'Skrang description"));
		addItem(new NamegiverItem("Windling", "Windling description"));		
	}*/

	public static void loadNamegivers(Resources rResource)
	{
		XmlHandler xmlHandler = new XmlHandler(rResource);
	    naNamegivers = xmlHandler.readNamegiversXml();
	    
        if(naNamegivers != null) {
		    alNamegivers = naNamegivers.getNamegivers();
		    if(alNamegivers != null) { 
			    alRaceNames = new ArrayList<String>();
			    hmNamegivers = new HashMap<String, Race>();
			    
			    for(Race raRace : alNamegivers) {
			    	alRaceNames.add(raRace.getRaceName());
			    	hmNamegivers.put(raRace.getRaceName(), raRace);
			    }
		    }
        }
        else {
        	alRaceNames = new ArrayList<String>();
        	alRaceNames.add("Data failed to load");        	
        }
	}	

	public static ArrayList<Race> getNamegivers() {
		if(alNamegivers == null) alNamegivers = new ArrayList<Race>();
		return alNamegivers;
	}
	
	public static ArrayList<String> getRaceNames() {
		if(alRaceNames == null) alRaceNames = new ArrayList<String>();
		return alRaceNames;
	}	
	
	public static HashMap<String, Race> getRaceMap() {
		if(hmNamegivers == null) hmNamegivers = new HashMap<String,Race>();
		return hmNamegivers;
	}	
	
	/*private static void addItem(NamegiverItem item) {
		NAMEGIVER_ITEMS.add(item);
		NAMEGIVER_ITEM_MAP.put(item.id, item);
	}*/

	/**
	 * A dummy item representing a piece of content.
	 *
	public static class NamegiverItem {
		public String id;
		public String description;
		public String content;

		public NamegiverItem(String id, String description) {
			this.id = id;
			this.description = description;
			this.content = description;
		}

		@Override
		public String toString() {
			return id;
		}
	}*/
}

