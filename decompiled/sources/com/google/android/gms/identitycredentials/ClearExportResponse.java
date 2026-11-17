package com.google.android.gms.identitycredentials;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class ClearExportResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClearExportResponse> CREATOR = C4158CoD.A03(54);
    public final boolean A00;

    public ClearExportResponse(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA01 = AbstractSafeParcelable.A01(parcel);
        AbstractC4100CmU.A08(parcel, 1, this.A00);
        AbstractC4100CmU.A05(parcel, iA01);
    }
}
