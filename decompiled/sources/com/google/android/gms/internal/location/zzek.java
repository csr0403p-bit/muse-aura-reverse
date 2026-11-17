package com.google.android.gms.internal.location;

import X.AbstractC4100CmU;
import X.AnonymousClass005;
import X.BV4;
import X.BV7;
import X.C4158CoD;
import X.C60O;
import X.C60P;
import X.F0V;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzek extends AbstractSafeParcelable implements F0V {
    public static final Parcelable.Creator<zzek> CREATOR = C4158CoD.A03(73);
    public final String A00;
    public final double A01;
    public final double A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final short A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzek) {
                zzek zzekVar = (zzek) obj;
                if (this.A03 != zzekVar.A03 || this.A01 != zzekVar.A01 || this.A02 != zzekVar.A02 || this.A08 != zzekVar.A08 || this.A04 != zzekVar.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.A01);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.A02);
        return ((AnonymousClass005.A02((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31, this.A03) + this.A08) * 31) + this.A04;
    }

    public final String toString() {
        short s = this.A08;
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s != -1 ? s != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID", this.A00.replaceAll("\\p{C}", HatchOpenGraphRepository.UNKNOWN_HOST), Integer.valueOf(this.A04), Double.valueOf(this.A01), Double.valueOf(this.A02), Float.valueOf(this.A03), Integer.valueOf(this.A05 / 1000), Integer.valueOf(this.A06), Long.valueOf(this.A07));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, str, 1);
        AbstractC4100CmU.A07(parcel, 2, this.A07);
        short s = this.A08;
        parcel.writeInt(262147);
        parcel.writeInt(s);
        double d = this.A01;
        parcel.writeInt(524292);
        parcel.writeDouble(d);
        double d2 = this.A02;
        parcel.writeInt(524293);
        parcel.writeDouble(d2);
        AbstractC4100CmU.A04(parcel, this.A03, 6);
        AbstractC4100CmU.A06(parcel, 7, this.A04);
        AbstractC4100CmU.A06(parcel, 8, this.A05);
        AbstractC4100CmU.A06(parcel, 9, this.A06);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public zzek(String str, double d, double d2, float f, int i, int i2, int i3, long j, short s) {
        if (str == null || str.length() > 100) {
            String.valueOf(str);
            throw C60O.A0i("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f <= 0.0f) {
            StringBuilder sbA0p = BV4.A0p(String.valueOf(f).length() + 16);
            sbA0p.append("invalid radius: ");
            sbA0p.append(f);
            throw C60O.A0i(sbA0p.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            StringBuilder sbA0p2 = BV4.A0p(String.valueOf(d).length() + 18);
            sbA0p2.append("invalid latitude: ");
            sbA0p2.append(d);
            throw C60O.A0i(sbA0p2.toString());
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sbA0p3 = BV4.A0p(String.valueOf(d2).length() + 19);
            sbA0p3.append("invalid longitude: ");
            sbA0p3.append(d2);
            throw C60O.A0i(sbA0p3.toString());
        }
        int i4 = i & 7;
        if (i4 == 0) {
            throw C60O.A0i(C60P.A1O("No supported transition specified: ", BV4.A0p(BV7.A03(i) + 35), i));
        }
        this.A08 = s;
        this.A00 = str;
        this.A01 = d;
        this.A02 = d2;
        this.A03 = f;
        this.A07 = j;
        this.A04 = i4;
        this.A05 = i2;
        this.A06 = i3;
    }
}
