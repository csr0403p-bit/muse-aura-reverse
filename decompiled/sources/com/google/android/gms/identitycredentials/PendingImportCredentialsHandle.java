package com.google.android.gms.identitycredentials;

import X.C4158CoD;
import X.C7384Etj;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class PendingImportCredentialsHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PendingImportCredentialsHandle> CREATOR = C4158CoD.A03(64);
    public final PendingIntent A00;

    public PendingImportCredentialsHandle(PendingIntent pendingIntent) {
        C7384Etj.A0Y(pendingIntent, 0);
        this.A00 = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractSafeParcelable.A06(parcel, this.A00, i, AbstractSafeParcelable.A01(parcel));
    }
}
