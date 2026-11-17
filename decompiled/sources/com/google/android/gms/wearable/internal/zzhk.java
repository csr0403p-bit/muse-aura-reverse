package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzhk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhk> CREATOR = C4157CoC.A00(43);
    public final long A00;
    public final String A01;
    public final String A02;

    public zzhk(String str, String str2, long j) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A01, 2);
        AbstractC4100CmU.A0A(parcel, this.A02, 3);
        AbstractC4100CmU.A07(parcel, 4, this.A00);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
