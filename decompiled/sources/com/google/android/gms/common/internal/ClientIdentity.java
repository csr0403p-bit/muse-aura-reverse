package com.google.android.gms.common.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import X.C60O;
import X.C60P;
import X.CS7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = C4158CoD.A03(24);
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ClientIdentity) {
                ClientIdentity clientIdentity = (ClientIdentity) obj;
                if (clientIdentity.A00 != this.A00 || !CS7.A01(clientIdentity.A01, this.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        String str = this.A01;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(i);
        return C60P.A1M(":", str, sbA0w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A00);
        AbstractC4100CmU.A0A(parcel, this.A01, 2);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public ClientIdentity(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
