package com.google.android.gms.common.internal;

import android.os.IBinder;

/* loaded from: classes5.dex */
public final class zzad implements IGmsServiceBroker {
    public final IBinder A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A00;
    }

    public zzad(IBinder iBinder) {
        this.A00 = iBinder;
    }
}
