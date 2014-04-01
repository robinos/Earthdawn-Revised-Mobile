package com.example.earthdawnrevisedmobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DisciplineListContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DisciplineItem> DISCIPLINE_ITEMS = new ArrayList<DisciplineItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DisciplineItem> DISCIPLINE_ITEM_MAP = new HashMap<String, DisciplineItem>();

	static {
		// Add sample items.
		addItem(new DisciplineItem("Air Sailor", "Air Sailor description"));
		addItem(new DisciplineItem("Archer", "Archer description"));
		addItem(new DisciplineItem("Beastmaster", "Beastmaster description"));
		addItem(new DisciplineItem("Cavalryman", "Cavalryman description"));
		addItem(new DisciplineItem("Elementalist", "Elementalist description"));
		addItem(new DisciplineItem("Illusionist", "Illusionist description"));
		addItem(new DisciplineItem("Nethermancer", "Nethermancer description"));
		addItem(new DisciplineItem("Scout", "Scout description"));		
		addItem(new DisciplineItem("Sky Raider", "Sky Raider description"));
		addItem(new DisciplineItem("Swordmaster", "Swordmaster description"));
		addItem(new DisciplineItem("Thief", "Thief description"));	
		addItem(new DisciplineItem("Troubadour", "Troubadour description"));
		addItem(new DisciplineItem("Warrior", "Warrior description"));
		addItem(new DisciplineItem("Weaponsmith", "Weaponsmith description"));		
		addItem(new DisciplineItem("Wizard", "Wizard description"));		
	}

	/*public static void loadDisciplines(Resources rResource)
	{
		XmlHandler xmlHandler = new XmlHandler(rResource);
	    xmlHandler.readDisciplinesXml();
	}*/
	
	private static void addItem(DisciplineItem item) {
		DISCIPLINE_ITEMS.add(item);
		DISCIPLINE_ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DisciplineItem {
		public String id;
		public String description;
		public String content;

		public DisciplineItem(String id, String description) {
			this.id = id;
			this.description = description;
			this.content = description;
		}

		@Override
		public String toString() {
			return id;
		}
	}
}


