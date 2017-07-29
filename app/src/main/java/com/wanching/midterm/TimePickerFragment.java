package com.wanching.midterm;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.EditText;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by WanChing on 30/7/2017.
 */

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    private static Calendar calendar = null;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        if(calendar == null)
            calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog dialog = new TimePickerDialog(getActivity(), this, hour, minute, true);

        return dialog;
    }

    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
        calendar.set(Calendar.YEAR, Calendar.MONTH, Calendar.DATE, hour, minute);

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm a");
        String time = formatter.format(calendar.getTime());
        EditText etTime = (EditText) getActivity().findViewById(R.id.time);
        etTime.setText(time);

    }
}
