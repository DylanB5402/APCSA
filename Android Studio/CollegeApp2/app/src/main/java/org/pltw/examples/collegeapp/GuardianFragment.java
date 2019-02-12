package org.pltw.examples.collegeapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GuardianFragment extends Fragment {

    private Guardian mGuardian;
    private TextView mFirstName, mLastName;
    private EditText mFirstNameEdit, mLastNameEdit;
    private Button mSubmitButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView= inflater.inflate(R.layout.fragment_family_member, container, false);

        mGuardian = new Guardian();
        mFirstName = (TextView) rootView.findViewById(R.id.familyMemberFirstNameTextView);
        mFirstName.setText(mGuardian.getFirstName());

        mLastName = (TextView) rootView.findViewById(R.id.familyMemberLastNameTextView);
        mLastName.setText(mGuardian.getLastName());

        mFirstNameEdit = (EditText) rootView.findViewById(R.id.familyMemberFirstNameEditView);
        mLastNameEdit = (EditText) rootView.findViewById(R.id.familyMemberLastNameEditView);

        mSubmitButton = (Button) rootView.findViewById(R.id.familyMemberSubmitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mGuardian.setFirstName(mFirstNameEdit.getText().toString());
                mFirstName.setText(mGuardian.getFirstName());
                mGuardian.setLastName(mLastNameEdit.getText().toString());
                mLastName.setText(mGuardian.getLastName());
            }
        });
        return rootView;
    }
}
