package com.google.android.gms.signin.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import X.InterfaceC4391Cut;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zaa extends AbstractSafeParcelable implements InterfaceC4391Cut {
    public static final Parcelable.Creator<zaa> CREATOR = C4158CoD.A03(99);
    public int A00;
    public Intent A01;
    public final int A02;

    public zaa() {
        this(2, 0, null);
    }

    @Override // X.InterfaceC4391Cut
    public final Status AL3() {
        return this.A00 == 0 ? Status.A08 : Status.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A02);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractSafeParcelable.A07(parcel, this.A01, i, iA02);
    }

    public zaa(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }
}
