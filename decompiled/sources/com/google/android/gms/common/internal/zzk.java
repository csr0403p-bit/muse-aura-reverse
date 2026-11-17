package com.google.android.gms.common.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = C4158CoD.A03(30);
    public int A00;
    public Bundle A01;
    public ConnectionTelemetryConfiguration A02;
    public Feature[] A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A02(this.A01, parcel, 1);
        AbstractC4100CmU.A0E(parcel, this.A03, 2, i);
        AbstractC4100CmU.A06(parcel, 3, this.A00);
        AbstractC4100CmU.A09(parcel, this.A02, 4, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
