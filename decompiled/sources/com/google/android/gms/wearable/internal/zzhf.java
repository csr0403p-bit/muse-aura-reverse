package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzhf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhf> CREATOR = C4157CoC.A00(40);
    public final DataHolder A00;
    public final String A01;

    public zzhf(DataHolder dataHolder, String str) {
        this.A01 = str;
        this.A00 = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A01, 1);
        AbstractC4100CmU.A09(parcel, this.A00, 2, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
