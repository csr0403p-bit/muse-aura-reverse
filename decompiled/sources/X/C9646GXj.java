package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.GXj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9646GXj extends PhoneStateListener {
    public final /* synthetic */ GXE A00;

    public C9646GXj(GXE gxe) {
        this.A00 = gxe;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        GXE gxe = this.A00;
        if (i != 0) {
            if (i == 1) {
                gxe.A04 = gxe.A07.A03();
                return;
            } else if (i != 2) {
                return;
            }
        } else if (!gxe.A04) {
            return;
        } else {
            gxe.A0c(GXX.A02);
        }
        gxe.A04 = false;
    }
}
