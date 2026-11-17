package com.google.android.gms.internal.mlkit_vision_face;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzpc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpc> CREATOR = C4158CoD.A03(85);
    public final int A00;
    public final PointF A01;

    public zzpc(PointF pointF, int i) {
        this.A00 = i;
        this.A01 = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A09(parcel, this.A01, 2, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
