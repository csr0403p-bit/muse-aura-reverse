package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzhu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhu> CREATOR = C4157CoC.A00(47);
    public final String A00;

    public zzhu(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A00, 1);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
