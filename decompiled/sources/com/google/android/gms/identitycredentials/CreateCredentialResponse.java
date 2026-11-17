package com.google.android.gms.identitycredentials;

import X.AbstractC4100CmU;
import X.AnonymousClass003;
import X.C4158CoD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class CreateCredentialResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateCredentialResponse> CREATOR = C4158CoD.A03(57);
    public final Bundle A00;
    public final String A01;

    public CreateCredentialResponse(String str, Bundle bundle) {
        AnonymousClass003.A0u(str, bundle);
        this.A01 = str;
        this.A00 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA01 = AbstractSafeParcelable.A01(parcel);
        AbstractC4100CmU.A0A(parcel, this.A01, 1);
        AbstractC4100CmU.A02(this.A00, parcel, 2);
        AbstractC4100CmU.A05(parcel, iA01);
    }
}
