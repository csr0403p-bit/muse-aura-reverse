package com.google.android.gms.internal.mlkit_vision_label;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzol extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzol> CREATOR = C4158CoD.A03(92);
    public final float A00;
    public final int A01;

    public zzol(float f, int i) {
        this.A00 = f;
        this.A01 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A04(parcel, this.A00, 1);
        AbstractC4100CmU.A06(parcel, 2, this.A01);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
