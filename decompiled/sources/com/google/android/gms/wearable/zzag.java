package com.google.android.gms.wearable;

import X.BV4;
import X.BV6;
import X.CRy;
import X.CUF;
import X.CaR;
import X.CaS;
import X.Cao;
import X.FGI;
import android.app.AppOpsManager;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.zzfn;
import com.google.android.gms.wearable.internal.zzfr;

/* loaded from: classes5.dex */
public final class zzag extends zzfr {
    public volatile int A00 = -1;
    public final /* synthetic */ Cao A01;

    public static final boolean A03(zzag zzagVar, Object obj, Runnable runnable, String str) {
        AppOpsManager appOpsManager;
        if (BV4.A1U("WearableLS")) {
            BV6.A1K("%s: %s %s", "WearableLS", new Object[]{str, zzagVar.A01.zza.toString(), obj});
        }
        int callingUid = Binder.getCallingUid();
        if (callingUid != zzagVar.A00) {
            Cao cao = zzagVar.A01;
            byte[] bArr = CaR.A02;
            CRy.A03(cao);
            synchronized (CaR.class) {
                if (CaR.A01 == null) {
                    CaR.A01 = new CaR(cao);
                }
            }
            if (CaR.A01.A01()) {
                try {
                    appOpsManager = (AppOpsManager) CUF.A00(cao).A00.getSystemService("appops");
                } catch (SecurityException unused) {
                }
                if (appOpsManager == null) {
                    throw BV4.A0a("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(callingUid, "com.google.android.wearable.app.cn");
                zzagVar.A00 = callingUid;
            } else {
                if (!CaS.A00(cao, callingUid)) {
                    Log.e("WearableLS", FGI.A0H("Caller is not GooglePlayServices; caller UID: ", callingUid));
                    return false;
                }
                zzagVar.A00 = callingUid;
            }
        }
        Cao cao2 = zzagVar.A01;
        synchronized (cao2.zzf) {
            if (cao2.zzg) {
                return false;
            }
            cao2.zzb.post(runnable);
            return true;
        }
    }

    public static final void A02(zzfn zzfnVar, byte[] bArr, boolean z) {
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(zzfnVar.A01);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeByteArray(bArr);
            try {
                zzfnVar.A00.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e) {
            Log.e("WearableLS", "Failed to send a response back", e);
        }
    }
}
