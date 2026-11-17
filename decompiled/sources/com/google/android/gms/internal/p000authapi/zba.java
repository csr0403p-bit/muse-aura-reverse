package com.google.android.gms.internal.p000authapi;

import X.BV7;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public abstract class zba implements IInterface {
    public final String A00;
    public final IBinder A01;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A01;
    }

    public zba(String str, IBinder iBinder) {
        this.A01 = iBinder;
        this.A00 = str;
    }

    public static Parcel A00(Parcelable parcelable, zba zbaVar, zbb zbbVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(zbaVar.A00);
        parcelObtain.writeStrongBinder(zbbVar.asBinder());
        if (parcelable == null) {
            parcelObtain.writeInt(0);
            return parcelObtain;
        }
        parcelObtain.writeInt(1);
        parcelable.writeToParcel(parcelObtain, 0);
        return parcelObtain;
    }

    public final void A01(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            BV7.A1A(this.A01, parcel, parcelObtain, i);
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
