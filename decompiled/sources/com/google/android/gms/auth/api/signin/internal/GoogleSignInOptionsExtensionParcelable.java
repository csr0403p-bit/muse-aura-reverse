package com.google.android.gms.auth.api.signin.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = C4158CoD.A03(14);
    public int A00;
    public Bundle A01;
    public final int A02;

    public GoogleSignInOptionsExtensionParcelable(Bundle bundle, int i, int i2) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A02);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A02(this.A01, parcel, 3);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
