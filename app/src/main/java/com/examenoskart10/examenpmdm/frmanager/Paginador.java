package com.examenoskart10.examenpmdm.frmanager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.examenoskart10.examenpmdm.FirstFragment;
import com.examenoskart10.examenpmdm.SecondFragment;
import com.examenoskart10.examenpmdm.ThirdFragment;

public class Paginador extends FragmentPagerAdapter {
    private final Context mContext;

    public Paginador(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                throw new IllegalStateException("Posición no válida: " + position);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
