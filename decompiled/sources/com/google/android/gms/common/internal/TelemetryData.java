package com.google.android.gms.common.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = C4158CoD.A03(25);
    public List A00;
    public final int A01;

    public TelemetryData(int i, List list) {
        this.A01 = i;
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A01);
        AbstractC4100CmU.A0C(parcel, this.A00, 2);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
