package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4158CoD;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntry> CREATOR = C4158CoD.A03(42);
    public final int A00;
    public final short A01;
    public final short A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.A00 == uvmEntry.A00 && this.A01 == uvmEntry.A01 && this.A02 == uvmEntry.A02;
    }

    public final int hashCode() {
        return BV7.A0E(Integer.valueOf(this.A00), Short.valueOf(this.A01), Short.valueOf(this.A02));
    }

    public UvmEntry(int i, short s, short s2) {
        this.A00 = i;
        this.A01 = s;
        this.A02 = s2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        short s = this.A01;
        parcel.writeInt(262146);
        parcel.writeInt(s);
        short s2 = this.A02;
        parcel.writeInt(262147);
        parcel.writeInt(s2);
        AbstractC4100CmU.A05(parcel, iA00);
    }
}
