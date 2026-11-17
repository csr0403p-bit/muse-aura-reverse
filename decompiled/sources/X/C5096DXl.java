package X;

import android.telephony.TelephonyCallback;

/* renamed from: X.DXl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5096DXl extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C5103DXu A00;

    public C5096DXl(C5103DXu c5103DXu) {
        this.A00 = c5103DXu;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo r5) {
        /*
            r4 = this;
            int r3 = r5.getOverrideNetworkType()
            r0 = 3
            r2 = 5
            if (r3 == r0) goto Le
            r0 = 4
            if (r3 == r0) goto Le
            r1 = 0
            if (r3 != r2) goto Lf
        Le:
            r1 = 1
        Lf:
            X.DXu r0 = r4.A00
            if (r1 == 0) goto L15
            r2 = 10
        L15:
            X.C5103DXu.A03(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5096DXl.onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo):void");
    }
}
