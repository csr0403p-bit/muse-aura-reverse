package com.facebook.phoneid;

import X.EHl;
import X.EHm;
import android.content.BroadcastReceiver;

/* loaded from: classes5.dex */
public class PhoneIdResponseReceiver extends BroadcastReceiver {
    public final EHm A00;
    public final EHl A01;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            X.EHl r7 = r8.A01
            long r0 = java.lang.System.currentTimeMillis()
            r7.A00 = r0
            int r1 = r8.getResultCode()
            r0 = -1
            r4 = 1
            if (r1 != r0) goto L46
            java.lang.String r6 = r8.getResultData()
            android.os.Bundle r5 = r8.getResultExtras(r4)
            if (r5 == 0) goto L46
            java.lang.String r2 = "timestamp"
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r5.getLong(r2, r0)
            java.lang.String r0 = "origin"
            java.lang.String r1 = r5.getString(r0)
            X.EHo r0 = new X.EHo
            r0.<init>(r6, r2, r1)
            r7.A01 = r0
            X.EHm r0 = r8.A00
            r0.A00(r7)
        L38:
            X.EHm r0 = r8.A00
            X.EHp r0 = r0.A00
            X.EHn r0 = r0.A00
            X.EHg r0 = r0.A01
            com.facebook.aura.common.identifiers.fdid.AuraFdidStorage r0 = r0.A00
            r0.setPhoneIdSynced(r4)
            return
        L46:
            java.lang.Integer r0 = X.C79.A0C
            r7.A02 = r0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.phoneid.PhoneIdResponseReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public PhoneIdResponseReceiver(EHm eHm, EHl eHl) {
        this.A00 = eHm;
        this.A01 = eHl;
    }
}
