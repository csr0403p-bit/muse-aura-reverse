package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public abstract class zza implements IInterface {
    public final IBinder A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A00;
    }

    public zza(IBinder iBinder) {
        this.A00 = iBinder;
    }
}
