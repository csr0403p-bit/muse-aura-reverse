package com.google.android.gms.internal.mlkit_vision_face;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzos> CREATOR = C4158CoD.A03(82);
    public final int A00;
    public final List A01;

    public zzos(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A0C(parcel, this.A01, 2);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
