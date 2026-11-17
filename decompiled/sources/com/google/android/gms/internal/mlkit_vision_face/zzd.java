package com.google.android.gms.internal.mlkit_vision_face;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = C4158CoD.A03(77);
    public final int A00;
    public final PointF[] A01;

    public zzd(PointF[] pointFArr, int i) {
        this.A01 = pointFArr;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0E(parcel, this.A01, 2, i);
        AbstractC4100CmU.A06(parcel, 3, this.A00);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
