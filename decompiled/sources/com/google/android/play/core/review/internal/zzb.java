package com.google.android.play.core.review.internal;

import X.BV4;
import X.BV6;
import X.BV8;
import X.CKV;
import X.CKf;
import X.CSE;
import android.app.PendingIntent;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzh;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BV6.A0y(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        zzg zzgVar = (zzg) this;
        if (i != 2) {
            return false;
        }
        BaseBundle baseBundle = (BaseBundle) BV8.A0V(parcel, Bundle.CREATOR);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw BV8.A0U(iDataAvail);
        }
        zzh zzhVar = (zzh) zzgVar;
        CKV ckv = zzhVar.A02.A00;
        if (ckv != null) {
            CSE cse = zzhVar.A00;
            Object obj = ckv.A07;
            synchronized (obj) {
                ckv.A0A.remove(cse);
            }
            synchronized (obj) {
                AtomicInteger atomicInteger = ckv.A0B;
                if (atomicInteger.get() <= 0 || atomicInteger.decrementAndGet() <= 0) {
                    ckv.A01().post(new CKf(ckv));
                } else {
                    ckv.A06.A00("Leaving the connection open for other ongoing calls.", BV4.A1W());
                }
            }
        }
        zzhVar.A01.A00("onGetLaunchReviewFlowInfo", BV4.A1W());
        PendingIntent pendingIntent = (PendingIntent) baseBundle.get("confirmation_intent");
        boolean z = baseBundle.getBoolean("is_review_no_op");
        CSE cse2 = zzhVar.A00;
        cse2.A00.A0H(new zza(pendingIntent, z));
        return true;
    }
}
