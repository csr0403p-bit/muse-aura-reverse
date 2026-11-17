package com.android.billingclient.api;

import X.EnumC9535GNn;
import X.EnumC9540GNw;
import X.G4i;
import X.GNK;
import X.GNM;
import X.GNT;
import X.GNr;
import X.GOW;
import android.os.IInterface;
import com.android.billingclient.s1;

/* loaded from: classes6.dex */
public final class y extends s1 implements IInterface {
    public final int A00;
    public final GNK A01;
    public final GOW A02;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        A01(r8, r5, r6, X.EnumC9535GNn.A0t, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r0 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f8, code lost:
    
        r0.A00(null, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        return true;
     */
    @Override // com.android.billingclient.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(android.os.Parcel r12, android.os.Parcel r13, int r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.y.A02(android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public y() {
        attachInterface(this, "com.android.vending.billing.IInAppBillingDelegateToBackendCallback");
    }

    public static void A01(GNM gnm, GNK gnk, EnumC9540GNw enumC9540GNw, EnumC9535GNn enumC9535GNn, int i) {
        ((GNT) gnk).A04(GNr.A00(gnm, enumC9540GNw, enumC9535GNn, G4i.A01, null), i);
    }

    public y(GNK gnk, GOW gow, int i) {
        this();
        this.A02 = gow;
        this.A01 = gnk;
        this.A00 = i;
    }
}
