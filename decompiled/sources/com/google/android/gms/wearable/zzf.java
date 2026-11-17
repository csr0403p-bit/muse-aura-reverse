package com.google.android.gms.wearable;

import X.AbstractC4100CmU;
import X.AbstractC4207CqC;
import X.C3cI;
import X.C4157CoC;
import X.C4386Cum;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = C4157CoC.A00(60);
    public final List A00;
    public final List A01;
    public final List A02;

    public zzf(List list, List list2, List list3) {
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
    }

    public final String toString() {
        String strA0Y = C3cI.A0Y(this);
        C4386Cum c4386Cum = new C4386Cum();
        List list = this.A00;
        C4386Cum c4386Cum2 = new C4386Cum();
        c4386Cum.A00 = c4386Cum2;
        c4386Cum2.A01 = list;
        c4386Cum2.A02 = "allowedDataItemFilters";
        List list2 = this.A01;
        C4386Cum c4386Cum3 = new C4386Cum();
        c4386Cum2.A00 = c4386Cum3;
        c4386Cum3.A01 = list2;
        c4386Cum3.A02 = "allowedCapabilities";
        List list3 = this.A02;
        C4386Cum c4386Cum4 = new C4386Cum();
        c4386Cum3.A00 = c4386Cum4;
        c4386Cum4.A01 = list3;
        c4386Cum4.A02 = "allowedPackages";
        return AbstractC4207CqC.A00(c4386Cum, strA0Y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0C(parcel, this.A00, 1);
        AbstractC4100CmU.A0B(parcel, this.A01, 2);
        AbstractC4100CmU.A0B(parcel, this.A02, 3);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
