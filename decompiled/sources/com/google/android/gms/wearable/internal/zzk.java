package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.AnonymousClass001;
import X.C4157CoC;
import X.C60O;
import X.Cau;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzk extends AbstractSafeParcelable implements Cau {
    public static final Parcelable.Creator<zzk> CREATOR = C4157CoC.A00(52);
    public final byte A00;
    public final byte A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                zzk zzkVar = (zzk) obj;
                if (this.A00 != zzkVar.A00 || this.A01 != zzkVar.A01 || !this.A02.equals(zzkVar.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A00 + 31) * 31) + this.A01;
        return (i * 31) + this.A02.hashCode();
    }

    public final String toString() {
        byte b = this.A00;
        byte b2 = this.A01;
        String str = this.A02;
        StringBuilder sbA0y = C60O.A0y("AmsEntityUpdateParcelable{, mEntityId=", b);
        sbA0y.append(", mAttributeId=");
        sbA0y.append((int) b2);
        sbA0y.append(", mValue='");
        sbA0y.append(str);
        return AnonymousClass001.A0v("'}", sbA0y);
    }

    public zzk(String str, byte b, byte b2) {
        this.A00 = b;
        this.A01 = b2;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        byte b = this.A00;
        parcel.writeInt(262146);
        parcel.writeInt(b);
        byte b2 = this.A01;
        parcel.writeInt(262147);
        parcel.writeInt(b2);
        AbstractC4100CmU.A0A(parcel, this.A02, 4);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
