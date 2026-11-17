package com.google.android.gms.internal.location;

import X.BV7;
import X.Cpe;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public abstract class zza implements IInterface {
    public final String A00;
    public final IBinder A01;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A01;
    }

    public zza(String str, IBinder iBinder) {
        this.A01 = iBinder;
        this.A00 = str;
    }

    public static Parcel A00(Parcelable parcelable, zza zzaVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(zzaVar.A00);
        Cpe.A01(parcelObtain, parcelable);
        return parcelObtain;
    }

    public final Parcel A01(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                BV7.A1A(this.A01, parcel, parcelObtain, i);
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void A02(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            BV7.A1A(this.A01, parcel, parcelObtain, i);
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
