package com.google.android.gms.common.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = C4158CoD.A03(29);
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public RootTelemetryConfiguration(int i, int i2, int i3, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A08(parcel, 2, this.A03);
        AbstractC4100CmU.A08(parcel, 3, this.A04);
        AbstractC4100CmU.A06(parcel, 4, this.A01);
        AbstractC4100CmU.A06(parcel, 5, this.A02);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
