package com.google.android.gms.internal.mlkit_vision_face;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = C4158CoD.A03(80);
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public zzn(int i, float f, float f2, int i2) {
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A02);
        AbstractC4100CmU.A04(parcel, this.A00, 2);
        AbstractC4100CmU.A04(parcel, this.A01, 3);
        AbstractC4100CmU.A06(parcel, 4, this.A03);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
