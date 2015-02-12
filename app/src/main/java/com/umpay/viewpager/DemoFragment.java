package com.umpay.viewpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rgz on 15/2/12.
 */
public class DemoFragment extends Fragment {

    private static final String TAG = DemoFragment.class.getSimpleName();
    private int position = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_demo, container, false);

        Bundle args = getArguments();

        position = args.getInt("page_position");

        ((TextView) rootView.findViewById(R.id.text)).setText("Page " + position);

        Log.i(TAG, "onCreateView-" + position);

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume-" + position);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause-" + position);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i(TAG, "onAttach-" + position);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach-" + position);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.i(TAG, "onViewCreated-" + position);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView-" + position);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy-" + position);
    }
}
