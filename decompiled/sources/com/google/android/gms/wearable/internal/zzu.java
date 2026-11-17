package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4157CoC;
import X.C60O;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = C4157CoC.A00(56);
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                zzu zzuVar = (zzu) obj;
                if (this.A01 != zzuVar.A01 || ((list = this.A00) != (list2 = zzuVar.A00) && (list == null || !list.equals(list2)))) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(Boolean.valueOf(this.A01), this.A00);
    }

    public final String toString() {
        boolean z = this.A01;
        String strValueOf = String.valueOf(this.A00);
        StringBuilder sbA10 = C60O.A10("AppWearDetailsParcelable{isWatchface=", z);
        sbA10.append(", watchfaceCategories=");
        sbA10.append(strValueOf);
        return BV7.A11(sbA10);
    }

    public zzu(boolean z, List list) {
        this.A01 = z;
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A08(parcel, 1, this.A01);
        AbstractC4100CmU.A0B(parcel, this.A00, 2);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
