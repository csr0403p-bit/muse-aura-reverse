package X;

import android.os.Trace;

/* loaded from: classes6.dex */
public final class GXY implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioProxy$setAudioOn$runnable$1";
    public final /* synthetic */ GXO A00;
    public final /* synthetic */ boolean A01;

    public GXY(GXO gxo, boolean z) {
        this.A00 = gxo;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GXO gxo = this.A00;
        boolean z = this.A01;
        AbstractC3136BzG.A00("AndroidAudioProxy.setAudioOn");
        try {
            if (gxo.A03 != z) {
                if (!gxo.A0J && !gxo.A0F) {
                    if (z) {
                        gxo.A0B.A02(false, gxo.A0G);
                    } else {
                        gxo.A0B.A01();
                    }
                }
                RunnableC9649GXo runnableC9649GXo = new RunnableC9649GXo(gxo, z);
                if (gxo.A01 != null) {
                    runnableC9649GXo.run();
                } else {
                    gxo.A0D.add(runnableC9649GXo);
                }
                gxo.A03 = z;
            }
        } finally {
            Trace.endSection();
        }
    }
}
