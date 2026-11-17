package com.google.android.gms.identitycredentials;

import X.C4158CoD;
import X.C7384Etj;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class PendingGetCredentialHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PendingGetCredentialHandle> CREATOR = C4158CoD.A03(63);
    public final PendingIntent A00;

    public PendingGetCredentialHandle(PendingIntent pendingIntent) {
        C7384Etj.A0Y(pendingIntent, 0);
        this.A00 = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractSafeParcelable.A06(parcel, this.A00, i, AbstractSafeParcelable.A01(parcel));
    }
}
