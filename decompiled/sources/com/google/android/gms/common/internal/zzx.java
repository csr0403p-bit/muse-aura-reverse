package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

/* loaded from: classes5.dex */
public final class zzx extends zza implements ICancelToken {
    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.A01);
        try {
            this.A00.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
