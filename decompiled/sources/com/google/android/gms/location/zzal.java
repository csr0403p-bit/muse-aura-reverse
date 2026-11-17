package com.google.android.gms.location;

import X.AbstractC4100CmU;
import X.BV4;
import X.BV6;
import X.BV7;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes5.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = C4158CoD.A03(96);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzal)) {
            return false;
        }
        zzal zzalVar = (zzal) obj;
        return this.A00 == zzalVar.A00 && this.A01 == zzalVar.A01 && this.A02 == zzalVar.A02 && this.A03 == zzalVar.A03;
    }

    public final int hashCode() {
        return BV6.A0A(Integer.valueOf(this.A01), Integer.valueOf(this.A00), Long.valueOf(this.A03), Long.valueOf(this.A02));
    }

    public final String toString() {
        int i = this.A00;
        int iA03 = BV7.A03(i);
        int i2 = this.A01;
        int iA032 = BV7.A03(i2);
        long j = this.A03;
        int length = String.valueOf(j).length();
        long j2 = this.A02;
        StringBuilder sbA0p = BV4.A0p(iA03 + 50 + iA032 + 18 + length + 17 + String.valueOf(j2).length());
        sbA0p.append("NetworkLocationStatus: Wifi status: ");
        sbA0p.append(i);
        sbA0p.append(" Cell status: ");
        sbA0p.append(i2);
        sbA0p.append(" elapsed time NS: ");
        sbA0p.append(j);
        return BV7.A0z(" system time ms: ", sbA0p, j2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A00);
        AbstractC4100CmU.A06(parcel, 2, this.A01);
        AbstractC4100CmU.A07(parcel, 3, this.A02);
        AbstractC4100CmU.A07(parcel, 4, this.A03);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public zzal(int i, int i2, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A03 = j2;
    }
}
