package com.google.android.gms.identitycredentials;

import X.AbstractC4100CmU;
import X.C4158CoD;
import X.C60O;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class CreateCredentialHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateCredentialHandle> CREATOR = C4158CoD.A03(56);
    public final PendingIntent A00;
    public final CreateCredentialResponse A01;

    public CreateCredentialHandle(PendingIntent pendingIntent, CreateCredentialResponse createCredentialResponse) {
        this.A00 = pendingIntent;
        this.A01 = createCredentialResponse;
        if (pendingIntent == null && createCredentialResponse == null) {
            throw C60O.A0i("pendingIntent or createCredentialResponse must be specified.");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA01 = AbstractSafeParcelable.A01(parcel);
        AbstractC4100CmU.A09(parcel, this.A00, 1, i);
        AbstractC4100CmU.A09(parcel, this.A01, 2, i);
        AbstractC4100CmU.A05(parcel, iA01);
    }
}
