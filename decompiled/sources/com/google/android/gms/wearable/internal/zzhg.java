package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV7;
import X.C3cI;
import X.C4157CoC;
import X.InterfaceC3641Caw;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzhg extends AbstractSafeParcelable implements InterfaceC3641Caw {
    public static final Parcelable.Creator<zzhg> CREATOR = C4157CoC.A00(41);
    public final String A00;
    public final boolean A01;
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (obj instanceof zzhg) {
            return ((zzhg) obj).A00.equals(this.A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A03;
        String str2 = this.A00;
        int i = this.A02;
        boolean z = this.A01;
        StringBuilder sbA0x = C3cI.A0x("Node{", str);
        sbA0x.append(", id=");
        sbA0x.append(str2);
        sbA0x.append(", hops=");
        sbA0x.append(i);
        sbA0x.append(", isNearby=");
        sbA0x.append(z);
        return BV7.A11(sbA0x);
    }

    public zzhg(String str, String str2, int i, boolean z) {
        this.A00 = str;
        this.A03 = str2;
        this.A02 = i;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A00, 2);
        AbstractC4100CmU.A0A(parcel, this.A03, 3);
        AbstractC4100CmU.A06(parcel, 4, this.A02);
        AbstractC4100CmU.A08(parcel, 5, this.A01);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
