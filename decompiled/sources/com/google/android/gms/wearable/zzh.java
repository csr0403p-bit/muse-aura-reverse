package com.google.android.gms.wearable;

import X.AbstractC4100CmU;
import X.AbstractC4207CqC;
import X.C3cI;
import X.C4157CoC;
import X.C4386Cum;
import X.Cw3;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = C4157CoC.A00(61);
    public final int A00;
    public final Uri A01;

    public zzh(Uri uri, int i) {
        this.A01 = uri;
        this.A00 = i;
    }

    public final String toString() {
        String strA0Y = C3cI.A0Y(this);
        C4386Cum c4386Cum = new C4386Cum();
        Uri uri = this.A01;
        C4386Cum c4386Cum2 = new C4386Cum();
        c4386Cum.A00 = c4386Cum2;
        c4386Cum2.A01 = uri;
        c4386Cum2.A02 = "uri";
        String strValueOf = String.valueOf(this.A00);
        Cw3 cw3 = new Cw3();
        c4386Cum2.A00 = cw3;
        cw3.A01 = strValueOf;
        cw3.A02 = "filterType";
        return AbstractC4207CqC.A00(c4386Cum, strA0Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A09(parcel, this.A01, 1, i);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
