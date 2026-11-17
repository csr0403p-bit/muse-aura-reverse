package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV7;
import X.C3cI;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = C4157CoC.A00(54);
    public final zzjs A00;
    public final zzu A01;
    public final Float A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public static /* synthetic */ boolean A00(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                zzq zzqVar = (zzq) obj;
                if (!A00(this.A03, zzqVar.A03) || !A00(this.A04, zzqVar.A04) || !A00(this.A00, zzqVar.A00) || !A00(this.A05, zzqVar.A05) || !A00(this.A06, zzqVar.A06) || !A00(this.A02, zzqVar.A02) || !A00(this.A01, zzqVar.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A04, this.A00, this.A05, this.A06, this.A02, this.A01});
    }

    public final String toString() {
        String str = this.A04;
        String str2 = this.A05;
        String str3 = this.A06;
        Float f = this.A02;
        String strValueOf = String.valueOf(this.A01);
        String str4 = this.A03;
        String strValueOf2 = String.valueOf(this.A00);
        StringBuilder sbA0x = C3cI.A0x("AppParcelable{title='", str);
        sbA0x.append("', developerName='");
        sbA0x.append(str2);
        sbA0x.append("', formattedPrice='");
        sbA0x.append(str3);
        sbA0x.append("', starRating=");
        sbA0x.append(f);
        sbA0x.append(", wearDetails=");
        sbA0x.append(strValueOf);
        sbA0x.append(", deepLinkUri='");
        sbA0x.append(str4);
        sbA0x.append("', icon=");
        sbA0x.append(strValueOf2);
        return BV7.A11(sbA0x);
    }

    public zzq(zzjs zzjsVar, zzu zzuVar, Float f, String str, String str2, String str3, String str4) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = zzjsVar;
        this.A05 = str3;
        this.A06 = str4;
        this.A02 = f;
        this.A01 = zzuVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A03, 1);
        AbstractC4100CmU.A0A(parcel, this.A04, 2);
        AbstractC4100CmU.A09(parcel, this.A00, 3, i);
        AbstractC4100CmU.A0A(parcel, this.A05, 4);
        AbstractC4100CmU.A0A(parcel, this.A06, 5);
        Float f = this.A02;
        if (f != null) {
            parcel.writeInt(262150);
            parcel.writeFloat(f.floatValue());
        }
        AbstractC4100CmU.A09(parcel, this.A01, 7, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
