package com.google.android.gms.internal.mlkit_vision_face;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = C4158CoD.A03(83);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;

    public zzou(float f, int i, int i2, int i3, int i4, boolean z) {
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = i4;
        this.A05 = z;
        this.A00 = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A01);
        AbstractC4100CmU.A06(parcel, 2, this.A02);
        AbstractC4100CmU.A06(parcel, 3, this.A03);
        AbstractC4100CmU.A06(parcel, 4, this.A04);
        AbstractC4100CmU.A08(parcel, 5, this.A05);
        AbstractC4100CmU.A04(parcel, this.A00, 6);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
