package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC4100CmU;
import X.BV7;
import X.C4158CoD;
import X.CS7;
import X.DA8;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = C4158CoD.A03(45);
    public final DA8 A00;
    public final DA8 A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        if (CS7.A01(this.A00, zzfVar.A00)) {
            return CS7.A00(this.A01, zzfVar.A01);
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0D(this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        DA8 da8 = this.A00;
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A0D(parcel, da8 == null ? null : da8.A04(), 1);
        DA8 da82 = this.A01;
        AbstractC4100CmU.A0D(parcel, da82 != null ? da82.A04() : null, 2);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public zzf(DA8 da8, DA8 da82) {
        this.A00 = da8;
        this.A01 = da82;
    }
}
