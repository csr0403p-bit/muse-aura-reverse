package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* loaded from: classes5.dex */
public final class zzer extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzer> CREATOR = C4157CoC.A00(27);
    public final int A00;
    public final ConnectionConfiguration[] A01;

    public zzer(ConnectionConfiguration[] connectionConfigurationArr, int i) {
        this.A00 = i;
        this.A01 = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A0E(parcel, this.A01, 3, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
