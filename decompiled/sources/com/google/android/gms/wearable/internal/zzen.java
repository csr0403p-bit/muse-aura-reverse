package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = C4157CoC.A00(25);
    public final int A00;
    public final String A01;

    public zzen(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A0A(parcel, this.A01, 3);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
