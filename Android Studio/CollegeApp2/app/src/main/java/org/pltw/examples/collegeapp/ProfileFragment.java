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

public class ProfileFragment extends Fragment {

//    private  Button mDateOfBirthButton;
    private  static final int REQUEST_DATE_OF_BIRTH = 0;
    public static final String TAG = "ProfileFragment";

    private TextView mFirstName, mLastName;
    private EditText mEditFirstName, mEditLastName;
    private Button mSubmitButton;
    private Profile mProfile;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView= inflater.inflate(R.layout.fragment_profile, container, false);

        mProfile = new Profile();

        mFirstName = (TextView) rootView.findViewById(R.id.profileFirstNameTextView);
        mFirstName.setText(mProfile.getFirstName());
        mLastName = (TextView) rootView.findViewById(R.id.profileLastNameTextView);
        mLastName.setText(mProfile.getLastName());

        mEditFirstName = (EditText) rootView.findViewById(R.id.profileFirstNameEditText);
        mEditLastName = (EditText) rootView.findViewById(R.id.profileLastNameEditText);

        mSubmitButton = (Button) rootView.findViewById(R.id.profileSubmitButton);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mProfile.setFirstName(mEditFirstName.getText().toString());
                mFirstName.setText(mProfile.getFirstName());
                mProfile.setLastName(mEditLastName.getText().toString());
                mLastName.setText(mProfile.getLastName());
            }
        });

//        mDateOfBirthButton = (Button) rootView.findViewById(R.id.dateOfBirthButton);
//        mDateOfBirthButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentMana fm = getFragmentManager();
//                DatePickerFragment dialog = DatePickerFragment.newInstance(mProfile.getDateOfBirth());
//                dialog.setTargetFragment(ProfileFragment.this, REQUEST_DATE_OF_BIRTH);
//                dialog.show(fm,"DialogDateOgBirth");
//            }
//        });
        return rootView;
    }
}
