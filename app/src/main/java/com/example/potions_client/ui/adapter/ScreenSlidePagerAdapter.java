package com.example.potions_client.ui.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.potions_client.ui.fragment.FirstPageFragment;
import com.example.potions_client.ui.fragment.SecondPageFragment;
import com.example.potions_client.ui.fragment.ThridPageFragment;

/**
 * A simple pager adapter that represents 5 FirstPageFragment objects, in
 * sequence.
 */
public class ScreenSlidePagerAdapter extends FragmentStateAdapter {
    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 3;
    public ScreenSlidePagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position ==0){
            return new FirstPageFragment();
        }
        else if (position == 1) {
            return new SecondPageFragment();
        }
        else return new ThridPageFragment();

    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }
}
