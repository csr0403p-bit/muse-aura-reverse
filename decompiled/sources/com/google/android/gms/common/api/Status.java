package com.google.android.gms.common.api;

import X.AbstractC4100CmU;
import X.BV6;
import X.C4158CoD;
import X.C7392EuT;
import X.CS7;
import X.Co0;
import X.InterfaceC4391Cut;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class Status extends AbstractSafeParcelable implements InterfaceC4391Cut, ReflectedParcelable {
    public final int A00;
    public final PendingIntent A01;
    public final ConnectionResult A02;
    public final String A03;
    public static final Status A09 = new Status(-1, null);
    public static final Status A08 = new Status(0, null);
    public static final Status A07 = new Status(14, null);
    public static final Status A06 = new Status(8, null);
    public static final Status A0A = new Status(15, null);
    public static final Status A04 = new Status(16, null);
    public static final Status A0B = new Status(17, null);
    public static final Status A05 = new Status(18, null);
    public static final Parcelable.Creator<Status> CREATOR = C4158CoD.A03(22);

    public Status(int i, String str) {
        this(null, null, str, i);
    }

    @Override // X.InterfaceC4391Cut
    public final Status AL3() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.A00 == status.A00 && CS7.A01(this.A03, status.A03) && CS7.A01(this.A01, status.A01)) {
            return CS7.A00(this.A02, status.A02);
        }
        return false;
    }

    public final int hashCode() {
        return BV6.A0A(Integer.valueOf(this.A00), this.A03, this.A01, this.A02);
    }

    public final String toString() {
        C7392EuT c7392EuT = new C7392EuT(this);
        String strA00 = this.A03;
        if (strA00 == null) {
            strA00 = Co0.A00(this.A00);
        }
        c7392EuT.A00(strA00, "statusCode");
        c7392EuT.A00(this.A01, "resolution");
        return c7392EuT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA00 = AbstractC4100CmU.A00(parcel);
        AbstractC4100CmU.A06(parcel, 1, this.A00);
        AbstractC4100CmU.A0A(parcel, this.A03, 2);
        AbstractC4100CmU.A09(parcel, this.A01, 3, i);
        AbstractC4100CmU.A09(parcel, this.A02, 4, i);
        AbstractC4100CmU.A05(parcel, iA00);
    }

    public Status(PendingIntent pendingIntent, ConnectionResult connectionResult, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = pendingIntent;
        this.A02 = connectionResult;
    }
}
