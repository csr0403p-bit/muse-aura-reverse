package com.google.android.gms.identitycredentials;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class CredentialOption extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialOption> CREATOR = C4158CoD.A03(58);
    public final Bundle A00;
    public final Bundle A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CredentialOption(android.os.Bundle r2, android.os.Bundle r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r1 = this;
            X.AnonymousClass005.A17(r4, r2, r3, r5, r6)
            r0 = 5
            X.C7384Etj.A0Y(r7, r0)
            r1.<init>()
            r1.A05 = r4
            r1.A01 = r2
            r1.A00 = r3
            r1.A03 = r5
            r1.A04 = r6
            r1.A02 = r7
            boolean r0 = X.C7BY.A0j(r6)
            r2 = 1
            if (r0 != 0) goto L24
            boolean r0 = X.C7BY.A0j(r7)
            r1 = 1
            if (r0 == 0) goto L25
        L24:
            r1 = 0
        L25:
            boolean r0 = X.C7BY.A0j(r4)
            if (r0 != 0) goto L7a
            int r0 = r6.length()
            if (r0 != 0) goto L7a
            int r0 = r7.length()
            if (r0 != 0) goto L7a
        L37:
            if (r1 != 0) goto L7c
            if (r2 != 0) goto L7c
            int r1 = X.BV5.A04(r4)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r2 = r1 + 31
            int r1 = r0.length()
            java.lang.String r0 = java.lang.String.valueOf(r7)
            int r2 = r2 + r1
            int r1 = r2 + 19
            int r0 = r0.length()
            int r1 = r1 + r0
            int r0 = r1 + 69
            java.lang.StringBuilder r1 = X.BV4.A0p(r0)
            java.lang.String r0 = "Either type: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", or requestType: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " and protocolType: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " must be specified, but at least one contains an invalid blank value."
            java.lang.IllegalArgumentException r0 = X.C8j3.A0w(r0, r1)
            throw r0
        L7a:
            r2 = 0
            goto L37
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.identitycredentials.CredentialOption.<init>(android.os.Bundle, android.os.Bundle, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA01 = AbstractSafeParcelable.A01(parcel);
        AbstractC4100CmU.A0A(parcel, this.A05, 1);
        AbstractC4100CmU.A02(this.A01, parcel, 2);
        AbstractC4100CmU.A02(this.A00, parcel, 3);
        AbstractC4100CmU.A0A(parcel, this.A03, 4);
        AbstractC4100CmU.A0A(parcel, this.A04, 5);
        AbstractC4100CmU.A0A(parcel, this.A02, 6);
        AbstractC4100CmU.A05(parcel, iA01);
    }
}
