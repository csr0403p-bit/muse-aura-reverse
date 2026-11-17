package X;

import android.os.Trace;

/* renamed from: X.GXd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9642GXd implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioProxy$setIsCallActive$runnable$1";
    public final /* synthetic */ GXO A00;
    public final /* synthetic */ boolean A01;

    public RunnableC9642GXd(GXO gxo, boolean z) {
        this.A01 = z;
        this.A00 = gxo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        GXO gxo = this.A00;
        AbstractC3136BzG.A00("AndroidAudioProxy.setIsCallActive");
        try {
            if (z != gxo.A04) {
                if (!z) {
                    gxo.A05 = false;
                    if (!gxo.A0J && !gxo.A0F) {
                        gxo.A0B.A01.A0S();
                    }
                }
                gxo.A04 = z;
            }
        } finally {
            Trace.endSection();
        }
    }
}
