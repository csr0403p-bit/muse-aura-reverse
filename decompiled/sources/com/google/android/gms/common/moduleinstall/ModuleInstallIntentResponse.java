package com.google.android.gms.common.moduleinstall;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class ModuleInstallIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallIntentResponse> CREATOR = C4158CoD.A03(35);
    public final PendingIntent A00;

    public ModuleInstallIntentResponse(PendingIntent pendingIntent) {
        this.A00 = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractSafeParcelable.A06(parcel, this.A00, i, AbstractC4100CmU.A00(parcel));
    }
}
