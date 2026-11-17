package com.google.android.gms.signin.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

/* loaded from: classes5.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = C4157CoC.A00(2);
    public final int A00;
    public final ConnectionResult A01;
    public final zav A02;

    public zak(ConnectionResult connectionResult, zav zavVar, int i) {
        this.A00 = i;
        this.A01 = connectionResult;
        this.A02 = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A09(parcel, this.A01, 2, i);
        AbstractC4100CmU.A09(parcel, this.A02, 3, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
