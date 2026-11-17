package com.google.android.gms.internal.common;

import X.BV7;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes5.dex */
public abstract class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A00;
    }

    public zza(String str, IBinder iBinder) {
        this.A00 = iBinder;
        this.A01 = str;
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
