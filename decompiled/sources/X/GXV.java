package X;

import android.media.AudioManager;

/* loaded from: classes6.dex */
public final class GXV implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioOutputManagerImpl$safeSetMode$runnable$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ GXE A01;
    public final /* synthetic */ boolean A02;

    public GXV(GXE gxe, int i, boolean z) {
        this.A01 = gxe;
        this.A00 = i;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GXE gxe;
        Integer num;
        try {
            gxe = this.A01;
            InterfaceC9648GXn interfaceC9648GXn = ((GX4) gxe).A09;
            int i = this.A00;
            Integer numValueOf = Integer.valueOf(i);
            interfaceC9648GXn.A8D("safeSetMode to %d", numValueOf);
            AudioManager audioManager = ((GX4) gxe).A04;
            int mode = audioManager.getMode();
            if (i != mode || (num = gxe.A01) == null || i != num.intValue()) {
                audioManager.setMode(i);
                gxe.A01 = numValueOf;
                if (gxe.aomSavedAudioMode == -2) {
                    gxe.aomSavedAudioMode = mode;
                }
            }
        } catch (Exception e) {
            gxe = this.A01;
            ((GX4) gxe).A09.AAr("RtcAudioOutputManager", "Failed to set audio mode", e, new Object[0]);
        }
        if (this.A02) {
            gxe.aomSavedAudioMode = -2;
        }
    }
}
