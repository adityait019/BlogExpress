package com.example.blogexpress.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.blogexpress.Fragments.BlogFeedFragment;
import com.example.blogexpress.Fragments.DraftFragment;
import com.example.blogexpress.Fragments.PublishedFragment;

public class ViewPagerBlogAdapter extends FragmentStatePagerAdapter {
    public ViewPagerBlogAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
        {
            return new BlogFeedFragment();
        }
        else if(position==1)
        {
            return new PublishedFragment();
        }
        else {
            return new DraftFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
        {
            return "Home";
        }
        else if(position==1)
        {
            return "Published";
        }
        else
        {
            return "Draft";
        }
    }
}
