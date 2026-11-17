package com.android.billingclient;

import X.C3498CQv;
import android.os.Parcel;

/* loaded from: classes6.dex */
public final class d2 extends s1 {
    public final C3498CQv A00;

    @Override // com.android.billingclient.s1
    public final boolean A02(Parcel parcel, Parcel parcel2, int i) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        s1.A00(parcel);
        this.A00.A00(Integer.valueOf(i2));
        return true;
    }

    public d2(C3498CQv c3498CQv) {
        attachInterface(this, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
        this.A00 = c3498CQv;
    }
}
