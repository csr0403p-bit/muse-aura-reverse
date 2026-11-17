package X;

import android.content.Context;
import com.facebook.aura.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes6.dex */
public final class FZ0 extends AbstractC8091FSx<FZA> {
    public final int A00;
    public final Context A01;
    public final CalendarConstraints A02;
    public final FZV A03;

    public final int A05(Month month) {
        Month month2 = this.A02.A04;
        if (month2.A05 instanceof GregorianCalendar) {
            return ((month.A04 - month2.A04) * 12) + (month.A03 - month2.A03);
        }
        throw C60O.A0i("Only Gregorian calendars are supported.");
    }

    public FZ0(Context context, CalendarConstraints calendarConstraints, FZV fzv) {
        Month month = calendarConstraints.A04;
        Month month2 = calendarConstraints.A03;
        Month month3 = calendarConstraints.A00;
        Calendar calendar = month.A05;
        Calendar calendar2 = month3.A05;
        if (calendar.compareTo(calendar2) > 0) {
            throw C60O.A0i("firstPage cannot be after currentPage");
        }
        if (calendar2.compareTo(month2.A05) > 0) {
            throw C60O.A0i("currentPage cannot be after lastPage");
        }
        int dimensionPixelSize = FZ1.A03 * context.getResources().getDimensionPixelSize(R.dimen._name_removed__res_0x7f07006e);
        int dimensionPixelSize2 = MaterialDatePicker.A00(context) ? context.getResources().getDimensionPixelSize(R.dimen._name_removed__res_0x7f07006e) : 0;
        this.A01 = context;
        this.A00 = dimensionPixelSize + dimensionPixelSize2;
        this.A02 = calendarConstraints;
        this.A03 = fzv;
        if (super.A01.A05()) {
            throw C3cG.A0Q("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        super.A00 = true;
    }
}
