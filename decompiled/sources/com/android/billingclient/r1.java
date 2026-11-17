package com.android.billingclient;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes6.dex */
public abstract class r1 implements IInterface {
    public final IBinder A00;
    public final String A01;

    public final void A03(Parcel parcel, int i) {
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

    public r1(String str, IBinder iBinder) {
        this.A00 = iBinder;
        this.A01 = str;
    }

    public static int A00(Parcel parcel, r1 r1Var, int i) {
        Parcel parcelA02 = r1Var.A02(parcel, i);
        int i2 = parcelA02.readInt();
        parcelA02.recycle();
        return i2;
    }

    public static Parcel A01(r1 r1Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(r1Var.A01);
        return parcelObtain;
    }

    public final Parcel A02(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.A00.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
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
