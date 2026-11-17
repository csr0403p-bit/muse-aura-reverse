package com.google.android.gms.common;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4158CoD;
import X.C7392EuT;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = C4158CoD.A03(38);
    public final String A00;

    @Deprecated
    public final int A01;
    public final long A02;

    public final long A00() {
        long j = this.A02;
        return j == -1 ? this.A01 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.A00;
            String str2 = feature.A00;
            if (str == null ? str2 == null : str.equals(str2)) {
                if (A00() == feature.A00()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0D(this.A00, Long.valueOf(A00()));
    }

    public final String toString() {
        C7392EuT c7392EuT = new C7392EuT(this);
        c7392EuT.A00(this.A00, "name");
        c7392EuT.A00(Long.valueOf(A00()), "version");
        return c7392EuT.toString();
    }

    public Feature(String str, long j) {
        this.A00 = str;
        this.A02 = j;
        this.A01 = -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A00, 1);
        AbstractC4100CmU.A06(parcel, 2, this.A01);
        AbstractC4100CmU.A07(parcel, 3, A00());
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public Feature(String str, int i, long j) {
        this.A00 = str;
        this.A01 = i;
        this.A02 = j;
    }
}
