package com.google.android.gms.wearable.internal;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4157CoC;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = C4157CoC.A00(57);
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzx) {
                zzx zzxVar = (zzx) obj;
                if (this.A00 != zzxVar.A00 || this.A01 != zzxVar.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0D(Integer.valueOf(this.A00), Boolean.valueOf(this.A01));
    }

    public zzx(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A08(parcel, 2, this.A01);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
