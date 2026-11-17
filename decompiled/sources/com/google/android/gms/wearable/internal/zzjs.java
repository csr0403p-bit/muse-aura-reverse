package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzjs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjs> CREATOR = C4157CoC.A00(37);
    public final int A00;
    public final int A01;
    public final String A02;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                zzjs zzjsVar = (zzjs) obj;
                if (this.A00 != zzjsVar.A00 || this.A01 != zzjsVar.A01 || ((str = this.A02) != (str2 = zzjsVar.A02) && (str == null || !str.equals(str2)))) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0E(this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
    }

    public final String toString() {
        return String.format(Locale.US, "WebIconParcelable{%dx%d - %s}", Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02);
    }

    public zzjs(String str, int i, int i2) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A02, 1);
        AbstractC4100CmU.A06(parcel, 2, this.A00);
        AbstractC4100CmU.A06(parcel, 3, this.A01);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
