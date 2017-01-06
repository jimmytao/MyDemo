package tao.myapplication.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import tao.myapplication.R;

/**
 * Created by tao.
 * <p>
 * Created Time : 2017/1/4 16:46.
 * <p>
 * Description : File in  tao.myapplication.fragment, Project in MyDemo.
 * <p>
 * Content:
 */

public class fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        return view;
    }



}
