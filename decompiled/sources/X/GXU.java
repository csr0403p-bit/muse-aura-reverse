package X;

import android.media.AudioManager;

/* loaded from: classes6.dex */
public final class GXU implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioOutputManagerImplV2$safeSetMode$runnable$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ GXD A01;
    public final /* synthetic */ boolean A02;

    public GXU(GXD gxd, int i, boolean z) {
        this.A01 = gxd;
        this.A00 = i;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GXD gxd;
        Integer num;
        try {
            gxd = this.A01;
            InterfaceC9648GXn interfaceC9648GXn = ((GX4) gxd).A09;
            int i = this.A00;
            Integer numValueOf = Integer.valueOf(i);
            interfaceC9648GXn.A8D("safeSetMode to %d", numValueOf);
            AudioManager audioManager = ((GX4) gxd).A04;
            int mode = audioManager.getMode();
            if (i != mode || (num = gxd.A05) == null || i != num.intValue()) {
                audioManager.setMode(i);
                gxd.A05 = numValueOf;
                if (gxd.aomSavedAudioMode == -2) {
                    gxd.aomSavedAudioMode = mode;
                }
            }
        } catch (Exception e) {
            gxd = this.A01;
            ((GX4) gxd).A09.AAr("RtcAudioOutputManagerImplV2", "Failed to set audio mode", e, new Object[0]);
        }
        if (this.A02) {
            gxd.aomSavedAudioMode = -2;
        }
    }
}
