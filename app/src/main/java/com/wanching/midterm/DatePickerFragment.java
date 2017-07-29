package com.wanching.midterm;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by WanChing on 30/7/2017.
 */

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

    private static Calendar calendar = null;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        if(calendar == null)
            calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog = new DatePickerDialog(getActivity(), this, year, month, day);

        return dialog;
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        calendar.set(year, month, day);

        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM, d, yyyy");
        String date = formatter.format(calendar.getTime());
        EditText etDate = (EditText) getActivity().findViewById(R.id.date);
        etDate.setText(date);
    }
}
