package com.google.android.gms.signin.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;

/* loaded from: classes5.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = C4157CoC.A00(1);
    public final int A00;
    public final zat A01;

    public zai(zat zatVar, int i) {
        this.A00 = i;
        this.A01 = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A09(parcel, this.A01, 2, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
