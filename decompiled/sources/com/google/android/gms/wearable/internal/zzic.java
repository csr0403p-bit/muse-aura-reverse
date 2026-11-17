package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzic extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzic> CREATOR = C4157CoC.A00(51);
    public final int A00;
    public final long A01;
    public final List A02;

    public zzic(int i, long j, List list) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A07(parcel, 3, this.A01);
        AbstractC4100CmU.A0C(parcel, this.A02, 4);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
