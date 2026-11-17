package com.google.android.gms.common.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = C4158CoD.A03(31);
    public final int A00;
    public final RootTelemetryConfiguration A01;
    public final boolean A02;
    public final boolean A03;
    public final int[] A04;
    public final int[] A05;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, int[] iArr, int[] iArr2, int i, boolean z, boolean z2) {
        this.A01 = rootTelemetryConfiguration;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = iArr;
        this.A00 = i;
        this.A05 = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A09(parcel, this.A01, 1, i);
        AbstractC4100CmU.A08(parcel, 2, this.A02);
        AbstractC4100CmU.A08(parcel, 3, this.A03);
        int[] iArr = this.A04;
        if (iArr != null) {
            int iA01 = AbstractC4100CmU.A01(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC4100CmU.A05(parcel, iA01);
        }
        AbstractC4100CmU.A06(parcel, 5, this.A00);
        int[] iArr2 = this.A05;
        if (iArr2 != null) {
            int iA012 = AbstractC4100CmU.A01(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC4100CmU.A05(parcel, iA012);
        }
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
