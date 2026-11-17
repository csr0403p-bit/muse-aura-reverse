package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = C4157CoC.A00(6);
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (!this.A00.equals(zzbVar.A00) || this.A01 != zzbVar.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(this.A00, Boolean.valueOf(this.A01));
    }

    public zzb(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0A(parcel, this.A00, 1);
        AbstractC4100CmU.A08(parcel, 2, this.A01);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
