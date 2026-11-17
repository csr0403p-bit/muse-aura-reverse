package com.google.android.gms.auth.api.identity;

import X.AbstractC4100CmU;
import X.C4158CoD;
import X.CRy;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes5.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = C4158CoD.A03(7);
    public final PendingIntent A00;

    public BeginSignInResult(PendingIntent pendingIntent) {
        CRy.A03(pendingIntent);
        this.A00 = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractSafeParcelable.A06(parcel, this.A00, i, AbstractC4100CmU.A00(parcel));
    }
}
