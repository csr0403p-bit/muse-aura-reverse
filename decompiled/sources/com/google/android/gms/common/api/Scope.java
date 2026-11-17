package com.google.android.gms.common.api;

import X.AbstractC4100CmU;
import X.C4158CoD;
import X.CRy;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = C4158CoD.A03(21);
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.A01.equals(((Scope) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A00);
        AbstractC4100CmU.A0A(parcel, this.A01, 2);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public Scope(int i, String str) {
        CRy.A07(str, "scopeUri must not be null or empty");
        this.A00 = i;
        this.A01 = str;
    }
}
