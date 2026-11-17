package com.google.android.gms.internal.mlkit_vision_face;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = C4158CoD.A03(79);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A01);
        AbstractC4100CmU.A06(parcel, 3, this.A02);
        AbstractC4100CmU.A06(parcel, 4, this.A03);
        AbstractC4100CmU.A08(parcel, 5, this.A04);
        AbstractC4100CmU.A08(parcel, 6, this.A05);
        AbstractC4100CmU.A04(parcel, this.A00, 7);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
