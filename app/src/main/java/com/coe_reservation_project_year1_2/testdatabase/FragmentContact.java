package com.coe_reservation_project_year1_2.testdatabase;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Supatchakorn on 4/5/2561.
 */

public class FragmentContact extends android.support.v4.app.Fragment{

    View v;

    public FragmentContact() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment,container,false);
        return v;
    }
}
