package com.facebook.common.callercontext;

import X.AbstractC7213Eib;
import X.BV7;
import X.C3cI;
import X.C60R;
import X.C7200EiD;
import X.C7580F4t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CallerContext implements Parcelable {
    public static final Parcelable.Creator<CallerContext> CREATOR = new C7580F4t(15);
    public final ContextChain A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map<String, String> A05;

    public final boolean equals(Object obj) {
        if (obj instanceof CallerContext) {
            CallerContext callerContext = (CallerContext) obj;
            if (AbstractC7213Eib.A00(this.A02, callerContext.A02) && AbstractC7213Eib.A00(this.A01, callerContext.A01) && AbstractC7213Eib.A00(this.A03, callerContext.A03) && AbstractC7213Eib.A00(this.A04, callerContext.A04) && AbstractC7213Eib.A00(this.A00, callerContext.A00) && AbstractC7213Eib.A00(this.A05, callerContext.A05)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return (((((((((BV7.A0I(this.A02) * 31) + C60R.A01(this.A01)) * 31) + C60R.A01(this.A03)) * 31) + C60R.A01(this.A04)) * 31) + C60R.A01(this.A00)) * 31) + C60R.A01(this.A05);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeMap(this.A05);
    }

    public CallerContext(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
        this.A05 = parcel.readHashMap(HashMap.class.getClassLoader());
    }

    public final String toString() {
        C7200EiD c7200EiD = new C7200EiD(C3cI.A0Y(this));
        C7200EiD.A00(c7200EiD, this.A02, "Calling Class Name");
        C7200EiD.A00(c7200EiD, this.A01, "Analytics Tag");
        C7200EiD.A00(c7200EiD, this.A03, "Feature tag");
        C7200EiD.A00(c7200EiD, this.A04, "Module Analytics Tag");
        C7200EiD.A00(c7200EiD, this.A00, "Context Chain");
        C7200EiD.A00(c7200EiD, this.A05, "Request Tags");
        return c7200EiD.toString();
    }

    public CallerContext(ContextChain contextChain, String str) {
        this.A02 = str;
        this.A01 = null;
        this.A03 = null;
        this.A04 = null;
        this.A00 = contextChain;
        this.A05 = null;
    }
}
