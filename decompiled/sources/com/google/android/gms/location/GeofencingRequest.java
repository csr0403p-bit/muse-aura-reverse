package com.google.android.gms.location;

import X.AbstractC4100CmU;
import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = C4158CoD.A03(98);
    public final int A00;
    public final String A01;
    public final List A02;

    public final String toString() {
        String strValueOf = String.valueOf(this.A02);
        int iA04 = BV5.A04(strValueOf);
        int i = this.A00;
        StringBuilder sbA0p = BV4.A0p(iA04 + 45 + BV7.A03(i) + 1);
        sbA0p.append("GeofencingRequest[geofences=");
        sbA0p.append(strValueOf);
        sbA0p.append(", initialTrigger=");
        sbA0p.append(i);
        return AnonymousClass001.A0v("]", sbA0p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A02;
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0C(parcel, list, 1);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A0A(parcel, this.A01, 4);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public GeofencingRequest(List list, int i, String str) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = str;
    }
}
