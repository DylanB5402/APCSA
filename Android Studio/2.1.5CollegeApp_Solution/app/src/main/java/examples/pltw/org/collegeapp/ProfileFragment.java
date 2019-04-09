package examples.pltw.org.collegeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;


public class ProfileFragment extends Fragment{
    private static final String TAG = "ProfileFragment";
    private static final int REQUEST_DATE_OF_BIRTH = 0;
    private Button mDateOfBirthButton;

    private TextView mFirstName;
    private EditText mEditFirstName;
    private TextView mLastName;
    private EditText mEditLastName;
    private Button mSubmitButton;

    private Profile mProfile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

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
            public void onClick(View v) {
                mProfile.setFirstName(mEditFirstName.getText().toString());
                mFirstName.setText(mProfile.getFirstName());
                mProfile.setLastName(mEditLastName.getText().toString());
                mLastName.setText(mProfile.getLastName());
            }
        });

        mDateOfBirthButton = (Button) rootView.findViewById(R.id.profileDateOfBirthButton);

        mDateOfBirthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getFragmentManager();
                DatePickerFragment dialog = DatePickerFragment.newInstance(mProfile.getDateOfBirth());
                dialog.setTargetFragment(ProfileFragment.this, REQUEST_DATE_OF_BIRTH);
                dialog.show(fm, "DialogDateOfBirth");

            }
        });

        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if (resultCode != Activity.RESULT_OK) {
            return;
        }
        if (requestCode == REQUEST_DATE_OF_BIRTH) {
            Date date = (Date)data.getSerializableExtra(DatePickerFragment.EXTRA_DATE_OF_BIRTH);
            mProfile.setDateOfBirth(date);
            mDateOfBirthButton.setText(mProfile.getDateOfBirth().toString());
        }
    }
}
