package com.google.android.gms.internal.mlkit_vision_face;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = C4158CoD.A03(86);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A06(parcel, 3, this.A01);
        AbstractC4100CmU.A06(parcel, 4, this.A02);
        AbstractC4100CmU.A07(parcel, 5, this.A04);
        AbstractC4100CmU.A06(parcel, 6, this.A03);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
