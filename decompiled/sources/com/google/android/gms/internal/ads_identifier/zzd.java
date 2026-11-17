package com.google.android.gms.internal.ads_identifier;

import X.BV7;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class zzd implements IInterface, zzf {
    public final IBinder A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A00;
    }

    public zzd(IBinder iBinder) {
        this.A00 = iBinder;
    }

    public final Parcel A00(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                BV7.A1A(this.A00, parcel, parcelObtain, i);
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
