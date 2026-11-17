package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzek extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzek> CREATOR = C4157CoC.A00(23);
    public final int A00;
    public final boolean A01;
    public final boolean A02;

    public zzek(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A08(parcel, 3, this.A01);
        AbstractC4100CmU.A08(parcel, 4, this.A02);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
