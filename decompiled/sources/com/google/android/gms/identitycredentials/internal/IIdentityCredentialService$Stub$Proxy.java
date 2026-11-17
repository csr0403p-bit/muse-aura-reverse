package com.google.android.gms.identitycredentials.internal;

import X.BV7;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class IIdentityCredentialService$Stub$Proxy implements IInterface, IIdentityCredentialService {
    public final IBinder A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A00;
    }

    public IIdentityCredentialService$Stub$Proxy(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final void A00(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            BV7.A1A(this.A00, parcel, parcelObtain, i);
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
