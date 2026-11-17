package com.google.android.material.datepicker;

import X.BV4;
import X.C10638I0i;
import X.C60O;
import X.Ht0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes6.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C10638I0i(26);
    public Month A00;
    public final int A01;
    public final int A02;
    public final Month A03;
    public final Month A04;

    public interface DateValidator extends Parcelable {
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            z = false;
            if (obj instanceof CalendarConstraints) {
                CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
                if (this.A04.equals(calendarConstraints.A04) && this.A03.equals(calendarConstraints.A03) && Ht0.A00(this.A00, calendarConstraints.A00)) {
                    throw BV4.A0a("equals");
                }
            }
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, this.A00, null});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A04, 0);
        parcel.writeParcelable(this.A03, 0);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeParcelable(null, 0);
    }

    public CalendarConstraints(Month month, Month month2, Month month3) {
        this.A04 = month;
        this.A03 = month2;
        this.A00 = month3;
        if (month3 != null) {
            Calendar calendar = month.A05;
            Calendar calendar2 = month3.A05;
            if (calendar.compareTo(calendar2) > 0) {
                throw C60O.A0i("start Month cannot be after current Month");
            }
            if (calendar2.compareTo(month2.A05) > 0) {
                throw C60O.A0i("current Month cannot be after end Month");
            }
        }
        if (!(month.A05 instanceof GregorianCalendar)) {
            throw C60O.A0i("Only Gregorian calendars are supported.");
        }
        int i = month2.A04 - month.A04;
        this.A01 = (i * 12) + (month2.A03 - month.A03) + 1;
        this.A02 = i + 1;
    }
}
