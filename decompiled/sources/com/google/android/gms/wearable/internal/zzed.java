package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzed extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzed> CREATOR = C4157CoC.A00(20);
    public final int A00;
    public final ParcelFileDescriptor A01;

    public zzed(ParcelFileDescriptor parcelFileDescriptor, int i) {
        this.A00 = i;
        this.A01 = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractSafeParcelable.A07(parcel, this.A01, i, iA00);
    }
}
