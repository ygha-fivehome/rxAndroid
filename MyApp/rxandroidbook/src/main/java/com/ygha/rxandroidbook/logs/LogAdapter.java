package com.ygha.rxandroidbook.logs;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.ygha.rxandroidbook.R;

import java.util.List;

public class LogAdapter extends ArrayAdapter<String> {
    public LogAdapter(Context context, List<String> logs) {
        super(context, R.layout.textview_log, R.id.tv_log, logs);
    }
}