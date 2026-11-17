package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzfd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfd> CREATOR = C4157CoC.A00(33);
    public final int A00;
    public final zzhg A01;

    public zzfd(zzhg zzhgVar, int i) {
        this.A00 = i;
        this.A01 = zzhgVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractSafeParcelable.A07(parcel, this.A01, i, iA00);
    }
}
