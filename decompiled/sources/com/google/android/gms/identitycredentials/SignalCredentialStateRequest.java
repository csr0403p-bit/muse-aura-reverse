package com.google.android.gms.identitycredentials;

import X.AbstractC4100CmU;
import X.AnonymousClass003;
import X.C4158CoD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class SignalCredentialStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignalCredentialStateRequest> CREATOR = C4158CoD.A03(68);
    public final Bundle A00;
    public final String A01;
    public final String A02;

    public SignalCredentialStateRequest(Bundle bundle, String str, String str2) {
        AnonymousClass003.A0v(str, bundle);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA01 = AbstractSafeParcelable.A01(parcel);
        AbstractC4100CmU.A0A(parcel, this.A02, 1);
        AbstractC4100CmU.A0A(parcel, this.A01, 2);
        AbstractC4100CmU.A02(this.A00, parcel, 3);
        AbstractC4100CmU.A05(parcel, iA01);
    }
}
