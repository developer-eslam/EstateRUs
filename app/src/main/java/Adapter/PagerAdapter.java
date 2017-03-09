package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.AngelFragment;
import fragment.TenantsFragment;
import fragment.UnitsFragment;


public class PagerAdapter  extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                UnitsFragment unitsFragment = new UnitsFragment();
                return unitsFragment;
            case 1:
                AngelFragment angelFragment = new AngelFragment();
                return angelFragment;
            case 2:
                TenantsFragment tenantsFragment = new TenantsFragment();
                return tenantsFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
