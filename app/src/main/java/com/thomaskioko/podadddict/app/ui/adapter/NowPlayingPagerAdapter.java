package com.thomaskioko.podadddict.app.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.thomaskioko.podadddict.app.ui.fragments.CoverFragment;
import com.thomaskioko.podadddict.app.ui.fragments.PlaylistFragment;
import com.thomaskioko.podadddict.app.ui.fragments.SummaryFragment;
import com.thomaskioko.podadddict.musicplayerlib.model.Track;

/**
 * Adapter class used to load fragments.
 *
 * @author Thomas Kioko
 */

public class NowPlayingPagerAdapter extends FragmentPagerAdapter {

    private Track mTrack;

    /**
     * Constructor
     *
     * @param fragmentManager {@link FragmentManager}
     * @param track           {@link Track}
     */
    public NowPlayingPagerAdapter(FragmentManager fragmentManager, Track track) {
        super(fragmentManager);
        mTrack = track;
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return 3;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return CoverFragment.newInstance(mTrack);
            case 1:
                return SummaryFragment.newInstance(mTrack);
            case 2:
                return new PlaylistFragment();
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}