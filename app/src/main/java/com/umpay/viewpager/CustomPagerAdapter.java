package com.umpay.viewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by rgz on 15/2/12.
 * FragmentPagerAdapter - Each page is a fragment and all of them are kept in memory,
 * hence best to use when there's a fixed small set of screens to be navigated through.
 * If loads of fragments are shoved in using this adapter then it could lead to a laggy user experience.
 * It works even better when then content of the fragments are static than something that constantly changes or gets update.
 * FragmentPagerAdapter.getItem()方法每个fragment只会调用一次，然后就会常驻内存。
 *
 * FragmentStatePagerAdapter - Each page is a fragment which gets destroyed as soon as it's not visible to the user,
 * i.e., the user navigates to another one. Due to this behaviour it consumes much less memory
 * but then doesn't perform as well as its counterpart(FragmentPagerAdapter).
 * Hence, it's perfect in the cases where the number of pages is high or undetermined.
 * FragmentStatePagerAdapter.getItem()方法会常常调用。因为Fragment经常销毁。
 */
public class CustomPagerAdapter extends FragmentPagerAdapter {


    private static final String TAG = CustomPagerAdapter.class.getSimpleName();
    private final Context mContext;

    public CustomPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Log.i(TAG, "getItem-" + (position + 1));

        Fragment fragment = new DemoFragment();

        Bundle args = new Bundle();
        args.putInt("page_position", (position + 1));

        fragment.setArguments(args);


        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
