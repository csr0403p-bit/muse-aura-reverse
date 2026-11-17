package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class zzbm implements IInterface, zzbo {
    public final IBinder A00;

    public final void A00(Parcel parcel, int i) {
        try {
            this.A00.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A00;
    }

    public zzbm(IBinder iBinder) {
        this.A00 = iBinder;
    }
}
