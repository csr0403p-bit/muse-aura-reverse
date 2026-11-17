package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV7;
import X.C4157CoC;
import X.C60O;
import X.InterfaceC3640Cav;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzn extends AbstractSafeParcelable implements InterfaceC3640Cav {
    public static final Parcelable.Creator<zzn> CREATOR = C4157CoC.A00(53);
    public final byte A00;
    public final byte A01;
    public final byte A02;
    public final byte A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            zzn zznVar = (zzn) obj;
            if (this.A04 != zznVar.A04 || this.A00 != zznVar.A00 || this.A01 != zznVar.A01 || this.A02 != zznVar.A02 || this.A03 != zznVar.A03 || !this.A05.equals(zznVar.A05)) {
                return false;
            }
            String str = this.A06;
            String str2 = zznVar.A06;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (!this.A07.equals(zznVar.A07) || !this.A08.equals(zznVar.A08) || !this.A09.equals(zznVar.A09)) {
                return false;
            }
            String str3 = this.A0A;
            String str4 = zznVar.A0A;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.A0B;
            String str6 = zznVar.A0B;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iA0I = (((((((((AnonymousClass005.A0I(this.A09, AnonymousClass005.A0I(this.A08, AnonymousClass005.A0I(this.A07, (((((this.A04 + 31) * 31) + this.A05.hashCode()) * 31) + BV7.A0I(this.A06)) * 31))) + BV7.A0I(this.A0A)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31;
        String str = this.A0B;
        return iA0I + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        int i = this.A04;
        String str = this.A05;
        String str2 = this.A06;
        byte b = this.A00;
        byte b2 = this.A01;
        byte b3 = this.A02;
        byte b4 = this.A03;
        String str3 = this.A0B;
        StringBuilder sbA0y = C60O.A0y("AncsNotificationParcelable{, id=", i);
        sbA0y.append(", appId='");
        sbA0y.append(str);
        sbA0y.append("', dateTime='");
        sbA0y.append(str2);
        sbA0y.append("', eventId=");
        sbA0y.append((int) b);
        sbA0y.append(", eventFlags=");
        sbA0y.append((int) b2);
        sbA0y.append(", categoryId=");
        sbA0y.append((int) b3);
        sbA0y.append(", categoryCount=");
        sbA0y.append((int) b4);
        sbA0y.append(", packageName='");
        sbA0y.append(str3);
        return AnonymousClass001.A0v("'}", sbA0y);
    }

    public zzn(String str, String str2, String str3, String str4, String str5, String str6, String str7, byte b, byte b2, byte b3, byte b4, int i) {
        this.A04 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A00 = b;
        this.A01 = b2;
        this.A02 = b3;
        this.A03 = b4;
        this.A0B = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 2, this.A04);
        String str = this.A05;
        AbstractC4100CmU.A0A(parcel, str, 3);
        AbstractC4100CmU.A0A(parcel, this.A06, 4);
        AbstractC4100CmU.A0A(parcel, this.A07, 5);
        AbstractC4100CmU.A0A(parcel, this.A08, 6);
        AbstractC4100CmU.A0A(parcel, this.A09, 7);
        String str2 = this.A0A;
        if (str2 == null) {
            str2 = str;
        }
        AbstractC4100CmU.A0A(parcel, str2, 8);
        byte b = this.A00;
        parcel.writeInt(262153);
        parcel.writeInt(b);
        byte b2 = this.A01;
        parcel.writeInt(262154);
        parcel.writeInt(b2);
        byte b3 = this.A02;
        parcel.writeInt(262155);
        parcel.writeInt(b3);
        byte b4 = this.A03;
        parcel.writeInt(262156);
        parcel.writeInt(b4);
        AbstractC4100CmU.A0A(parcel, this.A0B, 13);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
