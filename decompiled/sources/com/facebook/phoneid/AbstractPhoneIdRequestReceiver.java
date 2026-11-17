package com.facebook.phoneid;

import X.AbstractC6574EHs;
import X.BV5;
import X.BV6;
import X.C6572EHo;
import X.C7381Etf;
import X.EHg;
import X.EHj;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public abstract class AbstractPhoneIdRequestReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String creatorPackage;
        EHg eHg = AbstractC6574EHs.A00;
        C6572EHo c6572EHoA00 = eHg != null ? eHg.A00() : null;
        if (!BV5.A1Q(intent, "com.facebook.GET_PHONE_ID") || c6572EHoA00 == null) {
            return;
        }
        Bundle resultExtras = getResultExtras(true);
        C7381Etf c7381Etf = EHj.A01;
        try {
            resultExtras.setClassLoader(PendingIntent.class.getClassLoader());
            Parcelable parcelable = resultExtras.getParcelable("auth");
            if (!(parcelable instanceof PendingIntent) || (creatorPackage = ((PendingIntent) parcelable).getCreatorPackage()) == null) {
                return;
            }
            if (EHj.A00(context, creatorPackage)) {
                Bundle bundleA0N = BV6.A0N();
                bundleA0N.putLong("timestamp", c6572EHoA00.A00);
                bundleA0N.putString("origin", c6572EHoA00.A02);
                setResult(-1, c6572EHoA00.A01, bundleA0N);
            }
        } catch (RuntimeException unused) {
        }
    }
}
