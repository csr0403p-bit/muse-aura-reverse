package com.android.billingclient;

import X.BV6;
import X.BV8;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public abstract class s1 extends Binder implements IInterface {
    public abstract boolean A02(Parcel parcel, Parcel parcel2, int i);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public static final void A00(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw BV8.A0U(iDataAvail);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BV6.A0y(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return A02(parcel, parcel2, i);
    }
}
