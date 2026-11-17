package com.google.android.gms.internal.location;

import X.AbstractC4100CmU;
import X.C4158CoD;
import X.InterfaceC4391Cut;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzl extends AbstractSafeParcelable implements InterfaceC4391Cut {
    public static final zzl A01 = new zzl(Status.A08);
    public static final Parcelable.Creator<zzl> CREATOR = C4158CoD.A03(76);
    public final Status A00;

    @Override // X.InterfaceC4391Cut
    public final Status AL3() {
        return this.A00;
    }

    public zzl(Status status) {
        this.A00 = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractSafeParcelable.A06(parcel, this.A00, i, AbstractC4100CmU.A00(parcel));
    }
}
