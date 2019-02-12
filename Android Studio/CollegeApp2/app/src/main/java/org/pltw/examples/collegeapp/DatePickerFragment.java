package org.pltw.examples.collegeapp;

import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Date;

public class DatePickerFragment extends DialogFragment {

    private static final String DATE_ARGUMENT = "date of birth";

    private DatePicker mDatePicker;

    public static DatePickerFragment newInstance(Date date) {
        Bundle args = new Bundle();
        args.putSerializable(DATE_ARGUMENT, date);

        DatePickerFragment fragment = new DatePickerFragment();
        fragment.setArguments(args);
        return  fragment;
    }

//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//
//        Date date = (Date) getArguments().getSerializable(DATE_ARGUMENT);
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_date_of_birth, null);
//        mDatePicker = (DatePicker) v.findViewById(R.id.dialog_date_of_birth);
//        mDatePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), null);
//        return new AlertDialog.Builder(getActivity()).setView(v).setTitle("Date of Birth").setPositiveButton("Done", (dialog, which){
//            Date date = new GregorianCalendar(mDatePicker.getYear(), mDatePicker.getMonth(), mDatePicker.getDayOfMonth()).getTime();
//            sendResult(Activity.RESULT_OK, date);
//        }).create();
//    }
//
//    private  void sendResult(int resultCode, Date date){
//        if (getTargetFragment() == null) {
//            return;
//        }
//        Intent intent = new Intent();
//        Intent.putExtra(EXTRA_DATE_OF_BRITH, date);
//        getTargetFragment().onActivityResult(getTargetRequestCode(), resultCode, intent);
//    }
}
