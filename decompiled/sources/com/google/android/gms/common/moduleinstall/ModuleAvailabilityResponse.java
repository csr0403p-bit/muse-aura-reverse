package com.google.android.gms.common.moduleinstall;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = C4158CoD.A03(34);
    public final int A00;
    public final boolean A01;

    public ModuleAvailabilityResponse(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A08(parcel, 1, this.A01);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
