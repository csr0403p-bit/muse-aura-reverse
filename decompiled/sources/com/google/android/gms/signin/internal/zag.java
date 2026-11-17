package com.google.android.gms.signin.internal;

import X.AbstractC4100CmU;
import X.C4157CoC;
import X.InterfaceC4391Cut;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zag extends AbstractSafeParcelable implements InterfaceC4391Cut {
    public static final Parcelable.Creator<zag> CREATOR = C4157CoC.A00(0);
    public final String A00;
    public final List A01;

    @Override // X.InterfaceC4391Cut
    public final Status AL3() {
        return this.A00 != null ? Status.A08 : Status.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A01;
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0B(parcel, list, 1);
        AbstractC4100CmU.A0A(parcel, this.A00, 2);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public zag(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
