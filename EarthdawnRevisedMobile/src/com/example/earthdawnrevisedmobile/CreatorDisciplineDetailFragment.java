package com.example.earthdawnrevisedmobile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A fragment representing a single ItemCreatorDiscipline detail screen. This
 * fragment is either contained in a {@link CreatorDisciplineListActivity}
 * in two-pane mode (on tablets) or a
 * {@link CreatorDisciplineDetailActivity} on handsets.
 */
public class CreatorDisciplineDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String DARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private DisciplineListContent.DisciplineItem mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public CreatorDisciplineDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(DARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = DisciplineListContent.DISCIPLINE_ITEM_MAP.get(getArguments().getString(
					DARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(
				R.layout.fragment_creatordiscipline_detail, container,
				false);

		// Show the dummy content as text in a TextView.
		if (mItem != null) {
			((TextView) rootView
					.findViewById(R.id.itemcreatordiscipline_detail))
					.setText(mItem.content);
		}

		return rootView;
	}
}
