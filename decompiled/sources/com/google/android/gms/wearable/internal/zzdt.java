package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzdt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdt> CREATOR = C4157CoC.A00(15);
    public final byte[] A00;

    public zzdt(byte[] bArr) {
        this.A00 = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0D(parcel, this.A00, 1);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
