package org.pltw.examples.collegeapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class FamilyMemberFragment extends Fragment {

    FamilyMember mFamilyMember;
    private TextView mFirstName, mLastName;
    private EditText mFirstNameEdit, mLastNameEdit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView= inflater.inflate(R.layout.fragment_family_member, container, false);

        mFamilyMember = new FamilyMember();
        mFirstName = (TextView) rootView.findViewById(R.id.familyMemberFirstNameTextView);

        return rootView;
    }
}
