package com.facebookpay.logging;

import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.BV7;
import X.C7384Etj;
import X.C7580F4t;
import X.EVQ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class FBPayLoggerData implements Parcelable {
    public static volatile String A09;
    public static final Parcelable.Creator<FBPayLoggerData> CREATOR = new C7580F4t(25);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Set<String> A08;

    public FBPayLoggerData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Set set) {
        this.A08 = AbstractC0878AGe.A0g(set);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A07 = str7;
        this.A06 = str8;
    }

    public static void A00(Parcel parcel, String str) {
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayLoggerData) {
                FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) obj;
                if (!C7384Etj.areEqual(this.A00, fBPayLoggerData.A00) || !C7384Etj.areEqual(this.A01, fBPayLoggerData.A01) || !C7384Etj.areEqual(this.A02, fBPayLoggerData.A02) || !C7384Etj.areEqual(this.A03, fBPayLoggerData.A03) || !C7384Etj.areEqual(this.A04, fBPayLoggerData.A04) || !C7384Etj.areEqual(this.A05, fBPayLoggerData.A05) || !C7384Etj.areEqual(A01(), fBPayLoggerData.A01()) || !C7384Etj.areEqual(this.A06, fBPayLoggerData.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        A00(parcel, this.A00);
        A00(parcel, this.A01);
        A00(parcel, this.A02);
        A00(parcel, this.A03);
        A00(parcel, this.A04);
        A00(parcel, this.A05);
        A00(parcel, this.A07);
        A00(parcel, this.A06);
        Set<String> set = this.A08;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(AnonymousClass005.A0j(it));
        }
    }

    public final String A01() {
        if (this.A08.contains("sessionId")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = EVQ.A00();
                }
            }
        }
        return A09;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return ((((((((((((((BV7.A0I(this.A00) + 31) * 31) + BV7.A0I(this.A01)) * 31) + BV7.A0I(this.A02)) * 31) + BV7.A0I(this.A03)) * 31) + BV7.A0I(this.A04)) * 31) + BV7.A0I(this.A05)) * 31) + BV7.A0I(A01())) * 31) + BV7.A0I(this.A06);
    }
}
