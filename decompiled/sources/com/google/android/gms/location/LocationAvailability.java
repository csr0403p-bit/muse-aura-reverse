package com.google.android.gms.location;

import X.AbstractC4100CmU;
import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.C4158CoD;
import X.C8j3;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final LocationAvailability A05 = new LocationAvailability(null, 0, 1, 1, 0);
    public static final LocationAvailability A06 = new LocationAvailability(null, 1000, 1, 1, 0);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = C4158CoD.A03(93);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final zzal[] A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailability)) {
            return false;
        }
        LocationAvailability locationAvailability = (LocationAvailability) obj;
        return this.A01 == locationAvailability.A01 && this.A02 == locationAvailability.A02 && this.A03 == locationAvailability.A03 && this.A00 == locationAvailability.A00 && Arrays.equals(this.A04, locationAvailability.A04);
    }

    public final int hashCode() {
        return Arrays.hashCode(BV5.A1Y(this.A00));
    }

    public final String toString() {
        boolean zA1T = C8j3.A1T(this.A00, 1000);
        StringBuilder sbA0p = BV4.A0p(String.valueOf(zA1T).length() + 22);
        sbA0p.append("LocationAvailability[");
        sbA0p.append(zA1T);
        return AnonymousClass001.A0v("]", sbA0p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A01);
        AbstractC4100CmU.A06(parcel, 2, this.A02);
        AbstractC4100CmU.A07(parcel, 3, this.A03);
        int i2 = this.A00;
        AbstractC4100CmU.A06(parcel, 4, i2);
        AbstractC4100CmU.A0E(parcel, this.A04, 5, i);
        AbstractC4100CmU.A08(parcel, 6, C8j3.A1T(i2, 1000));
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public LocationAvailability(zzal[] zzalVarArr, int i, int i2, int i3, long j) {
        this.A00 = i < 1000 ? 0 : 1000;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A04 = zzalVarArr;
    }
}
