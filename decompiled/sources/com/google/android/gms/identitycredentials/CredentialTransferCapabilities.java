package com.google.android.gms.identitycredentials;

import X.AbstractC4100CmU;
import X.C4158CoD;
import X.C7384Etj;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class CredentialTransferCapabilities extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialTransferCapabilities> CREATOR = C4158CoD.A03(59);
    public final Bundle A00;

    public CredentialTransferCapabilities(Bundle bundle) {
        C7384Etj.A0Y(bundle, 0);
        this.A00 = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA01 = AbstractSafeParcelable.A01(parcel);
        AbstractC4100CmU.A02(this.A00, parcel, 1);
        AbstractC4100CmU.A05(parcel, iA01);
    }
}
