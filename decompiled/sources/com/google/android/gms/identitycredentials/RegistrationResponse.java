package com.google.android.gms.identitycredentials;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class RegistrationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegistrationResponse> CREATOR = C4158CoD.A03(67);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC4100CmU.A05(parcel, AbstractSafeParcelable.A01(parcel));
    }
}
