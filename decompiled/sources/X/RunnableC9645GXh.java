package X;

/* renamed from: X.GXh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC9645GXh implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioOutputManagerImpl$turnOnVideoSpeakerphone$runnable$1";
    public final /* synthetic */ GXE A00;

    public RunnableC9645GXh(GXE gxe) {
        this.A00 = gxe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GXE gxe = this.A00;
        if (!gxe.A0b() && !gxe.A0Z() && !gxe.aomIsHeadsetAttached) {
            gxe.A0c(GXX.A05);
        }
        gxe.aomShouldSpeakerOnHeadsetUnplug = true;
    }
}
