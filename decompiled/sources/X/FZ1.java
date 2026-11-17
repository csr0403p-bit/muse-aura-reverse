package X;

import android.content.Context;
import android.icu.text.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.aura.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public final class FZ1 extends BaseAdapter {
    public static final int A03 = AbstractC7609F5w.A0y().getMaximum(4);
    public C8157FWz A00;
    public final CalendarConstraints A01;
    public final Month A02;

    @Override // android.widget.Adapter
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        Month month = this.A02;
        if (i < month.A00() || i > (month.A00() + month.A01) - 1) {
            return null;
        }
        int iA00 = (i - month.A00()) + 1;
        Calendar calendarA00 = FZ8.A00(month.A05);
        calendarA00.set(5, iA00);
        return Long.valueOf(calendarA00.getTimeInMillis());
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Month month = this.A02;
        return month.A01 + month.A00();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.A02.A02;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public FZ1(CalendarConstraints calendarConstraints, Month month) {
        this.A02 = month;
        this.A01 = calendarConstraints;
        throw BV4.A0a("getSelectedDays");
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.A00 == null) {
            this.A00 = new C8157FWz(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(context).inflate(R.layout._name_removed__res_0x7f0d0294, viewGroup, false);
        }
        Month month = this.A02;
        int iA00 = i - month.A00();
        if (iA00 < 0 || iA00 >= month.A01) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i2 = iA00 + 1;
            textView.setTag(month);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", BV5.A1Y(i2)));
            Calendar calendarA00 = FZ8.A00(month.A05);
            calendarA00.set(5, i2);
            long timeInMillis = calendarA00.getTimeInMillis();
            int i3 = month.A04;
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
            int i4 = new Month(calendar).A04;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(i3 == i4 ? "MMMEd" : "yMMMEd", Locale.getDefault());
            instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
            textView.setContentDescription(instanceForSkeleton.format(new Date(timeInMillis)));
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        if (getItem(i) == null) {
            return textView;
        }
        throw BV4.A0a("isValid");
    }
}
