package com.example.earthdawnrevisedmobile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A fragment representing a single LibraryNamegiver detail screen. This
 * fragment is either contained in a {@link LibraryNamegiverListActivity} in
 * two-pane mode (on tablets) or a {@link LibraryNamegiverDetailActivity} on
 * handsets.
 */
public class LibraryNamegiverDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String NARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private Race raSelectedRace = null;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public LibraryNamegiverDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(NARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			raSelectedRace = NamegiverListContent.getRaceMap().get(getArguments().getString(
					NARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(
				R.layout.fragment_librarynamegiver_detail, container, false);

		// Show the dummy content as text in a TextView.
		if (raSelectedRace != null) {
			((TextView) rootView.findViewById(R.id.librarynamegiver_detail))
			.setText(raSelectedRace.toHtmlString());
		}

		return rootView;
	}
}
