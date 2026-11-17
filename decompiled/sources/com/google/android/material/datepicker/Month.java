package com.google.android.material.datepicker;

import X.BV7;
import X.C10638I0i;
import X.FZ8;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C10638I0i(27);
    public String A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Calendar A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Month) {
                Month month = (Month) obj;
                if (this.A03 != month.A03 || this.A04 != month.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        Calendar calendar = this.A05;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.A02 : firstDayOfWeek;
    }

    public final String A01(Context context) {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        String dateTime = DateUtils.formatDateTime(context, this.A05.getTimeInMillis() - TimeZone.getDefault().getOffset(r2), 36);
        this.A00 = dateTime;
        return dateTime;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Month month) {
        return this.A05.compareTo(month.A05);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return BV7.A0D(Integer.valueOf(this.A03), Integer.valueOf(this.A04));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA00 = FZ8.A00(calendar);
        this.A05 = calendarA00;
        this.A03 = calendarA00.get(2);
        this.A04 = calendarA00.get(1);
        this.A02 = calendarA00.getMaximum(7);
        this.A01 = calendarA00.getActualMaximum(5);
        calendarA00.getTimeInMillis();
    }
}
